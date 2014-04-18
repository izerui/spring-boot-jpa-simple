package com.myfeike.boot.controller;

import com.myfeike.boot.ObjectMapperFactory;
import com.myfeike.boot.model.*;
import com.myfeike.boot.service.DataService;
import com.myfeike.boot.service.SynUnitAndPersonService;
import ma.glasnost.orika.MapperFacade;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import static org.apache.commons.collections.CollectionUtils.find;

/**
 * Created by izerui.com on 14-4-16.
 */
@RestController
public class MyController {

    final String elementsFile = "c:/element.ser";
    final String personFile = "c:/person.ser";

    @Autowired
    DataService dataService;
    @Autowired
    SynUnitAndPersonService synUnitAndPersonService;

    @ResponseBody
    @RequestMapping("/element")
    public List<SysOrgElement> listElement(){
        return dataService.listElement();
    }

    @ResponseBody
    @RequestMapping("/person")
    public List<SysOrgPerson> listPerson(){
        return dataService.listPerson();
    }

    @RequestMapping("/element/save")
    public String listElementSave(){
        List<SysOrgElement> sysOrgElements = dataService.listElement();

        dataService.writeSerialize(sysOrgElements,elementsFile);

        return "success";
    }

    @RequestMapping("/person/save")
    public String listPersonSave(){
        List<SysOrgPerson> sysOrgPersons = dataService.listPerson();

        dataService.writeSerialize(sysOrgPersons,personFile);


        return "success";
    }

    @RequestMapping("/person/list")
    @ResponseBody
    public Integer persons(){
        List<SysOrgPerson> persons = dataService.deserializeList(personFile);
        return persons.size();
    }
    @RequestMapping("/element/list")
    @ResponseBody
    public Integer elements(){
       List<SysOrgElement> elements =dataService.deserializeList(elementsFile);
       return elements.size();
    }


    @RequestMapping("syn")
    public String syn(){
        List<SysOrgElement> elements = dataService.deserializeList(elementsFile);
        List<SysOrgPerson> persons = dataService.deserializeList(personFile);

        Set<Dept> depts = new HashSet<Dept>();
        Set<User> users = new HashSet<User>();

        MapperFacade mapper = ObjectMapperFactory.mapperFactory.getMapperFacade();
        for(SysOrgElement element : elements){

            switch (element.getFdOrgType()){
                case 1://机构
                    Dept org = mapper.map(element, Dept.class);
                    org.setOrgType(1);
                    depts.add(org);
                    break;
                case 2://部门
                    Dept dept = mapper.map(element, Dept.class);
                    depts.add(dept);
                    break;
                case 8://人员
                    User user = mapper.map(element,User.class);
                    final String userUnitId = user.getQq();

                    final String userId = user.getId();

                    List<Dept> deptList = new ArrayList<Dept>();
                    SysOrgElement deptElement = (SysOrgElement) find(elements, new Predicate() {
                        @Override
                        public boolean evaluate(Object object) {
                            SysOrgElement el = (SysOrgElement) object;
                            if (null != el.getFdId() && null != userUnitId && el.getFdId().equals(userUnitId)) {
                                return true;
                            }
                            return false;
                        }
                    });

                    deptList.add(mapper.map(deptElement,Dept.class));

                    user.setDeptList(deptList);



                    SysOrgPerson person = (SysOrgPerson) find(persons, new Predicate() {
                        @Override
                        public boolean evaluate(Object object) {
                            SysOrgPerson per = (SysOrgPerson) object;
                            if (null != per.getFdId() && null != userId&&per.getFdId().equals(userId)){
                                return true;
                            }
                            return false;
                        }
                    });

                    if(person.getFdPassword()==null||person.getFdPassword().equals("")){
                        continue;
                    }

                    mapper.map(person,user);

                    users.add(user);

                    break;
            }

        }

        synUnitAndPersonService.saveDept(depts);

        synUnitAndPersonService.saveUsers(users);
        return "success";
    }


}

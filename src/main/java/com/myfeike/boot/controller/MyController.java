package com.myfeike.boot.controller;

import com.myfeike.boot.model.MyTable;
import com.myfeike.boot.model.SysOrgElement;
import com.myfeike.boot.model.SysOrgPerson;
import com.myfeike.boot.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by izerui.com on 14-4-16.
 */
@RestController
public class MyController {

    @Autowired
    MyService myService;

    @ResponseBody
    @RequestMapping("/test")
    public List<MyTable> test(){
        myService.initData();
        return myService.listTest();
    }

    @ResponseBody
    @RequestMapping("/element")
    public List<SysOrgElement> listElement(){
        return myService.listElement();
    }

    @ResponseBody
    @RequestMapping("/person")
    public List<SysOrgPerson> listPerson(){
        return myService.listPerson();
    }

    @RequestMapping("/element/save")
    public String listElementSave(){
        List<SysOrgElement> sysOrgElements = myService.listElement();

        myService.writeSerialize(sysOrgElements,"c:/element.ser");

        return "success";
    }

    @RequestMapping("/person/save")
    public String listPersonSave(){
        List<SysOrgPerson> sysOrgPersons = myService.listPerson();

        myService.writeSerialize(sysOrgPersons,"c:/person.ser");


        return "success";
    }

    @RequestMapping("/person/list")
    @ResponseBody
    public List<SysOrgPerson> persons(){
        return   myService.deserializeList("c:/person.ser");
    }
    @RequestMapping("/element/list")
    @ResponseBody
    public List<SysOrgElement> elements(){
        return   myService.deserializeList("c:/element.ser");
    }



}

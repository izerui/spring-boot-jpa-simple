package com.myfeike.boot.service;

import com.myfeike.boot.model.Dept;
import com.myfeike.boot.model.User;
import com.myfeike.boot.repository.DeptRepository;
import com.myfeike.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by izerui.com on 14-4-18.
 */
@Component
@Transactional
public class SynUnitAndPersonService {


    @Autowired
    UserRepository userRepository;
    @Autowired
    DeptRepository deptRepository;


    public void saveUsers(Set<User> users){
        userRepository.save(users);
    }
    public void saveDept(Set<Dept> depts){
        deptRepository.save(depts);
        deptRepository.updateIsParentFalse();
        List<String> ds = deptRepository.findDepts();
        deptRepository.updateParent(ds);
    }

    public List<User> listUser(){
       return userRepository.findAll();
    }
    public List<Dept> listDept(){
       return deptRepository.findAll();
    }

}

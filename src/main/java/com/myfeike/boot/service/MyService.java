package com.myfeike.boot.service;

import com.myfeike.boot.model.MyTable;
import com.myfeike.boot.repository.MytableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by izerui.com on 14-4-16.
 */
@Component
public class MyService {
    @Autowired
    MytableRepository mytableRepository;

    public List<MyTable> list(){
       return mytableRepository.findAll();
    }

    public void initData() {
        MyTable m1 = initTestData();
        MyTable m2 = initTestData();
        MyTable m3 = initTestData();
        Set<MyTable> sets = new HashSet<MyTable>();
        sets.add(m1);
        sets.add(m2);
        sets.add(m3);
        mytableRepository.save(sets);
    }

    private MyTable initTestData(){
        MyTable m1 = new MyTable();
        m1.setId(UUID.randomUUID().toString());
        m1.setDeleted(false);
        m1.setName(UUID.randomUUID().toString());
        return m1;
    }
}

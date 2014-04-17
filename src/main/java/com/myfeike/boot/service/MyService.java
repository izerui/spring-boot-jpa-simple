package com.myfeike.boot.service;

import com.myfeike.boot.model.MyTable;
import com.myfeike.boot.model.SysOrgElement;
import com.myfeike.boot.model.SysOrgPerson;
import com.myfeike.boot.repository.MytableRepository;
import com.myfeike.boot.repository.SysOrgElementRepository;
import com.myfeike.boot.repository.SysOrgPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.*;
import java.util.*;

/**
 * Created by izerui.com on 14-4-16.
 */
@Service
public class MyService {
    @Autowired
    MytableRepository mytableRepository;

    @Autowired
    SysOrgElementRepository sysOrgElementRepository;

    @Autowired
    SysOrgPersonRepository sysOrgPersonRepository;

    public List<MyTable> listTest(){
       return mytableRepository.findAll();
    }

    public List<SysOrgElement> listElement(){
        return sysOrgElementRepository.findAll();
    }

    public List<SysOrgPerson> listPerson(){
        return sysOrgPersonRepository.findAll();
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


    public <T> List<T> deserializeList(String filename){

        try {
            InputStream fileInputStream = new FileInputStream(filename);
            ObjectInput input = new ObjectInputStream(fileInputStream);
            return (List<T>) input.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void writeSerialize(Object obj,String filename) {

        OutputStream fileOutPutStream = null;
        try {
            fileOutPutStream = new FileOutputStream(filename);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutPutStream);
            outputStream.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package com.myfeike.boot.service;

import com.myfeike.boot.model.MyTable;
import com.myfeike.boot.model.SysOrgElement;
import com.myfeike.boot.model.SysOrgPerson;
import com.myfeike.boot.repository.MytableRepository;
import com.myfeike.boot.repository.SysOrgElementRepository;
import com.myfeike.boot.repository.SysOrgPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;

/**
 * Created by izerui.com on 14-4-16.
 */
@Component
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


    public <T extends Serializable> List<T> deserializeList(String filename){
        try{
            InputStream file = new FileInputStream("quarks.ser");
            InputStream buffer = new BufferedInputStream(file);
            ObjectInput input = new ObjectInputStream (buffer);
            //deserialize the List
            return (List<T>)input.readObject();
        }catch (Exception e){

        }
        return null;
    }


    public void writeSerialize(Object obj,String filename) {

        try{
            OutputStream file = new FileOutputStream(filename);
            OutputStream buffer = new BufferedOutputStream(file);
            ObjectOutput output = new ObjectOutputStream(buffer);
            output.writeObject(obj);
        }catch (Exception e){

        }

    }
}

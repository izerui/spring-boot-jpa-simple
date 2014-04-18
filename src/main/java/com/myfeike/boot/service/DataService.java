package com.myfeike.boot.service;

import com.myfeike.boot.model.SysOrgElement;
import com.myfeike.boot.model.SysOrgPerson;
import com.myfeike.boot.repository.SysOrgElementRepository;
import com.myfeike.boot.repository.SysOrgPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

/**
 * Created by izerui.com on 14-4-16.
 */
@Service
public class DataService {

    @Autowired
    SysOrgElementRepository sysOrgElementRepository;

    @Autowired
    SysOrgPersonRepository sysOrgPersonRepository;


    public List<SysOrgElement> listElement(){
        return sysOrgElementRepository.findAll();
    }

    public List<SysOrgPerson> listPerson(){
        return sysOrgPersonRepository.findAll();
    }


    public <T>  List<T> deserializeList(String filename){
        List<T> result = null;
        try {
            InputStream fileInputStream = new FileInputStream(filename);
            ObjectInput input = new ObjectInputStream(fileInputStream);
            result = (List<T>) input.readObject();
            fileInputStream.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }


    public void writeSerialize(Object obj,String filename) {

        try {
            OutputStream fileOutPutStream = new FileOutputStream(filename);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutPutStream);
            outputStream.writeObject(obj);
            fileOutPutStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package com.myfeike.boot.service;

import com.myfeike.boot.model.MyTable;
import com.myfeike.boot.repository.MytableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
}

package com.myfeike.boot.controller;

import com.myfeike.boot.model.MyTable;
import com.myfeike.boot.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return myService.list();
    }

}

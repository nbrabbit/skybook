package com.rabbit.controller;

import com.rabbit.model.TestModel;
import com.rabbit.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("testCon")
    public TestModel testCon(){


        return testService.getData();
    }
}

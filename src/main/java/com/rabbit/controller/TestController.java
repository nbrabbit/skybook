package com.rabbit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("testCon")
    public String testCon(){
        System.out.println("invoke success!!!");

        return "success!!!!!!!!!!!!!";
    }
}

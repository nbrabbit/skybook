package com.rabbit.controller;

import com.rabbit.model.SkyBook;
import com.rabbit.service.SkyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkyBookController {

    @Autowired
    SkyBookService skyBookService;

    @RequestMapping("/getASkyBookRandom")
    public SkyBook getASkyBookRandom(){
        return skyBookService.getASkyBookRandom();
    }
}

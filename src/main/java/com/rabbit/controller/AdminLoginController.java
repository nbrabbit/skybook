package com.rabbit.controller;

import com.rabbit.model.AdminUser;
import com.rabbit.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminLoginController {

    @Autowired
    AdminLoginService adminLoginService;

    @RequestMapping("/adminLogin")
    public String adminLogin(@RequestBody AdminUser adminUser){
        return adminLoginService.Login(adminUser);
    }
}

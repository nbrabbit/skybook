package com.rabbit.service;

import com.rabbit.bean.LoginBean;
import com.rabbit.model.AdminUser;

public interface AdminLoginService {
    LoginBean Login(AdminUser adminUser);
}

package com.rabbit.serviceImpl;

import com.rabbit.dao.AdminUserDao;
import com.rabbit.model.AdminUser;
import com.rabbit.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    AdminUserDao adminUserDao;

    @Override
    public String Login(AdminUser adminUser) {
        AdminUser user = adminUserDao.getAdminUserByName(adminUser);

        String msg = "";
        if (user == null) {
            msg = "用户不存在";
        } else {
            if (!adminUser.getPassword().equals(user.getPassword())) {
                msg = "密码错误";
            }
        }
        return msg;
    }
}

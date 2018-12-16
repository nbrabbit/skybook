package com.rabbit.serviceImpl;

import com.rabbit.bean.LoginBean;
import com.rabbit.dao.AdminUserDao;
import com.rabbit.model.AdminUser;
import com.rabbit.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    AdminUserDao adminUserDao;
    @Autowired
    LoginBean loginBean;

    @Override
    public LoginBean Login(AdminUser adminUser) {
        AdminUser user = adminUserDao.getAdminUserByName(adminUser);

        String msg = "";

        if(user != null){
            if (adminUser.getPassword().equals(user.getPassword())) {
                msg = "允许登录";
                loginBean.setAllowLogin("yes");
            }else {
                msg = "密码错误";
                loginBean.setAllowLogin("no");
            }
        }else{
            msg = "用户不存在";
            loginBean.setAllowLogin("no");
        }

        loginBean.setUserid(user.getId());
        loginBean.setUsername(user.getUsername());
        loginBean.setMsg(msg);

        return loginBean;
    }
}

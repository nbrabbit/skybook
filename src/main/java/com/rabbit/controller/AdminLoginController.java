package com.rabbit.controller;

import com.alibaba.fastjson.JSONObject;
import com.rabbit.bean.LoginBean;
import com.rabbit.bean.ResultBean;
import com.rabbit.exception.SuperException;
import com.rabbit.model.AdminUser;
import com.rabbit.service.AdminLoginService;
import com.rabbit.util.ResponseUtil;
import com.rabbit.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AdminLoginController {

    @Autowired
    AdminLoginService adminLoginService;

    @Autowired
    LoginBean loginBean;

    @RequestMapping("/adminLogin")
    public void adminLogin(@RequestBody AdminUser adminUser, HttpServletResponse resp) throws Exception {

        ResultBean rb = new ResultBean();

        try {
            loginBean = adminLoginService.Login(adminUser);
            loginBean.setLoginTime(Util.getTime());
        } catch (SuperException e) {
            e.printStackTrace();
            rb.setCode(e.getCode());
            rb.setMsg(e.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
            rb.setCode(500);
            rb.setMsg("登录失败");
        }

//        return adminLoginService.Login(adminUser);
        rb.setResult(loginBean);
        ResponseUtil.sendJsonNoCache(resp, JSONObject.toJSONString(rb));
    }
}

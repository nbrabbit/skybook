package com.rabbit.bean;

import com.rabbit.model.AdminUser;
import org.springframework.stereotype.Component;

@Component
public class LoginBean {
    private String userid;
    private String username;
    private String allowLogin;
    private String msg;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAllowLogin() {
        return allowLogin;
    }

    public void setAllowLogin(String allowLogin) {
        this.allowLogin = allowLogin;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

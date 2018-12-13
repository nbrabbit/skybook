package com.rabbit.bean;

import org.springframework.stereotype.Component;

@Component
public class InvokeUserBean {
    private String userIp;

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }
}

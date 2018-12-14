package com.rabbit.bean;

import org.springframework.stereotype.Component;

@Component
public class InvokeUserBean {

    private String userIp;
    /**
     * 是否为点击刷新产生的请求
     */
    private boolean isRefresh;

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public boolean isRefresh() {
        return isRefresh;
    }

    public void setRefresh(boolean refresh) {
        isRefresh = refresh;
    }
}

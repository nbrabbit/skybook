package com.rabbit.model;

public class SBookRecord {
    private String id;
    private String skybookid;
    /**
     * 访问者ip
     */
    private String userip;
    /**
     * 调用时间
     */
    private String invoketime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkybookid() {
        return skybookid;
    }

    public void setSkybookid(String skybookid) {
        this.skybookid = skybookid;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public String getInvoketime() {
        return invoketime;
    }

    public void setInvoketime(String invoketime) {
        this.invoketime = invoketime;
    }

    @Override
    public String toString() {
        return "SBookRecord{" +
                "id='" + id + '\'' +
                ", skybookid='" + skybookid + '\'' +
                ", userip='" + userip + '\'' +
                ", invoketime='" + invoketime + '\'' +
                '}';
    }
}

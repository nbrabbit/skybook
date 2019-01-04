package com.rabbit.bean;


import com.github.pagehelper.Page;

public class ResultBean {
    private int code = 200;
    private String msg = "success";
    private Object result;
    private String resultcount = null;
    private Page page = null;

    public ResultBean() {
    }

    public ResultBean(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getResultcount() {
        return resultcount;
    }

    public void setResultcount(String resultcount) {
        this.resultcount = resultcount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setReturnResult(int code, String msg, Object result) {
        this.code = code;
        this.msg = msg;
        this.result = result;

    }
}

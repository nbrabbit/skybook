package com.rabbit.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.rabbit.bean.InvokeUserBean;
import com.rabbit.bean.ResultBean;
import com.rabbit.exception.SuperException;
import com.rabbit.model.RestResult;
import com.rabbit.model.SBookRecord;
import com.rabbit.model.SkyBook;
import com.rabbit.service.SBookRecordService;
import com.rabbit.service.SkyBookService;
import com.rabbit.service.VisitCountService;
import com.rabbit.util.ResponseUtil;
import com.rabbit.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.util.ArrayList;

@RestController
public class SkyBookController {

    @Autowired
    SkyBookService skyBookService;

    @Autowired
    SBookRecordService sBookRecordService;

    @Autowired
    VisitCountService visitCountService;

    /* @RequestMapping("/getASkyBookRandom")
     public SkyBook getASkyBookRandom(@RequestBody InvokeUserBean userBean){

         //获取天书
         SkyBook sbook = skyBookService.getASkyBookRandom();

         //记录天书获取数据
         SBookRecord sBookRecord = new SBookRecord();
         sBookRecord.setId(Util.uuid());
         sBookRecord.setUserip(userBean.getUserIp());
         sBookRecord.setSkybookid(sbook.getId());
         sBookRecord.setInvoketime(Util.getTime());
         sBookRecordService.insertRecord(sBookRecord);

         //只有打开页面的请求才更新访问次数
         if (userBean.isRefresh() == false){
             //更新访问次数
             visitCountService.updateCount();
         }
         return sbook;
     }*/
    @RequestMapping("/getASkyBookRandom")
    public Object getASkyBookRandom(@RequestBody InvokeUserBean userBean) {

        //获取天书
        SkyBook sbook = skyBookService.getASkyBookRandom();

        //记录天书获取数据
        SBookRecord sBookRecord = new SBookRecord();
        sBookRecord.setId(Util.uuid());
        sBookRecord.setUserip(userBean.getUserIp());
        sBookRecord.setSkybookid(sbook.getId());
        sBookRecord.setInvoketime(Util.getTime());
        sBookRecordService.insertRecord(sBookRecord);

        //只有打开页面的请求才更新访问次数
        if (userBean.isRefresh() == false) {
            //更新访问次数
            visitCountService.updateCount();
        }

        RestResult result = new RestResult(true, "200", sbook, null);

        return JSONObject.toJSON(result);
    }

    @RequestMapping("/getAllSkyBook")
    public void getAllSkyBook(HttpServletResponse resp) throws  Exception{
        System.out.println("********getAllSkyBook");
        ResultBean rb = new ResultBean();
        ArrayList<SkyBook> skybookList = null;
        try {
            skybookList = skyBookService.getAllSkyBook();
        }catch (SuperException e){
            e.printStackTrace();
            rb.setCode(e.getCode());
            rb.setMsg(e.getMsg());
        }catch (Exception e) {
            e.printStackTrace();
            rb.setCode(500);
            rb.setMsg("查询skybook失败");
        }
        rb.setResult(skybookList);
        ResponseUtil.sendJsonNoCache(resp, JSONObject.toJSONString(rb));
    }

    @RequestMapping("/addSkyBook")
    public void addSkyBook(@RequestBody SkyBook skyBook, HttpServletResponse resp) throws Exception {

        ResultBean rb = new ResultBean();
        try {
            skyBookService.addSkyBook(skyBook);

        } catch (SuperException e) {
            e.printStackTrace();
            rb.setCode(e.getCode());
            rb.setMsg(e.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
            rb.setCode(500);
            rb.setMsg("新增skybook失败");
        }

        rb.setResult(skyBook);
        ResponseUtil.sendJsonNoCache(resp, JSONObject.toJSONString(rb));

    }
}

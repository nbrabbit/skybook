package com.rabbit.controller;

import com.rabbit.bean.InvokeUserBean;
import com.rabbit.model.SBookRecord;
import com.rabbit.model.SkyBook;
import com.rabbit.service.SBookRecordService;
import com.rabbit.service.SkyBookService;
import com.rabbit.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkyBookController {

    @Autowired
    SkyBookService skyBookService;

    @Autowired
    SBookRecordService sBookRecordService;

    @RequestMapping("/getASkyBookRandom")
    public SkyBook getASkyBookRandom(@RequestBody InvokeUserBean userBean){

        System.out.println("*****************");
        SkyBook sbook = skyBookService.getASkyBookRandom();

        SBookRecord sBookRecord = new SBookRecord();
        sBookRecord.setId(Util.uuid());
        sBookRecord.setUserip(userBean.getUserIp());
        sBookRecord.setSkybookid(sbook.id);
        sBookRecord.setInvoketime(Util.getTime());
        System.out.println("!!!!!!!!!!!!!!!!!!" + sBookRecord.toString());

        sBookRecordService.insertRecord(sBookRecord);

        System.out.println(sBookRecord.toString());
        return sbook;
    }
}

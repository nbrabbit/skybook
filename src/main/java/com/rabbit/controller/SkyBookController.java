package com.rabbit.controller;

import com.rabbit.bean.InvokeUserBean;
import com.rabbit.model.SBookRecord;
import com.rabbit.model.SkyBook;
import com.rabbit.service.SBookRecordService;
import com.rabbit.service.SkyBookService;
import com.rabbit.service.VisitCountService;
import com.rabbit.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    @Autowired
    VisitCountService visitCountService;

    @RequestMapping("/getASkyBookRandom")
    public SkyBook getASkyBookRandom(@RequestBody InvokeUserBean userBean){

        //获取天书
        SkyBook sbook = skyBookService.getASkyBookRandom();

        //记录天书获取数据
        SBookRecord sBookRecord = new SBookRecord();
        sBookRecord.setId(Util.uuid());
        sBookRecord.setUserip(userBean.getUserIp());
        sBookRecord.setSkybookid(sbook.id);
        sBookRecord.setInvoketime(Util.getTime());
        sBookRecordService.insertRecord(sBookRecord);

        //只有打开页面的请求才更新访问次数
        if (userBean.isRefresh() == false){
            //更新访问次数
            visitCountService.updateCount();
        }
        return sbook;
    }
}

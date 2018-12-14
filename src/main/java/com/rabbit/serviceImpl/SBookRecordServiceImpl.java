package com.rabbit.serviceImpl;

import com.rabbit.dao.SBookRecordDao;
import com.rabbit.model.SBookRecord;
import com.rabbit.service.SBookRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SBookRecordServiceImpl implements SBookRecordService {

    @Autowired
    SBookRecordDao sBookRecordDao;

    @Override
    public void insertRecord(SBookRecord sBookRecord) {
        sBookRecordDao.insertRecord(sBookRecord);
    }
}

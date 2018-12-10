package com.rabbit.serviceImpl;

import com.rabbit.dao.TestDao;
import com.rabbit.model.TestModel;
import com.rabbit.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    public TestDao testDao;

    @Override
    public TestModel getData() {
        return testDao.getData();
    }
}

package com.rabbit.serviceImpl;

import com.rabbit.dao.VisitCountDao;
import com.rabbit.service.VisitCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitCountServiceImpl implements VisitCountService {

    @Autowired
    VisitCountDao visitCountDao;

    @Override
    public void updateCount() {
        visitCountDao.updateCount();
    }
}

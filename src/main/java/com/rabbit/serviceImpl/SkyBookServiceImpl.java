package com.rabbit.serviceImpl;

import com.rabbit.dao.SkyBookDao;
import com.rabbit.model.SkyBook;
import com.rabbit.service.SkyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkyBookServiceImpl implements SkyBookService {

    @Autowired
    SkyBookDao skyBookDao;

    @Override
    public SkyBook getASkyBookRandom() {
        return skyBookDao.getASkyBookDaoRandom();
    }
}

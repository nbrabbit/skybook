package com.rabbit.serviceImpl;

import com.rabbit.dao.SkyBookDao;
import com.rabbit.model.SkyBook;
import com.rabbit.service.SkyBookService;
import com.rabbit.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class SkyBookServiceImpl implements SkyBookService {

    @Autowired
    SkyBookDao skyBookDao;

    @Override
    public SkyBook getASkyBookRandom() {
        return skyBookDao.getASkyBookDaoRandom();
    }

    @Override
    public void addSkyBook(SkyBook skyBook) throws Exception {

        skyBook.setId(Util.uuid());
        skyBook.setCreatetime(Util.getTime());
        if(skyBook.getType() == null || skyBook.getType() ==""){
            skyBook.setType("01");
        }
        skyBook.setStatue("1");
        skyBookDao.addSkyBook(skyBook);
    }

    @Override
    public ArrayList<SkyBook> getAllSkyBook() throws Exception {

        return skyBookDao.getAllSkyBook();
    }
}

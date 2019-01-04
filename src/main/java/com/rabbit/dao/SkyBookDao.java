package com.rabbit.dao;

import com.rabbit.model.SkyBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SkyBookDao {
    /**
     * 随机获取一条天书
     */
    SkyBook getASkyBookDaoRandom();

    void addSkyBook(SkyBook skyBook);

    ArrayList<SkyBook> getAllSkyBook();

}

package com.rabbit.dao;

import com.rabbit.model.SkyBook;
import org.springframework.stereotype.Repository;

@Repository
public interface SkyBookDao {
    /**
     * 随机获取一条天书
     */
    SkyBook getASkyBookDaoRandom();
}

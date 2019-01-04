package com.rabbit.service;

import com.rabbit.model.SkyBook;

import java.util.ArrayList;

public interface SkyBookService{
    /**
     * 获取一条skybook
     * @return
     */
    SkyBook getASkyBookRandom();

    /**
     * 添加一条skybook
     * @param skyBook
     * @throws Exception
     */
    void addSkyBook(SkyBook skyBook) throws Exception;

    /**
     * 获取所有skybook
     * @throws Exception
     */
    ArrayList<SkyBook> getAllSkyBook()throws Exception;


}

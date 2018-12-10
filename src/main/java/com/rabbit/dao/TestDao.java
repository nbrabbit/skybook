package com.rabbit.dao;

import com.rabbit.model.TestModel;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

   TestModel getData();
}

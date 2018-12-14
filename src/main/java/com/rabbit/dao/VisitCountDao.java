package com.rabbit.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface VisitCountDao {

    void updateCount();
}

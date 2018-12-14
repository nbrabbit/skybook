package com.rabbit.dao;

import com.rabbit.model.SBookRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface SBookRecordDao {
    void insertRecord(SBookRecord sBookRecord);
}

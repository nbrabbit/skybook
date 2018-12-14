package com.rabbit.dao;

import com.rabbit.model.AdminUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserDao {
    AdminUser getAdminUserByName(AdminUser adminUser);
}

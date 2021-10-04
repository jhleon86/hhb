package com.boot.dao;

import java.util.HashMap;

import com.boot.dto.AdminUserDTO;

public interface AdminUserDAO {
	AdminUserDTO selectAdminUser(HashMap<String,Object> paramMap) throws Exception;
}

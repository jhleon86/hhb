package com.boot.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.AdminUserDAO;
import com.boot.dto.AdminUserDTO;

@Controller
@MapperScan(basePackages="com.boot.dao")
public class adminUserController {

	@Autowired
	private AdminUserDAO AdminUserDAO;
	
	@RequestMapping("/adminUserLogin")
	public String adminUserLogin() throws Exception {  
		
		return "adminUserLogin";
	}
	
	
	@RequestMapping("/ajax/adminUserLogin")
	@ResponseBody
	public boolean ajaxAdminUserLogin(@RequestParam HashMap<String,Object> paramMap, HttpServletRequest request) throws Exception {   
		final AdminUserDTO adminUser = AdminUserDAO.selectAdminUser(paramMap);
		
		if(adminUser==null) {
	        return false;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("id", adminUser.getId());
		session.setAttribute("name", adminUser.getName());
		
		return true;
	}
}

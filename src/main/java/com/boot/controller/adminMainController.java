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
public class adminMainController {

//	@Autowired
//	private AdminMainDAO AdminMainDAO;
	
	@RequestMapping("/adminMain")
	public String adminUserLogin() throws Exception {  
		
		
		
		return "adminMain";
	}
}

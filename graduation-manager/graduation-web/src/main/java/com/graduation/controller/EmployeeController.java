package com.graduation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graduation.pojo.User;
import com.graduation.service.UserService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@RequestMapping("/index.htm")
	public String login(){
		return "/login/login.jsp";
	}
	
}

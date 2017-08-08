package com.graduation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graduation.pojo.User;
import com.graduation.service.UserService;

@Controller
@RequestMapping("/bank")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.htm")
	public String login(){
		return "/login/login.jsp";
	}
	@RequestMapping("/logout.htm")
	public String logout(HttpServletRequest request){
		request.getSession().invalidate();
		return "redirect:/bank/login.htm";
	}
	@RequestMapping("/error.htm")
	public String error(HttpServletRequest request){
		return "/backstage/fail.jsp";
	}
	@RequestMapping("/backstage.htm")
	public String backstage(User user,HttpServletRequest request){
		User u=userService.get(user.getId());
		if(u==null){
			return "redirect:/bank/login.htm";
		}else{
			if(u.getPassword().equals(user.getPassword())){
				request.getSession().setAttribute("user", u);
				return "/backstage/index.jsp";
			}else{
				return "redirect:/bank/login.htm";
			}
		}
	}
}

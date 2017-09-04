package com.graduation.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.User;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/a.htm")
	@ResponseBody
	public List a(){
		List list=new ArrayList();
		User u=new User();
		u.setName("1111");
		User u2=new User();
		u2.setName("1111");
		list.add(u);
		list.add(u2);
		return list;
	}
	@RequestMapping("/b.htm")
	public String b(){
		return "list.jsp";
	}
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("2.0180000E7"); 
		String str = bd.toPlainString();
		int a = Integer.parseInt(str);
		System.out.println(a);
	}
}

package com.graduation.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Role;
import com.graduation.pojo.User;
import com.graduation.service.RoleService;
import com.graduation.service.UserService;
import com.graduation.util.Node;
import com.sun.source.tree.Tree;

@Controller
public class AdminController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	///////////////-----user-----//////////////////////////
	@RequestMapping("/admin/insertUserBrfore.htm")
	@ResponseBody
	public List<Node> insertUserBrfore(){
		List<Role>list=roleService.select();
		List<Node> l = new ArrayList<Node>();
		for (Role t : list) {
			Node n = new Node();
			n.setId(t.getRoleid());
			n.setText(t.getName());
			n.setState("open");
			l.add(n);
		}
		System.out.println(l.size());
		return l;
	}
	@RequestMapping("/admin/insertUser.htm")
	public void insertUser(User user){
		for(int i=0;i<10;i++){
			User u=new User();
			u.setPassword("123456");
			u.setRolename(user.getRolename());
			u.setIsdeleted(0);
			u.setCreatetime(new Date());
			userService.insert(u);
		}
	}
	@RequestMapping("/admin/listUser.htm")
	@ResponseBody
	public Map listUser(Integer page , Integer rows){
		List<User> list=userService.select();
		Map map=new HashMap();
		map.put("total", list.size());
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/admin/deleteUser.htm")
	public String deleteUser(Integer id){
		userService.delete(id);
		return "redirect:/admin/deleteUser.htm";
	}
	@RequestMapping("/admin/updateUserBrfore.htm")
	public String updateUserBefore(Model model,Integer id){
		User user=userService.get(id);
		model.addAttribute("user", user);
		return "/admin/user/update.jsp";
	}
	@RequestMapping("/admin/updateUser.htm")
	public String updateUser(User user){
		User u=userService.get(user.getId());
		BeanUtils.copyProperties(user, u);
		userService.update(u);
		return "redirect:/admin/deleteUser.htm";
	}
    //////////////-----role-----///////////////////////////
	@RequestMapping("/makerole.htm")
	public String role(){
		return "/login/login.jsp";
	}
    //////////////-----department-----/////////////////////
	
	
    //////////////-----position-----///////////////////////
	
}

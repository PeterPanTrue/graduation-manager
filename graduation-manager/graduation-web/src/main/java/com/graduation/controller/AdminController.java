package com.graduation.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Department;
import com.graduation.pojo.Position;
import com.graduation.pojo.Role;
import com.graduation.pojo.User;
import com.graduation.service.DepartmentService;
import com.graduation.service.PositionService;
import com.graduation.service.RoleService;
import com.graduation.service.UserService;
import com.graduation.util.Node;

@Controller
public class AdminController {
	
	@RequestMapping("/admin/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/admin/"+name+"/list.jsp";
	}
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
	
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
		return l;
	}
	@RequestMapping("/admin/insertUser.htm")
	public void insertUser(String rolename){
		for(int i=0;i<10;i++){
			User u=new User();
			u.setPassword("123456");
			u.setRolename(rolename);
			u.setIsdeleted(1);
			u.setCreatetime(new Date());
			userService.insert(u);
		}
	}
	@RequestMapping("/admin/listUser.htm")
	@ResponseBody
	public Map listUser(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<User> list=userService.pageSelect(id, page, rows,sort,order);
		int total=userService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/admin/deleteUser.htm")
	@ResponseBody
	public String deleteUser(Integer id){
		//userService.delete(id);
		User user=userService.get(id);
		user.setIsdeleted(1);
		userService.update(user);
		return "success";
	}
	@RequestMapping("/admin/updateUser.htm")
	public void updateUser(HttpServletRequest request,User user){
		Integer id=Integer.parseInt(request.getParameter("id"));
		User u=userService.get(id);
		BeanUtils.copyProperties(user, u);
		u.setIsdeleted(0);
		u.setCreatetime(new Date());
		userService.update(u);
	}
    //////////////-----role-----///////////////////////////
	@RequestMapping("/admin/listRole.htm")
	@ResponseBody
	public Map role(Integer id,Integer page , Integer rows,String sort,String order){
		List<Role> list=roleService.pageSelect(id, page, rows,sort,order);
		int total=roleService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/admin/insertRole.htm")
	public void insertRole(Role role){
		role.setIsdeleted(0);
		role.setCreatetime(new Date());
		roleService.insert(role);
	}
	@RequestMapping("/admin/deleteRole.htm")
	@ResponseBody
	public String deleteRole(Integer id){
		//roleService.delete(id);
		Role role=roleService.get(id);
		role.setIsdeleted(1);
		roleService.update(role);
		return "success";
	}
	@RequestMapping("/admin/updateRole.htm")
	public void updateRole(HttpServletRequest request,Role role){
		Integer id=Integer.parseInt(request.getParameter("id"));
		role.setRoleid(id);              //此处有点小问题   role的roleid没有传过来  因为传过来是id  表中是roleid  不匹配  手动设置
		Role r=roleService.get(id);
		BeanUtils.copyProperties(role,r);
		r.setIsdeleted(0);
		r.setCreatetime(new Date());
		roleService.update(r);
	}
    //////////////-----department-----/////////////////////
	@RequestMapping("/admin/listDepartment.htm")
	@ResponseBody
	public Map department(Integer id,Integer page , Integer rows,String sort,String order){
		List<Department> list=departmentService.pageSelect(id, page, rows,sort,order);
		int total=departmentService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/admin/insertDepartment.htm")
	public void insertDepartment(Department department){
		departmentService.insert(department);
	}
	@RequestMapping("/admin/deleteDepartment.htm")
	@ResponseBody
	public String deleteDepartment(Integer id){
		departmentService.delete(id);
		return "success";
	}
	@RequestMapping("/admin/updateDepartment.htm")
	public void updateDepartment(HttpServletRequest request,Department department){
		Integer id=Integer.parseInt(request.getParameter("id"));
		department.setDepartmentid(id);              //此处有点小问题   role的roleid没有传过来
		Department r=departmentService.get(id);
		BeanUtils.copyProperties(department,r);
		departmentService.update(r);
	}
    //////////////-----position-----///////////////////////
	@RequestMapping("/admin/insertPositionBefore.htm")
	@ResponseBody
	public List<Node> insertPositionBefore(){
		List<Department>list=departmentService.select();
		List<Node> l = new ArrayList<Node>();
		for (Department t : list) {
			Node n = new Node();
			n.setId(t.getDepartmentid());
			n.setText(t.getName());
			n.setState("open");
			l.add(n);
		}
		return l;
	}
	@RequestMapping("/admin/listPosition.htm")
	@ResponseBody
	public Map listPosition(Integer id,String department,Integer page , Integer rows,String sort,String order){
		List<Position> list=positionService.pageSelect(id,department, page, rows,sort,order);
		int total=positionService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/admin/insertPosition.htm")
	public void insertPosition(Position position){
		Department department=departmentService.get(Integer.parseInt(position.getDepartment()));
		position.setDepartment(department.getName());
		positionService.insert(position);
	}
	@RequestMapping("/admin/deletePosition.htm")
	@ResponseBody
	public String deletePosition(Integer id){
		positionService.delete(id);
		return "success";
	}
	@RequestMapping("/admin/updatePosition.htm")
	public void updatePosition(HttpServletRequest request,Position position){
		Integer id=Integer.parseInt(request.getParameter("id"));
		position.setPositionid(id);              //此处有点小问题   role的roleid没有传过来
		Position r=positionService.get(id);
		BeanUtils.copyProperties(position,r);
		positionService.update(r);
	}
}

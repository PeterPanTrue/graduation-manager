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

import com.graduation.pojo.Apply;
import com.graduation.pojo.Changable;
import com.graduation.pojo.Employee;
import com.graduation.pojo.Position;
import com.graduation.pojo.User;
import com.graduation.service.ApplyService;
import com.graduation.service.ChangeService;
import com.graduation.service.EmployeeService;
import com.graduation.service.PositionService;
import com.graduation.service.UserService;
import com.graduation.util.Node;

@Controller
public class EmployeeController {
	
	
	@RequestMapping("/employee/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/employee/"+name+"/list.jsp";
	}
	@Autowired
	private UserService userService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private ChangeService changeService;
	@Autowired
	private ApplyService applyService;
	
	///////////////-----user-----//////////////////////////
	@RequestMapping("/employee/insertEmployeeBefore.htm")
	@ResponseBody
	public List<Node> insertEmployeeBefore(){
		List<Position>list=positionService.select();
		List<Node> l = new ArrayList<Node>();
		for (Position t : list) {
			Node n = new Node();
			n.setId(t.getPositionid());
			n.setText(t.getName());
			n.setState("open");
			l.add(n);
		}
		return l;
	}
	@RequestMapping("/employee/insertEmployee.htm")
	public void insertEmployee(Employee employee,Integer id){
		employee.setId(id);
		System.out.println(employee.getId()+employee.getPositionname());
		String ids=employee.getPositionname();
		String department=positionService.get(Integer.parseInt(ids)).getDepartment();
		String positionname=positionService.get(Integer.parseInt(ids)).getName();
		employee.setPositionname(positionname);
		employee.setDepartmentname(department);
		employee.setIsdeleted(0);
		employee.setCreatetime(new Date());
		employee.setEntertime(new Date());
		employee.setCreateperson("人事专员");
		employeeService.insert(employee);
		
		User u=userService.get(employee.getId());
		u.setName(employee.getName());
		u.setIsdeleted(0);
		userService.update(u);
	}
	
	@RequestMapping("/employee/listEmployee.htm")
	@ResponseBody
	public Map listEmployee(Integer id,String department,Integer page , Integer rows,String sort,
			String order){
		List<Employee> list=employeeService.pageSelect(id,department,page, rows,sort,order);
		int total=employeeService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/employee/deleteEmployee.htm")
	@ResponseBody
	public String deleteEmployee(Integer id){
		Employee employee=employeeService.get(id);
		employee.setIsdeleted(1);
		employee.setCreatetime(new Date());
		employee.setCreateperson("人事专员");
		employeeService.update(employee);
		User user=userService.get(id);
		user.setIsdeleted(1);
		userService.update(user);
		return "success";
	}
	@RequestMapping("/employee/updateEmployee.htm")
	public void updateEmployee(HttpServletRequest request,Employee user){
		String ids=user.getPositionname();
		String department=positionService.get(Integer.parseInt(ids)).getDepartment();
		String positionname=positionService.get(Integer.parseInt(ids)).getName();
		Integer id=Integer.parseInt(request.getParameter("id"));
		Employee u=employeeService.get(id);
		
		String position1=positionname;
		String position2=u.getPositionname();
		String dept1=department;
		String dept2=u.getDepartmentname();
		
		if(!dept1.equals(dept2)||!position1.equals(position2)){
			Changable changable=new Changable();
			changable.setMemberid(u.getId());
			changable.setName(u.getName());
			changable.setOlddept(dept2);
			changable.setOldposition(position2);
			changable.setNewdept(dept1);
			changable.setNewposition(position1);
			changable.setChangetime(new Date());
			changable.setCreatetime(new Date());
			changable.setIsdeleted(0);
			changable.setCreateperson("人事专员");
			changeService.insert(changable);
		}
		
		BeanUtils.copyProperties(user, u);
		u.setIsdeleted(0);
		u.setCreatetime(new Date());
		u.setPositionname(positionname);
		u.setDepartmentname(department);
		
		
		employeeService.update(u);
		
	}
	////////////////////////////////////////////
	@RequestMapping("/employee/listApply.htm")
	@ResponseBody
	public Map listApply(Integer id,Integer page , Integer rows){
		List<Apply> list=applyService.getApplyByTemp(id, page, rows);
		int total=applyService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/employee/getUser.htm")
	@ResponseBody
	public List<Node> getUser(){
		List<User>list=userService.getUserByName();
		List<Node> l = new ArrayList<Node>();
		for (User t : list) {
			Node n = new Node();
			n.setId(t.getId());
			n.setText(t.getId()+"");
			n.setState("open");
			l.add(n);
		}
		return l;
	}
	@RequestMapping("/employee/insertApply.htm")
	public void insertApply(Employee employee,String position,String applyid){
		List<Position>list=positionService.select(position);
		employee.setPositionname(list.get(0).getName());
		employee.setDepartmentname(list.get(0).getDepartment());
		employee.setIsdeleted(0);
		employee.setCreatetime(new Date());
		employee.setEntertime(new Date());
		employee.setCreateperson("人事专员");
		employeeService.insert(employee);
		
		User u=userService.get(employee.getId());
		u.setName(employee.getName());
		u.setIsdeleted(0);
		userService.update(u);
		
		Apply apply=applyService.get(Integer.parseInt(applyid));
		apply.setTemp1("1");
		applyService.update(apply);
		
	}
	
}

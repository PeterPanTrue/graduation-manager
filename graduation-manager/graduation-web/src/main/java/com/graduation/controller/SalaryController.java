package com.graduation.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Checkable;
import com.graduation.pojo.Employee;
import com.graduation.pojo.Reword;
import com.graduation.pojo.Salary;
import com.graduation.service.CheckService;
import com.graduation.service.EmployeeService;
import com.graduation.service.RewordService;
import com.graduation.service.SalaryService;

@Controller
public class SalaryController {

	@RequestMapping("/salary/{name}/list.htm")
	public String index(@PathVariable("name") String name) {
		return "/salary/" + name + "/list.jsp";
	}

	@Autowired
	private SalaryService salaryService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CheckService checkService;
	@Autowired
	private RewordService rewordService;

	@RequestMapping("/salary/listBaseSalary.htm")
	@ResponseBody
	public Map listSalary(Integer id, Integer page, Integer rows, String sort,
			String order) {
		List<Salary>list=salaryService.pageSelect(id, page, rows, sort, order);
		int total=salaryService.count();
		Map map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

	@RequestMapping("/salary/updateSalary.htm")
	public void updateSalary(String salary, Integer id) {
		Employee e = employeeService.get(id);
		e.setSalary(salary);
		employeeService.update(e);
	}

	
	@RequestMapping("/salary/calculateSalary.htm")
	@ResponseBody
	public String calculateSalary() {
		List<Checkable> list = checkService.select();
		List<Reword> reword = rewordService.select();
		List<Salary> s = salaryService.select();
		for (int i = 0; list != null && i < list.size(); i++) {
			Date d = list.get(i).getChecktime();
			int year = d.getYear();
			int month = d.getMonth();
			Date date = new Date();
			if (year == date.getYear() && month == date.getMonth()) {
				if (s!=null&&s.size()!=0&&s.get(i).getGivetime().getYear() == year) {
					if (s.get(i).getGivetime().getMonth() == month) {
						return "failed";
					}
				} else {
					Salary salary=new Salary();
					salary.setMemberid(list.get(i).getMemberid());
					Employee employee=employeeService.get(list.get(i).getMemberid());
					salary.setMembername(list.get(i).getMembername());
					salary.setPosition(employee.getPositionname());
					salary.setDepartment(employee.getDepartmentname());
					salary.setBase(employee.getSalary());
					salary.setTotal(calculate(list.get(i),employee,reword)+"");
					salary.setGivetime(new Date());
					salary.setCar(calculateLate(list.get(i), reword)+"");
					salary.setEat(calculateLeave(list.get(i), reword)+"");
					salary.setOntime(calculateMissing(list.get(i), reword)+"");
					salary.setPunishiment(calculateOut(list.get(i), reword)+"");
					salary.setReduce(calculatePlue(list.get(i), reword)+"");
					salaryService.insert(salary);
				}
			} else {
				Salary salary=new Salary();
				salary.setMemberid(list.get(i).getMemberid());
				Employee employee=employeeService.get(list.get(i).getMemberid());
				salary.setMembername(list.get(i).getMembername());
				salary.setPosition(employee.getPositionname());
				salary.setDepartment(employee.getDepartmentname());
				salary.setBase(employee.getSalary());
				salary.setTotal(calculate(list.get(i),employee,reword)+"");
				salary.setGivetime(new Date());
				salaryService.insert(salary);
			}
		}
		return "success";
	}

	public static int calculate(Checkable check, Employee employee, List<Reword> list) {
		int a = Integer.parseInt(employee.getSalary());
		int b = 0;
		for (int i = 0; list != null && i < list.size(); i++) {
			if (list.get(i).getRewordname().trim().equals("迟到早退")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getLate();
			}
			if (list.get(i).getRewordname().trim().equals("无故矿工")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getMissing();
			}
			if (list.get(i).getRewordname().trim().equals("因事请假")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getAleave();
			}
			if (list.get(i).getRewordname().trim().equals("出差")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getGoout();
			}
			if (list.get(i).getRewordname().trim().equals("加班")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getPlus();
			}
		}
		return a+b;
	}
	public static int calculateLate(Checkable check, List<Reword> list) {
		int b = 0;
		for (int i = 0; list != null && i < list.size(); i++) {
			if (list.get(i).getRewordname().trim().equals("迟到早退")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getLate();
			}
		}
		return b;
	}
	public static int calculateLeave(Checkable check, List<Reword> list) {
		int b = 0;
		for (int i = 0; list != null && i < list.size(); i++) {
			if (list.get(i).getRewordname().trim().equals("因事请假")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getAleave();
			}
		}
		return b;
	}
	public static int calculateMissing(Checkable check, List<Reword> list) {
		int b = 0;
		for (int i = 0; list != null && i < list.size(); i++) {
			if (list.get(i).getRewordname().trim().equals("无故矿工")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getMissing();
			}
		}
		return b;
	}
	public static int calculateOut(Checkable check, List<Reword> list) {
		int b = 0;
		for (int i = 0; list != null && i < list.size(); i++) {
			if (list.get(i).getRewordname().trim().equals("出差")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getGoout();
			}
		}
		return b;
	}
	public static int calculatePlue(Checkable check, List<Reword> list) {
		int b = 0;
		for (int i = 0; list != null && i < list.size(); i++) {
			if (list.get(i).getRewordname().trim().equals("加班")) {
				b+=Integer.parseInt(list.get(i).getMoney())*check.getPlus();
			}
		}
		return b;
	}
}

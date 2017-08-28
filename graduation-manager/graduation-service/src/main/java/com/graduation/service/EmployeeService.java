package com.graduation.service;


import java.util.List;

import com.graduation.pojo.Employee;

public interface EmployeeService extends BaseService<Employee>{
	List<Employee> pageSelect(Integer id,String department,Integer page,Integer rows,String sort,
			String order);
}

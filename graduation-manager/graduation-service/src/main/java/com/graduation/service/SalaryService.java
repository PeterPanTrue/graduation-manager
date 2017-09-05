package com.graduation.service;

import java.util.List;

import com.graduation.pojo.Salary;

public interface SalaryService extends BaseService<Salary>{
	public List<Salary> selectByMemberId(int id);
}

package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.EmployeeMapper;
import com.graduation.pojo.Department;
import com.graduation.pojo.DepartmentExample;
import com.graduation.pojo.Employee;
import com.graduation.pojo.EmployeeExample;
import com.graduation.pojo.EmployeeExample.Criteria;
import com.graduation.service.EmployeeService;
import com.graduation.utils.WriteEmployeeExcel;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper mapper;

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Employee t) {
		mapper.insert(t);
	}

	@Override
	public List<Employee> select() {
		EmployeeExample example=new EmployeeExample();
		Criteria criteria=example.createCriteria();
		List<Employee> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Employee get(Integer id) {
		EmployeeExample example=new EmployeeExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Employee> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Employee t) {
		mapper.updateByPrimaryKey(t);
	}
	
	@Override
	public int count() {
		EmployeeExample example=new EmployeeExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<Employee> pageSelect(Integer id,String department,Integer page, Integer rows,
			String sort, String order) {
		List<Employee> list=mapper.pageSelect(id,department,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public List<Employee> pageSelect(Integer id, Integer page, Integer rows,
			String sort, String order) {
		return null;
	}

	@Override
	public HSSFWorkbook writeExcel() {
		EmployeeExample example=new EmployeeExample();
		List<Employee> list=mapper.selectByExample(example);
		try {
			return WriteEmployeeExcel.writeExcel(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

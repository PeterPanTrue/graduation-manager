package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.DepartmentMapper;
import com.graduation.pojo.Department;
import com.graduation.pojo.DepartmentExample;
import com.graduation.pojo.PositionExample;
import com.graduation.pojo.Role;
import com.graduation.pojo.RoleExample;
import com.graduation.pojo.DepartmentExample.Criteria;
import com.graduation.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentMapper mapper;

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Department t) {
		mapper.insert(t);
	}

	@Override
	public List<Department> select() {
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		List<Department> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Department get(Integer id) {
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andDepartmentidEqualTo(id);
		List<Department> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Department t) {
		mapper.updateByPrimaryKey(t);
	}
	
	@Override
	public int count() {
		DepartmentExample example=new DepartmentExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<Department> pageSelect(Integer id, Integer page, Integer rows,
			String sort, String order) {
		List<Department> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}
}

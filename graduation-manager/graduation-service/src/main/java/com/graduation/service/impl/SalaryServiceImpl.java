package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.SalaryMapper;
import com.graduation.pojo.Salary;
import com.graduation.pojo.SalaryExample;
import com.graduation.pojo.SalaryExample.Criteria;
import com.graduation.service.SalaryService;


@Service
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	private SalaryMapper mapper;

	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Salary salary) {
		mapper.insert(salary);
	}

	@Override
	public List<Salary> select() {
		SalaryExample example=new SalaryExample();
		Criteria criteria=example.createCriteria();
		List<Salary> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Salary get(Integer id) {
		SalaryExample example=new SalaryExample();
		Criteria criteria=example.createCriteria();
		criteria.andSalaryidEqualTo(id);
		List<Salary> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Salary record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Salary> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Salary> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		SalaryExample example=new SalaryExample();
		return mapper.countByExample(example);
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Salary> selectByMemberId(int id) {
		SalaryExample example=new SalaryExample();
		Criteria criteria=example.createCriteria();
		criteria.andMemberidEqualTo(id);
		List<Salary>list=mapper.selectByExample(example);
		return list;
	}

	

}

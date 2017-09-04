package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.RequirableMapper;
import com.graduation.pojo.Requirable;
import com.graduation.pojo.RequirableExample;
import com.graduation.pojo.RequirableExample.Criteria;
import com.graduation.service.RequireService;

@Service
public class RequireServiceImpl implements RequireService{
	
	@Autowired
	private RequirableMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Requirable require) {
		mapper.insert(require);
	}

	@Override
	public List<Requirable> select() {
		RequirableExample example=new RequirableExample();
		Criteria criteria=example.createCriteria();
		List<Requirable> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Requirable get(Integer id) {
		RequirableExample example=new RequirableExample();
		Criteria criteria=example.createCriteria();
		criteria.andRequireidEqualTo(id);
		List<Requirable> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Requirable record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Requirable> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Requirable> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		RequirableExample example=new RequirableExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<Requirable> select(String department) {
		RequirableExample example=new RequirableExample();
		Criteria criteria=example.createCriteria();
		criteria.andDepartmentEqualTo(department);
		List<Requirable> list=mapper.selectByExample(example);
		return list;
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

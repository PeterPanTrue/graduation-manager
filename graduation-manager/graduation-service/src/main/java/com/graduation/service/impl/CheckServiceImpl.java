package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.CheckableMapper;
import com.graduation.pojo.Checkable;
import com.graduation.pojo.CheckableExample;
import com.graduation.pojo.CheckableExample.Criteria;
import com.graduation.service.CheckService;

@Service
public class CheckServiceImpl implements CheckService{
	
	@Autowired
	private CheckableMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Checkable checkable) {
		mapper.insert(checkable);
	}

	@Override
	public List<Checkable> select() {
		CheckableExample example=new CheckableExample();
		Criteria criteria=example.createCriteria();
		List<Checkable> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Checkable get(Integer id) {
		CheckableExample example=new CheckableExample();
		Criteria criteria=example.createCriteria();
		criteria.andCheckidEqualTo(id);
		List<Checkable> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Checkable record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Checkable> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Checkable> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		CheckableExample example=new CheckableExample();
		return mapper.countByExample(example);
	}


	@Override
	public HSSFWorkbook writeExcel() {
		return null;
	}

	

}

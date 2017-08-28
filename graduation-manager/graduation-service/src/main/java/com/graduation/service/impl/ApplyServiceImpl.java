package com.graduation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.ApplyMapper;
import com.graduation.pojo.Apply;
import com.graduation.pojo.ApplyExample;
import com.graduation.pojo.ApplyExample.Criteria;
import com.graduation.service.ApplyService;

@Service
public class ApplyServiceImpl implements ApplyService{
	
	@Autowired
	private ApplyMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Apply apply) {
		mapper.insert(apply);
	}

	@Override
	public List<Apply> select() {
		ApplyExample example=new ApplyExample();
		Criteria criteria=example.createCriteria();
		List<Apply> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Apply get(Integer id) {
		ApplyExample example=new ApplyExample();
		Criteria criteria=example.createCriteria();
		criteria.andEmployidEqualTo(id);
		List<Apply> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Apply record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Apply> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Apply> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		ApplyExample example=new ApplyExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<Apply> getApplyByTemp(Integer id,Integer page,Integer rows) {
		List<Apply> list=mapper.pageSelectByTemp(id,(page-1)*rows,rows);
		return list;
	}

	

}

package com.graduation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.PlanMapper;
import com.graduation.pojo.Plan;
import com.graduation.pojo.PlanExample;
import com.graduation.pojo.PlanExample.Criteria;
import com.graduation.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanMapper mapper;

	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Plan plan) {
		mapper.insert(plan);
	}

	@Override
	public List<Plan> select() {
		PlanExample example=new PlanExample();
		Criteria criteria=example.createCriteria();
		List<Plan> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Plan get(Integer id) {
		PlanExample example=new PlanExample();
		Criteria criteria=example.createCriteria();
		criteria.andPlanidEqualTo(id);
		List<Plan> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Plan record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Plan> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Plan> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		PlanExample example=new PlanExample();
		return mapper.countByExample(example);
	}

	

}

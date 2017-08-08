package com.graduation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.PositionMapper;
import com.graduation.pojo.Position;
import com.graduation.pojo.PositionExample;
import com.graduation.pojo.Role;
import com.graduation.pojo.RoleExample;
import com.graduation.pojo.PositionExample.Criteria;
import com.graduation.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService{
	
	@Autowired
	private PositionMapper mapper;

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Position t) {
		mapper.insert(t);
	}

	@Override
	public List<Position> select() {
		PositionExample example=new PositionExample();
		Criteria criteria=example.createCriteria();
		List<Position> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Position get(Integer id) {
		PositionExample example=new PositionExample();
		Criteria criteria=example.createCriteria();
		criteria.andPositionidEqualTo(id);
		List<Position> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Position t) {
		mapper.updateByPrimaryKey(t);
	}

}

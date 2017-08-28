package com.graduation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.UserMapper;
import com.graduation.pojo.User;
import com.graduation.pojo.UserExample;
import com.graduation.pojo.UserExample.Criteria;
import com.graduation.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(User user) {
		mapper.insert(user);
	}

	@Override
	public List<User> select() {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		List<User> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public User get(Integer id) {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(id);
		List<User> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(User record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<User> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<User> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		UserExample example=new UserExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<User> getUserByName() {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andIsdeletedEqualTo(1);
		List<User> list=mapper.selectByExample(example);
		return list;
	}

	

}

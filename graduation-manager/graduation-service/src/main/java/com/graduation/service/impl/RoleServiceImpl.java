package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.RoleMapper;
import com.graduation.pojo.Role;
import com.graduation.pojo.RoleExample;
import com.graduation.pojo.User;
import com.graduation.pojo.UserExample;
import com.graduation.service.RoleService;
import com.graduation.pojo.RoleExample.Criteria;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper mapper;

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Role t) {
		mapper.insert(t);
	}

	@Override
	public List<Role> select() {
		RoleExample example=new RoleExample();
		Criteria criteria=example.createCriteria();
		List<Role> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Role get(Integer id) {
		RoleExample example=new RoleExample();
		Criteria criteria=example.createCriteria();
		criteria.andRoleidEqualTo(id);
		List<Role> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Role t) {
		mapper.updateByPrimaryKey(t);
	}



	@Override
	public int count() {
		RoleExample example=new RoleExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<Role> pageSelect(Integer id, Integer page, Integer rows,
			String sort, String order) {
		List<Role> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}

}

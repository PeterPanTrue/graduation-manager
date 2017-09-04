package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.ChangableMapper;
import com.graduation.pojo.Changable;
import com.graduation.pojo.ChangableExample;
import com.graduation.pojo.ChangableExample.Criteria;
import com.graduation.service.ChangeService;

@Service
public class ChangeServiceImpl implements ChangeService{
	
	@Autowired
	private ChangableMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Changable change) {
		mapper.insert(change);
	}

	@Override
	public List<Changable> select() {
		ChangableExample example=new ChangableExample();
		Criteria criteria=example.createCriteria();
		List<Changable> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Changable get(Integer id) {
		ChangableExample example=new ChangableExample();
		Criteria criteria=example.createCriteria();
		criteria.andChangeidEqualTo(id);
		List<Changable> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Changable record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Changable> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Changable> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		ChangableExample example=new ChangableExample();
		return mapper.countByExample(example);
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

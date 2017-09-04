package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.RewordMapper;
import com.graduation.pojo.Reword;
import com.graduation.pojo.RewordExample;
import com.graduation.pojo.RewordExample.Criteria;
import com.graduation.pojo.UserExample;
import com.graduation.service.RewordService;

@Service
public class RewordServiceImpl implements RewordService{
	
	@Autowired
	private RewordMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Reword reword) {
		mapper.insert(reword);
	}

	@Override
	public List<Reword> select() {
		RewordExample example=new RewordExample();
		Criteria criteria=example.createCriteria();
		List<Reword> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Reword get(Integer id) {
		RewordExample example=new RewordExample();
		Criteria criteria=example.createCriteria();
		criteria.andRewordidEqualTo(id);
		List<Reword> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Reword record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Reword> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Reword> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		RewordExample example=new RewordExample();
		return mapper.countByExample(example);
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

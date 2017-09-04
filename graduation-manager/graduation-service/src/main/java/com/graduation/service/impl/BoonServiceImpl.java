package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.BoonMapper;
import com.graduation.pojo.Boon;
import com.graduation.pojo.BoonExample;
import com.graduation.pojo.BoonExample.Criteria;
import com.graduation.service.BoonService;

@Service
public class BoonServiceImpl implements BoonService{
	
	@Autowired
	private BoonMapper mapper;

	@Override
	public void delete(Integer id) {
//		UserExample example=new UserExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andIdEqualTo(id);
//		mapper.deleteByExample(example);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Boon boon) {
		mapper.insert(boon);
	}

	@Override
	public List<Boon> select() {
		BoonExample example=new BoonExample();
		Criteria criteria=example.createCriteria();
		List<Boon> list=mapper.selectByExample(example);
		return list;
	}

	@Override
	public Boon get(Integer id) {
		BoonExample example=new BoonExample();
		Criteria criteria=example.createCriteria();
		criteria.andBoonidEqualTo(id);
		List<Boon> list=mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public void update(Boon record) {
		mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Boon> pageSelect(Integer id,Integer page,Integer rows,String sort,
			String order) {
		List<Boon> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public int count() {
		BoonExample example=new BoonExample();
		return mapper.countByExample(example);
	}



	@Override
	public HSSFWorkbook writeExcel() {
		return null;
	}

	

}

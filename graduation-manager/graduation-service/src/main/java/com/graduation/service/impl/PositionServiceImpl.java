package com.graduation.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.mapper.PositionMapper;
import com.graduation.pojo.Department;
import com.graduation.pojo.Position;
import com.graduation.pojo.PositionExample;
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
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(Position t) {
		mapper.updateByPrimaryKey(t);
	}
 
	@Override
	public int count() {
		PositionExample example=new PositionExample();
		return mapper.countByExample(example);
	}

	@Override
	public List<Position> pageSelect(Integer id, Integer page, Integer rows,
			String sort, String order) {
		List<Position> list=mapper.pageSelect(id,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public List<Position> pageSelect(Integer id, String department,
			Integer page, Integer rows, String sort, String order) {
		List<Position> list=mapper.pageSelectByDepartment(id,department,(page-1)*rows,rows,sort,order);
		return list;
	}

	@Override
	public List<Position> select(String position) {
		PositionExample example=new PositionExample();
		Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(position);
		List<Position> list=mapper.selectByExample(example);
		return list;
	}


	@Override
	public HSSFWorkbook writeExcel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

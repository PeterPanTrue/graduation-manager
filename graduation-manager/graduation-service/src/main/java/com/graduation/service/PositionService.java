package com.graduation.service;

import java.util.List;

import com.graduation.pojo.Position;

public interface PositionService extends BaseService<Position>{
	List<Position> pageSelect(Integer id,String department,Integer page,Integer rows,String sort,
			String order);
	
	List<Position> select(String position);
}

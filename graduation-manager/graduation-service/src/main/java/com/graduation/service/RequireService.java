package com.graduation.service;

import java.util.List;

import com.graduation.pojo.Requirable;


public interface RequireService extends BaseService<Requirable>{
	public List<Requirable> select(String department);
}

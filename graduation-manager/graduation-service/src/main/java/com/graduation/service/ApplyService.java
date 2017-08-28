package com.graduation.service;

import java.util.List;

import com.graduation.pojo.Apply;

public interface ApplyService extends BaseService<Apply>{
	public List<Apply> getApplyByTemp(Integer id,Integer page,Integer rows);
}

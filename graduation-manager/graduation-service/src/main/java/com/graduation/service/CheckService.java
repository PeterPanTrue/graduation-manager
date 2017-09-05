package com.graduation.service;

import java.util.List;

import com.graduation.pojo.Checkable;


public interface CheckService extends BaseService<Checkable>{
	public List<Checkable> selectByMemberId(int id);
}

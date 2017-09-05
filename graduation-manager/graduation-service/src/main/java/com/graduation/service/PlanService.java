package com.graduation.service;

import java.util.List;

import com.graduation.pojo.Plan;

public interface PlanService extends BaseService<Plan>{
	public List<Plan> selectByPosition(String position);
}

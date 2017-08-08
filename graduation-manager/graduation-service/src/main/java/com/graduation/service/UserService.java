package com.graduation.service;

import java.util.List;
import java.util.Map;

import com.graduation.pojo.User;

public interface UserService extends BaseService<User>{
	public List<User> pageSelect();
}

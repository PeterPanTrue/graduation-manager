package com.mapper.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.graduation.pojo.User;
import com.graduation.service.impl.UserServiceImpl;

public class UserMapperTest {
	@Test
	public void test(){
		List<User> list=new UserServiceImpl().select();
		System.out.println(list.size());
	}
}

package com.graduation.service;

import java.util.List;

public interface BaseService<T>{
	
	    void delete(Integer id);

	    void insert(T t);

	    List<T> select();

	    T get(Integer id);

	    void update(T t);
	    
	    int count();
	    
	    List<T> pageSelect(Integer id,Integer page,Integer rows,String sort,
				String order);
}

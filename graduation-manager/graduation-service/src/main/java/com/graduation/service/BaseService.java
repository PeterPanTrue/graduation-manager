package com.graduation.service;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface BaseService<T>{
	
	    void delete(Integer id);

	    void insert(T t);

	    List<T> select();

	    T get(Integer id);

	    void update(T t);
	    
	    int count();
	    
	    List<T> pageSelect(Integer id,Integer page,Integer rows,String sort,
				String order);
	    
	    HSSFWorkbook writeExcel();
}

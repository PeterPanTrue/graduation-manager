package com.graduation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Changable;
import com.graduation.service.ChangeService;

@Controller
public class ChangeController {
	@RequestMapping("/change/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/change/"+name+"/list.jsp";
	}
	@Autowired
	private ChangeService changeService;
	
	@RequestMapping("/change/listChange.htm")
	@ResponseBody
	public Map listChange(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Changable> list=changeService.pageSelect(id, page, rows,sort,order);
		int total=changeService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
}

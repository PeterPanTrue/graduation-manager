package com.graduation.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Boon;
import com.graduation.pojo.Employee;
import com.graduation.pojo.Reword;
import com.graduation.service.BoonService;

@Controller
public class BoonController {

	@RequestMapping("/boon/{name}/list.htm")
	public String index(@PathVariable("name") String name) {
		return "/boon/" + name + "/list.jsp";
	}
	
	@Autowired
	private BoonService boonService;

	@RequestMapping("/boon/listBoon.htm")
	@ResponseBody
	public Map listBoon(Integer id, Integer page, Integer rows, String sort,
			String order) {
		List<Boon>list=boonService.pageSelect(id, page, rows, sort, order);
		int total=boonService.count();
		Map map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/boon/insertBoon.htm")
	public void  insertBoon(Boon boon){
		boonService.insert(boon);
	}
	@RequestMapping("/boon/updateBoon.htm")
	public void updateSalary(Boon boon, Integer id) {
		boon.setBoonid(id);
		Boon b=boonService.get(id);
		BeanUtils.copyProperties(boon, b);
		boonService.update(b);
	}
	@RequestMapping("/boon/deleteBoon.htm")
	@ResponseBody
	public String  deleteBoon(Integer id){
		boonService.delete(id);
		return "success";
	}
}

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

import com.graduation.pojo.Reword;
import com.graduation.service.RewordService;

@Controller
public class RewordController {
	
	@RequestMapping("/reword/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/reword/"+name+"/list.jsp";
	}
	
	@Autowired
	private RewordService rewordService;
	
	@RequestMapping("/reword/listReword.htm")
	@ResponseBody
	public Map listReword(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Reword> list=rewordService.pageSelect(id, page, rows,sort,order);
		int total=rewordService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/reword/insertReword.htm")
	public void  insertReword(Reword reword){
		reword.setCreatetime(new Date());
		reword.setCreateperson("薪酬人员");
		rewordService.insert(reword);
	}
	@RequestMapping("/reword/updateReword.htm")
	public void  updateReword(Reword reword,Integer id){
		reword.setRewordid(id);
		reword.setCreatetime(new Date());
		reword.setCreateperson("薪酬人员");
		Reword r=rewordService.get(id);
		BeanUtils.copyProperties(reword, r);
		rewordService.update(r);
	}
	@RequestMapping("/reword/deleteReword.htm")
	@ResponseBody
	public String  deleteReword(Integer id){
		rewordService.delete(id);
		return "success";
	}
}

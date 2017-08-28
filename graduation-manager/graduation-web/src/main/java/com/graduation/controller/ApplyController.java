package com.graduation.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Apply;
import com.graduation.service.ApplyService;

@Controller
public class ApplyController {
	@RequestMapping("/apply/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/apply/"+name+"/list.jsp";
	}
	@Autowired
	private ApplyService applyService;
	
	@RequestMapping("/apply/insertApply.htm")
	public String  insertApply(Apply apply,String diahua){
		apply.setPhone(diahua);
		apply.setApplytime(new Date());
		applyService.insert(apply);
		return "require/before/success.jsp";
	}
	@RequestMapping("/apply/listApply.htm")
	@ResponseBody
	public Map listApply(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Apply> list=applyService.pageSelect(id, page, rows,sort,order);
		int total=applyService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/apply/firstpass.htm")
	@ResponseBody
	public String  firstpass(Integer id){
		System.out.println(id);
		Apply apply=applyService.get(id);
		apply.setFirstpass(1);
		apply.setFirstcreatetime(new Date());
		apply.setFirstcreateperson("招聘专员1");
		applyService.update(apply);
		return "success";
	}
	@RequestMapping("/apply/secondpass.htm")
	@ResponseBody
	public String  secondpass(Integer id){
		Apply apply=applyService.get(id);
		apply.setSecondpass(1);
		apply.setSecondcreatetiem(new Date());
		apply.setSecondcreateperson("招聘专员2");
		applyService.update(apply);
		return "success";
	}
	@RequestMapping("/apply/admitpass.htm")
	@ResponseBody
	public String  admitpass(Integer id){
		Apply apply=applyService.get(id);
		apply.setAdmitted(1);
		applyService.update(apply);
		return "success";
	}
	@RequestMapping("/apply/firstNopass.htm")
	@ResponseBody
	public String  firstNopass(Integer id){
		Apply apply=applyService.get(id);
		apply.setFirstpass(0);
		apply.setFirstcreatetime(new Date());
		apply.setFirstcreateperson("招聘专员1");
		applyService.update(apply);
		return "success";
	}
	@RequestMapping("/apply/secondNopass.htm")
	@ResponseBody
	public String  secondNopass(Integer id){
		Apply apply=applyService.get(id);
		apply.setSecondpass(0);
		apply.setSecondcreatetiem(new Date());
		apply.setSecondcreateperson("招聘专员2");
		applyService.update(apply);
		return "success";
	}
	@RequestMapping("/apply/admitNopass.htm")
	@ResponseBody
	public String  admitNopass(Integer id){
		Apply apply=applyService.get(id);
		apply.setAdmitted(0);
		applyService.update(apply);
		return "success";
	}
}

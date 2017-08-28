package com.graduation.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Plan;
import com.graduation.service.PlanService;
import com.graduation.service.PositionService;

@Controller
public class PlanController {
	@RequestMapping("/plan/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/plan/"+name+"/list.jsp";
	}
	
	@Autowired
	private PlanService planService;
	@Autowired
	private PositionService positionService;
	
	@RequestMapping("/plan/listPlan.htm")
	@ResponseBody
	public Map listPlan(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Plan> list=planService.pageSelect(id, page, rows,sort,order);
		int total=planService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/plan/insertPlan.htm")
	public void  insertPlan(Plan plan,String start,String end){
		System.out.println(111);
		plan.setPeople(positionService.get(Integer.parseInt(plan.getPeople())).getName());
		DateTime d1=new DateTime(start);
		Date date1=new Date(d1.getMillis());
		plan.setStarttime(date1);
		DateTime d2=new DateTime(end);
		Date date2=new Date(d2.getMillis());
		plan.setEndtime(date2);
		plan.setIsdeleted(0);
		plan.setCreatetime(new Date());
		plan.setCreateperson("培训专员");
		planService.insert(plan);
	}
	@RequestMapping("/plan/updatePlan.htm")
	public void  updatePlan(Plan plan,Integer id,String start,String end){
		Plan p=planService.get(id);
		plan.setPlanid(id);
		DateTime d1=new DateTime(start);
		Date date1=new Date(d1.getMillis());
		plan.setStarttime(date1);
		DateTime d2=new DateTime(end);
		Date date2=new Date(d2.getMillis());
		plan.setEndtime(date2);
		plan.setIsdeleted(0);
		plan.setCreatetime(new Date());
		plan.setCreateperson("培训专员");
		BeanUtils.copyProperties(plan, p);
		
		planService.update(p);
	}
	@RequestMapping("/plan/deletePlan.htm")
	@ResponseBody
	public String  deletePlan(Integer id){
		System.out.println(1111);
		Plan p=planService.get(id);
		p.setIsdeleted(1);
		planService.update(p);
		return "sucess";
	}
}

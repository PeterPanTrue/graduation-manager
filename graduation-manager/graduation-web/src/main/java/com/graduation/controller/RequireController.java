package com.graduation.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graduation.pojo.Apply;
import com.graduation.pojo.Requirable;
import com.graduation.service.PositionService;
import com.graduation.service.RequireService;

@Controller
public class RequireController {
	
	private static String a[]={
		"前台",
		"业务部",
		"信息技术部",
		"会计部",
		"风控部",
		"人力资源部",
		"现金及汇款部",
	};
	
	@RequestMapping("/require/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/require/"+name+"/list.jsp";
	}
	@RequestMapping("/header/{name}/list.htm")
	public String index2(@PathVariable("name") String name){
		return "/header/"+name+"/list.jsp";
	}
	@Autowired
	private RequireService requireService;
	@Autowired
	private PositionService positionService;
	
	@RequestMapping("/require/list.htm")
	public String list(Integer department,Model model){
		String d=a[department];
		List<Requirable> list=requireService.select(d);
		model.addAttribute("list", list);
		return "require/before/list.jsp";
	}
	@RequestMapping("/require/detail.htm")
	public String detail(Integer id,Model model){
		Requirable r=requireService.get(id);
		model.addAttribute("require", r);
		return "require/before/detail.jsp";
	}
	@RequestMapping("/require/submit.htm")
	public String submit(Integer id,Model model){
		Requirable r=requireService.get(id);
		model.addAttribute("require", r);
		return "require/before/submit.jsp";
	}
	@RequestMapping("/require/listRequire.htm")
	@ResponseBody
	public Map listRequire(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Requirable> list=requireService.pageSelect(id, page, rows,sort,order);
		int total=requireService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/require/listRequirebySubmit.htm")
	@ResponseBody
	public Map listRequirebySubmit(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Requirable> list=requireService.pageSelect(id, page, rows,sort,order);
		int total=requireService.count();
		List<Requirable> result=new ArrayList<Requirable>();
		for(Requirable r:list){
			if(r.getSubmit().intValue()==1){
				result.add(r);
			}
		}
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", result);
		return map;
	}
	@RequestMapping("/require/insertRequire.htm")
	public void insertRequire(Requirable require,String start,String end){
		String ids=require.getPosition();
		String department=positionService.get(Integer.parseInt(ids)).getDepartment();
		String positionname=positionService.get(Integer.parseInt(ids)).getName();
		require.setPosition(positionname);
		require.setDepartment(department);
		require.setSubmit(0);
		require.setAgree(0);
		require.setPunish(0);
		require.setIsdeleted(0);
		DateTime d=new DateTime(start);
		Date date=new Date(d.getMillis());
		require.setStarttime(date);
		DateTime d2=new DateTime(end);
		Date date2=new Date(d2.getMillis());
		require.setEndtime(date2);
		require.setCreatetime(new Date());
		require.setCreatepersom("招聘专员");
		requireService.insert(require);
	}
	@RequestMapping("/require/updateRequire.htm")
	public void updateRequire(Requirable require,String start,String end,Integer id){
		System.out.println(id);
		Requirable r=requireService.get(id);
		r.setNumber(require.getNumber());
		r.setNeed(require.getNeed());
		r.setContent(require.getContent());
		r.setSubmit(0);
		r.setAgree(0);
		r.setPunish(0);
		r.setIsdeleted(0);
		DateTime d=new DateTime(start);
		Date date=new Date(d.getMillis());
		r.setStarttime(date);
		DateTime d2=new DateTime(end);
		Date date2=new Date(d2.getMillis());
		r.setEndtime(date2);
		r.setCreatetime(new Date());
		r.setCreatepersom("招聘专员");
		requireService.update(r);
	}
	@RequestMapping("/require/deleteRequire.htm")
	@ResponseBody
	public String deleteRequire(Integer id){
		Requirable require=requireService.get(id);
		require.setIsdeleted(1);
		require.setCreatetime(new Date());
		require.setCreatepersom("招聘专员");
		requireService.update(require);
		return "success";
	}
	@RequestMapping("/require/submitRequire.htm")
	@ResponseBody
	public String submitRequire(Integer id){
		Requirable require=requireService.get(id);
		require.setSubmit(1);
		require.setCreatetime(new Date());
		require.setCreatepersom("招聘专员");
		requireService.update(require);
		return "success";
	}
	@RequestMapping("/require/punishRequire.htm")
	@ResponseBody
	public String punishRequire(Integer id){
		Requirable require=requireService.get(id);
		require.setPunish(1);
		require.setCreatetime(new Date());
		require.setCreatepersom("招聘专员");
		requireService.update(require);
		return "success";
	}
	@RequestMapping("/require/agreeRequire.htm")
	@ResponseBody
	public String agreeRequire(Integer id){
		Requirable require=requireService.get(id);
		require.setAgree(1);
		require.setCreatetime(new Date());
		require.setCreatepersom("部长");
		requireService.update(require);
		return "success";
	}
	@RequestMapping("/require/backRequire.htm")
	@ResponseBody
	public String backRequire(Integer id){
		Requirable require=requireService.get(id);
		require.setAgree(2);
		require.setCreatetime(new Date());
		require.setCreatepersom("部长");
		requireService.update(require);
		return "success";
	}
	
}

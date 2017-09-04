package com.graduation.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.graduation.pojo.Checkable;
import com.graduation.service.CheckService;
import com.graduation.utils.ReadCheckExcel;

@Controller
public class CheckController {
	
	@RequestMapping("/check/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/check/"+name+"/list.jsp";
	}
	
	@Autowired
	private CheckService checkService;
	
	@RequestMapping("/check/readExcel.htm")
	public void readExcl(@RequestParam("fileupload")CommonsMultipartFile fileupload){
		if(fileupload!=null&&!fileupload.isEmpty()){
			DiskFileItem fi=(DiskFileItem) fileupload.getFileItem();
			File f=fi.getStoreLocation();
			ReadCheckExcel re=new ReadCheckExcel();
			List<Checkable> list=re.readExcel(f);
			for(int i=0;list!=null&&i<list.size();i++){
				checkService.insert(list.get(i));
			}
    	}
	}
	@RequestMapping("/check/listCheck.htm")
	@ResponseBody
	public Map listCheck(Integer id,Integer page , Integer rows,String sort,
			String order){
		List<Checkable> list=checkService.pageSelect(id, page, rows,sort,order);
		int total=checkService.count();
		Map map=new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("/check/updateCheck.htm")
	public void updateEmployee(Integer id,Checkable check,String start){
		DateTime d=new DateTime(start);
		Date date=new Date(d.getMillis());
		check.setCheckid(id);
		check.setChecktime(date);
		check.setCreateperson("人事专员");
		Checkable c=checkService.get(id);
		check.setMembername(c.getMembername());
		BeanUtils.copyProperties(check, c);
		checkService.update(c);
	}
	
}

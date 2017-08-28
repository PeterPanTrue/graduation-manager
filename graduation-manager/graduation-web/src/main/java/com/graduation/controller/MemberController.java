package com.graduation.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.graduation.pojo.Employee;
import com.graduation.pojo.User;
import com.graduation.service.EmployeeService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Controller
public class MemberController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/member/{name}/list.htm")
	public String index(@PathVariable("name") String name){
		return "/member/"+name+"/list.jsp";
	}
	
	@RequestMapping("/member/list.htm")
	public String  show(Model model,HttpServletRequest request){
		User user=(User) request.getSession().getAttribute("user");
		Employee employee=employeeService.get(user.getId());
		model.addAttribute("employee",employee);
		return "/member/person/list.jsp";
	}
	@RequestMapping("/member/update.htm")
	public void update(@RequestParam("fileupload") CommonsMultipartFile fileupload,Employee employee,HttpServletResponse response,String born,String finish) throws IOException{
		System.out.println(born+finish);
		String url="";
		if(fileupload!=null&&!fileupload.isEmpty()){
				DiskFileItem fi=(DiskFileItem) fileupload.getFileItem();
				File f=fi.getStoreLocation();
				Client client=new Client();
				String s=UUID.randomUUID().toString();
				String result=employee.getId()+s.charAt(0)+"";
				url="http://localhost:18888/Picture/upload/"+result+".jpg";
				WebResource resource=client.resource(url);
				byte[] b=FileUtils.readFileToByteArray(f);
				resource.put(String.class,b);
				url=result+".jpg";
		}else{
			if(!employee.getPhoto().equals("")&&employee.getPhoto()!=null){
				url=employee.getPhoto();
			}
		}
		Employee e=employeeService.get(employee.getId());
		if(!born.equals("")&&born!=null){
			DateTime d=new DateTime(born);
			Date date=new Date(d.getMillis());
			employee.setBirth(date);
		}
		if(!finish.equals("")&&finish!=null){
			DateTime d2=new DateTime(finish);
			Date date2=new Date(d2.getMillis());
			employee.setFinishtime(date2);
		}
		BeanUtils.copyProperties(employee, e);
		e.setPhoto(url);
		employeeService.update(e);
		response.setContentType("text/html;charset=UTF-8");
		response.addHeader("location", "list.htm");     //路径问题好好理解
		response.setStatus(302);
	}
}

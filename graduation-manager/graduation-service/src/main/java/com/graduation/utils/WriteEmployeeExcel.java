package com.graduation.utils;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.graduation.pojo.Employee;


public class WriteEmployeeExcel {
	
	
	public static HSSFWorkbook writeExcel(List<Employee> employees) throws Exception{
		SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd");
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("员工信息表");
		HSSFRow row=sheet.createRow(0);
		
		HSSFCell cell=row.createCell(0);
		cell.setCellValue("员工工号");
		
		cell=row.createCell(1);
		cell.setCellValue("姓名");
		
		cell=row.createCell(2);
		cell.setCellValue("性别");
		
		cell=row.createCell(3);
		cell.setCellValue("出生");
		
		cell=row.createCell(4);
		cell.setCellValue("地址");
		
		cell=row.createCell(5);
		cell.setCellValue("民族");
		
		cell=row.createCell(6);
		cell.setCellValue("婚配");
		
		
		cell=row.createCell(7);
		cell.setCellValue("政治面貌");
		
		cell=row.createCell(8);
		cell.setCellValue("身份证");
		
		cell=row.createCell(9);
		cell.setCellValue("电话");
		
		cell=row.createCell(10);
		cell.setCellValue("工作年限");
		
		cell=row.createCell(11);
		cell.setCellValue("学历");
		
		cell=row.createCell(12);
		cell.setCellValue("毕业学校");
		
		cell=row.createCell(13);
		cell.setCellValue("专业");
		
		cell=row.createCell(14);
		cell.setCellValue("毕业时间");
		
		cell=row.createCell(15);
		cell.setCellValue("英语级别");
		
		cell=row.createCell(16);
		cell.setCellValue("计算机等级");
		
		cell=row.createCell(17);
		cell.setCellValue("入企时间");
		
		cell=row.createCell(18);
		cell.setCellValue("部门");
		
		cell=row.createCell(19);
		cell.setCellValue("职位");
		
		cell=row.createCell(20);
		cell.setCellValue("基本工资");
		
		List<Employee>list=employees;
		for(int i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			Employee employee=list.get(i);
			row.createCell(0).setCellValue(employee.getId());
			row.createCell(1).setCellValue(employee.getName());
			row.createCell(2).setCellValue(employee.getSex()==null?"":employee.getSex());
			row.createCell(3).setCellValue(employee.getBirth()==null?"":si.format(employee.getBirth()).toString());
			row.createCell(4).setCellValue(employee.getSource()==null?"":employee.getSource());
			row.createCell(5).setCellValue(employee.getNatives()==null?"":employee.getNatives()+"");
			row.createCell(6).setCellValue(employee.getMarray()==null?"":employee.getMarray()+"");
			row.createCell(7).setCellValue(employee.getFace()==null?"":employee.getFace()+"");
			row.createCell(8).setCellValue(employee.getIdcard()==null?"":employee.getIdcard());
			row.createCell(9).setCellValue(employee.getPhone()==null?"":employee.getPhone());
			row.createCell(10).setCellValue(employee.getWorktime()==null?"":employee.getWorktime()+"");
			row.createCell(11).setCellValue(employee.getXuel()==null?"":employee.getXuel()+"");
			row.createCell(12).setCellValue(employee.getSchool()==null?"":employee.getSchool());
			row.createCell(13).setCellValue(employee.getMajor()==null?"":employee.getMajor());
			row.createCell(14).setCellValue(employee.getFinishtime()==null?"":si.format(employee.getFinishtime()).toString());
			row.createCell(15).setCellValue(employee.getEnglish()==null?"":employee.getEnglish()+"");
			row.createCell(16).setCellValue(employee.getComputer()==null?"":employee.getComputer()+"");
			row.createCell(17).setCellValue(employee.getEntertime()==null?"":si.format(employee.getEntertime()).toString()+"");
			row.createCell(18).setCellValue(employee.getDepartmentname()==null?"":employee.getDepartmentname());
			row.createCell(19).setCellValue(employee.getPositionname()==null?"":employee.getPositionname());
			row.createCell(20).setCellValue(employee.getSalary()==null?"":employee.getSalary()+"");
		}
		try{
		//FileOutputStream out=new FileOutputStream(new File(path));
		//wb.write(out);
		}catch(Exception e){
			e.printStackTrace();
		}
		return wb;
	}
}

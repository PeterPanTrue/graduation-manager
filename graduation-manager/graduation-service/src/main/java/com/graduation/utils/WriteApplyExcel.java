package com.graduation.utils;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.graduation.pojo.Apply;

public class WriteApplyExcel {
	public static HSSFWorkbook writeExcel(List<Apply> applys) throws Exception{
		SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd");
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("应聘信息表");
		HSSFRow row=sheet.createRow(0);
		
		HSSFCell cell=row.createCell(0);
		cell.setCellValue("编号");
		
		cell=row.createCell(1);
		cell.setCellValue("姓名");
		
		cell=row.createCell(2);
		cell.setCellValue("性别");
		
		cell=row.createCell(3);
		cell.setCellValue("年龄");
		
		cell=row.createCell(4);
		cell.setCellValue("身份证");
		
		cell=row.createCell(5);
		cell.setCellValue("应聘职位");
		
		cell=row.createCell(6);
		cell.setCellValue("应聘部门");
		
		
		cell=row.createCell(7);
		cell.setCellValue("学历");
		
		cell=row.createCell(8);
		cell.setCellValue("毕业学校");
		
		cell=row.createCell(9);
		cell.setCellValue("工作经验");
		
		cell=row.createCell(10);
		cell.setCellValue("电话");
		
		cell=row.createCell(11);
		cell.setCellValue("Email");
		
		cell=row.createCell(12);
		cell.setCellValue("申请时间");
		
		
		List<Apply>list=applys;
		for(int i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			Apply apply=list.get(i);
			row.createCell(0).setCellValue(apply.getEmployid());
			row.createCell(1).setCellValue(apply.getName()==null?"":apply.getName());
			row.createCell(2).setCellValue(apply.getSex()==null?"":apply.getSex());
			row.createCell(3).setCellValue(apply.getAge()==null?"":apply.getAge()+"");
			row.createCell(4).setCellValue(apply.getIdcard()==null?"":apply.getIdcard());
			row.createCell(5).setCellValue(apply.getPosition()==null?"":apply.getPosition()+"");
			row.createCell(6).setCellValue(apply.getDepartment()==null?"":apply.getDepartment()+"");
			row.createCell(7).setCellValue(apply.getEducation()==null?"":apply.getEducation()+"");
			row.createCell(8).setCellValue(apply.getSchool()==null?"":apply.getSchool());
			row.createCell(9).setCellValue(apply.getExprement()==null?"":apply.getExprement());
			row.createCell(10).setCellValue(apply.getPhone()==null?"":apply.getPhone()+"");
			row.createCell(11).setCellValue(apply.getEmail()==null?"":apply.getEmail()+"");
			row.createCell(12).setCellValue(apply.getApplytime()==null?"":si.format(apply.getApplytime()).toString());
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

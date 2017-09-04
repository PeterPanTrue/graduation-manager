package com.graduation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.graduation.pojo.Checkable;
import com.sun.tools.javac.comp.Check;


public class ReadCheckExcel {
	private POIFSFileSystem fs;
	private HSSFWorkbook wb;
	private HSSFSheet sheet;
	private HSSFRow row;
	
	public List<Checkable> readExcel(File file){
		SimpleDateFormat si=new SimpleDateFormat("yyyy/MM/dd");
		List<Checkable> list=new ArrayList<Checkable>();
		InputStream in=null;
		try{
			in=new FileInputStream(file);
			fs=new POIFSFileSystem(in);
			wb=new HSSFWorkbook(fs);
			sheet=wb.getSheetAt(0);
			int rowNum=sheet.getLastRowNum();
			row=sheet.getRow(0);
			int column=row.getPhysicalNumberOfCells();
			for(int i=1;i<=rowNum;i++){
				row=sheet.getRow(i);
				Checkable check=new Checkable();
				
				BigDecimal bd = new BigDecimal(getCellFormatValue(row.getCell(0)).trim()); 
				String str = bd.toPlainString();   //将2.0180000E7  转为201800000
				int a = Integer.parseInt(str);
				
				check.setMemberid(a);
				check.setMembername(getCellFormatValue(row.getCell(1)).trim());
				check.setChecktime(si.parse(getCellFormatValue(row.getCell(2)).trim()));
				check.setOntime((int)Double.parseDouble(getCellFormatValue(row.getCell(3)).trim()));
				check.setAleave((int)Double.parseDouble(getCellFormatValue(row.getCell(4)).trim()));
				check.setMissing((int)Double.parseDouble(getCellFormatValue(row.getCell(5)).trim()));
				check.setLate((int)Double.parseDouble(getCellFormatValue(row.getCell(6)).trim()));
				check.setVacation((int)Double.parseDouble(getCellFormatValue(row.getCell(7)).trim()));
				check.setGoout((int)Double.parseDouble(getCellFormatValue(row.getCell(8)).trim()));
				check.setPlus((int)Double.parseDouble(getCellFormatValue(row.getCell(9)).trim()));
				check.setCreateperson(getCellFormatValue(row.getCell(10)).trim());
				list.add(check);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	public String getCellFormatValue(HSSFCell cell) {
		String cellValue="";
		if(cell!=null){
			switch(cell.getCellType()){
				case HSSFCell.CELL_TYPE_NUMERIC:
				case HSSFCell.CELL_TYPE_FORMULA:
					if(HSSFDateUtil.isCellDateFormatted(cell)){
						Date date=cell.getDateCellValue();
						SimpleDateFormat si=new SimpleDateFormat("yyyy/MM/dd");
						cellValue=si.format(date);
					}else{
						cellValue=String.valueOf(cell.getNumericCellValue());
					}
					break;
				case HSSFCell.CELL_TYPE_STRING:
					cellValue=cell.getRichStringCellValue().getString();
					break;
				default:
					cellValue="";
			}
			
		}else{
			cellValue="";
		}
		return cellValue;
	}
}

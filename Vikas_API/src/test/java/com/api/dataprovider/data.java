package com.api.dataprovider;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class data {

  @DataProvider(name ="input")
  public Object[][] dp() throws IOException {
	  
	 
    
    FileInputStream fis = new FileInputStream("C:\\Users\\SANJEEV\\eclipse-workspace\\Vikas_API\\src\\Test data\\API data.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sh = wb.getSheetAt(0);
    
    
  //  Object[][] d = new Object[sh.getLastRowNum()][2];
    Object[][] d = new Object[2][2];
    
    for(int i =2;i<=3;i++) {
    	  for(int j =4;j<=5;j++) {
    		  
    		  d[i-2][j-4] = sh.getRow(i).getCell(j).getStringCellValue();
    	    	   	
    	  }}
	return d;
    }
  

  @DataProvider(name ="output")
  public Object[][] dp1() throws IOException {
	  
	  
    FileInputStream fis = new FileInputStream("C:\\Users\\SANJEEV\\eclipse-workspace\\Vikas_API\\src\\Test data\\API data.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sh = wb.getSheetAt(0);
    
    
  //  Object[][] d = new Object[sh.getLastRowNum()][2];
    Object[][] d = new Object[2][2];
    
    for(int i =2;i<=3;i++) {
    	  for(int j =6;j<=7;j++) {
    		  
    		  d[i-2][j-6] = sh.getRow(i).getCell(j).getStringCellValue();
    	    	   	
    	  }}
	return d;
    }}
  



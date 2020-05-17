package com.api.dataprovider;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

public class data {

  @DataProvider(name ="api")
  public Object[][] dp() throws IOException {
	  
	  Object[][] d = new Object[5][2];
    
    FileInputStream fis = new FileInputStream("C:\\Users\\SANJEEV\\eclipse-workspace\\Vikas_API\\src\\Test data\\API data.xlsx");
    HSSFWorkbook wb = new HSSFWorkbook(fis);
    HSSFSheet sh = wb.getSheetAt(0);
    
    for(int i =2;i<=sh.getLastRowNum();i++) {
    	  for(int j =3;j<=4;j++) {
    		  
    		  d[i-1][j] = sh.getRow(i).getCell(j).getStringCellValue();
    	    	   	
    	  }}
	return d;
    }
  


@Test(dataProvider = "api",dataProviderClass = data.class)
public void a(String data,String c) {
	System.out.println(data);
}}

package com.cjc.webpage.flip.Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.cjc.webpage.flip.test.Test;


public class Common 
{

	public static Properties pro=new Properties();

    public static Logger log=Logger.getLogger(Test.class.getName());
  

  public static WebDriver driver;
  public static FileInputStream fil;
  public static XSSFWorkbook wb;
  public static XSSFSheet sheet;
  public static XSSFRow row;
  public static XSSFCell cell;
  
  public static FileInputStream fis;

  	
  	


  	
  	public static String excel() throws IOException
  	{

  		fil=new FileInputStream("F:\\Selenium_Abhi\\KeywrodFlipcart\\src\\test\\resources\\driver\\flipcartdemo.xlsx");
  		wb=new XSSFWorkbook(fil); 
  		sheet=wb.getSheet("sheet1"); 
  	String user=sheet.getRow(0).getCell(0).getStringCellValue();
  	return user;
  	
  	}
  	
  	
  	
  	
  	
  	public static String excel1() throws IOException
  	{
  		fil=new FileInputStream("F:\\Selenium_Abhi\\DDFFlipcart\\src\\test\\resources\\driver\\flipcartdemo.xlsx");
  		wb=new XSSFWorkbook(fil); 
  		sheet=wb.getSheet("sheet1"); 
  	    String pass=sheet.getRow(0).getCell(1).getStringCellValue();
  	    return pass;
  	
  	}
  	
  	public static String excel2() throws IOException
  	{
  		fil=new FileInputStream("F:\\Selenium_Abhi\\DDFFlipcart\\src\\test\\resources\\driver\\flipcartdemo.xlsx");
  		wb=new XSSFWorkbook(fil); 
  		sheet=wb.getSheet("sheet1"); 
  	    String pass=sheet.getRow(0).getCell(2).getStringCellValue();
  	    return pass;
  	
  	}



}

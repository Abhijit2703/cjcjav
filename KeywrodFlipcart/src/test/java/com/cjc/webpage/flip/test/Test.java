package com.cjc.webpage.flip.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.cjc.webpage.flip.Common.Common;
import com.cjc.webpage.flip.pom.Pom;

public class Test 
{

	@BeforeSuite
	public void openBrowser() throws IOException
	{
        FileInputStream fis=new FileInputStream("F:\\Selenium_Abhi\\KeywrodFlipcart\\src\\test\\resources\\driver\\flip.properties");
        Common.pro.load(fis);
		
		Common.log.info("in suite method");

		System.setProperty("webdriver.chrome.driver", Common.pro.getProperty("browser"));
		Common.driver=new ChromeDriver();
		Common.driver.manage().window().maximize();
	   
	
	}
	
	@BeforeTest
	public void openurl()
	{
		Common.log.info("BeforeTest");

	     Common.driver.get(Common.pro.getProperty("url"));
		Common.log.info("Hiii");
	}
	

	@org.testng.annotations.Test
	public void test() throws Exception
	{
		Common.log.info("Test method");

		Pom pom=PageFactory.initElements(Common.driver, Pom.class);
		pom.username();
	}
	
	   @AfterMethod
	  public void Screenshot() throws IOException
	  {
		   Common.log.info("After method");

		 File src=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFileToDirectory(src,new File("F:\\Selenium_Abhi\\DDFFlipcart\\src\\test\\resources\\Screenshotjava"));
		 Common.log.info("screenSHOTS"); 
      
	  }

	 
	  @AfterClass
	  public void cookies() 
	  {
		  Common.log.info("Deletecookies");

	  }

	  @AfterTest
	  public void DBclose()
	  {
		  Common.log.info("Databaseclose");

	  }

	   @AfterSuite
	  public void afterSuite()
	  {
		   Common.log.info("afterSuite");
		   Common.driver.close();
       }


}

package com.cjc.webpage.flip.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.webpage.flip.Common.Common;

public class Pom 
{

	 WebDriver driver;
	   	public Pom(WebDriver driver)
	   	{
	   		this.driver=driver;
	   	}
	   	
	   	@FindBy(css = "input[class=\"_2IX_2- VJZDxU\"]")
	   	WebElement un;
	   	
	   	@FindBy(css = "input[class=\"_2IX_2- _3mctLh VJZDxU\"]")
	       WebElement ps;	
	   	
	   	@FindBy(css = "button[class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
	   	WebElement login;
	   	
	   	@FindBy(css = "input[placeholder=\"Search for products, brands and more\"]")
	   	WebElement search;
	   	
	   	@FindBy(css = "svg[width=\"20\"]")
	   	WebElement seartching;
	   	
	 	
	   	
	   	public void username() throws Exception
	   	{
	   		String s=Common.excel();
	   		un.sendKeys(s);	
	   		
	   		String s1=Common.excel1();
	   		ps.sendKeys(s1);
	   		
	   		login.click();
	   		
	   		search.click();
	   		   		
	   		String s2=Common.excel2();
	   		search.sendKeys(s2);	
	   	
	   		seartching.click();
	   		Thread.sleep(3000);
	   		
	   	  String titleString= driver.getTitle();
	      System.out.println(titleString);

	   }

}

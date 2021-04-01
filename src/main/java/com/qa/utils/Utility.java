package com.qa.utils;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cpm.qa.testbase.Testbase;

public class Utility extends Testbase {
	
	 Actions action;
	public Utility(WebDriver driver) throws IOException {
		super();
		action=new Actions(driver);
		
		
	}

	public static int pageloadtime=20;
	public static int implicitwait=30;
	public static String configPath="C:\\Users\\pramo\\eclipse-workspace\\FreeeCRMcucumberBDDFramework123\\src\\main\\java\\cpm\\qa\\config\\config.properties";
	public  void moveToSpecifiedElement(WebDriver driver,WebElement ele)
	{
		
		action.moveToElement(ele).build().perform();

	}

}

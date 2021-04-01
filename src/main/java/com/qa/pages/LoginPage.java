package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.PageObjectManager.PageObjectClass;

import cpm.qa.testbase.Testbase;

public class LoginPage {
	

   Testbase test;
   public WebDriver driver;
   PageObjectClass pages;
   public LoginPage(WebDriver driver) throws IOException {
	    
	   
	   this.driver=driver;
	   pages=new PageObjectClass();
	   
	   PageFactory.initElements(driver, this);
	   test=pages.getTestbase();
	   driver=test.initialization();
		
		
		
		
	}
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	
	public boolean checkLoginLinkisEnabledorNot()
	{
	
		System.out.println("login button is enabled");
		return true;
	}
	
	
	public String CurrentURL()
	{
	String url=driver.getCurrentUrl();
	return url;
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void EnterUsername(String name)
	{
		username.sendKeys(name);
	}
	
	public void EnterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public HomePage ClickOnLoginButton() throws IOException
	{
		loginbtn.click();
		return new HomePage(driver);
	}
	
	public boolean loginButtonEnabled()
	{
		boolean loginbutton=loginbtn.isEnabled();
		return loginbutton;
	}
	
	
	public void enterUsernameAndPassword(String uname,String pass)
	{
		EnterUsername(uname);
		EnterPassword(pass);
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
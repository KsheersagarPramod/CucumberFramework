package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.PageObjectManager.PageObjectClass;
import com.qa.utils.Utility;

import cpm.qa.testbase.Testbase;

public class HomePage extends PageObjectClass  {

	WebDriver driver;
	HomePage home;
	LoginPage login;
	PageObjectClass pages;
		 

	public HomePage(WebDriver driver) throws IOException {
	
		super();
		PageFactory.initElements(driver,this);
		pages=new PageObjectClass();
		this.driver=driver;
		login=pages.getLoginPage();
		
		
		
	}

	//page objects
	
	@FindBy(xpath="//a[@href='/home']")
	WebElement homeicon;
	
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactIcon;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement NewContact;
	
	
	@FindBy(xpath="//div[@class='right menu']/span[text()='pramod Ksheersagar']")
	WebElement  UsernameLabel;

	@FindBy(xpath="//div[@class='ui fluid card']//div[@class='summary']/span/a")
	List<WebElement> contactActivityStream;
	
	@FindBy(xpath="//div[@id='main-nav']")
	WebElement Menu;
	
	@FindBy(xpath="//span[text()='pramod Ksheersagar']")
	WebElement username;
	
	
	
	
	
	@FindBy(xpath="//div[@class='right menu']//div[@class='ui buttons']/button[2]")
	WebElement deleteIcon;
	
	public int checkNumberOfLinks()
	{
		List<WebElement> numberOfLinks=driver.findElements(By.tagName("a"));
		int size=numberOfLinks.size();
		return size;
	}
	
	
	public void clickonContactIcon()
	{
		contactIcon.click();
	}
	public HomePage loginToHomePage(String username,String password) throws IOException
	{
		  login.enterUsernameAndPassword(username,password);
		  home =login.ClickOnLoginButton();
		  return home;
	}
	public boolean homeiconIsDisplayed()
	{
		return homeicon.isDisplayed();
	}
	
	public String titleOfHomePage()
	{
		return driver.getTitle();
	}
	public boolean deleteIconIsEnabledOrNot()
	{
		return  deleteIcon.isEnabled();
	}
	
	public String getUsernameLabel()
	{
		String username=UsernameLabel.getText();
		return username;
	}
	
	

}

package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.PageObjectManager.PageObjectClass;

public class NewContactPage extends PageObjectClass {

	public NewContactPage(WebDriver driver) throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename;
	
	@FindBy(xpath="//div[@class='ui right secondary pointing menu toolbar-container']/div/button[2]")
	WebElement SaveButton;
	
	public void EnterDetails(String un,String ln,String mid)
	
	{
		firstname.sendKeys(un);
		lastname.sendKeys(ln);
		middlename.sendKeys(mid);
		
		
	}
	public void ClickOnSaveButton()
	{
		SaveButton.click();
		
	}
	

}

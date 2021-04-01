package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cpm.qa.testbase.Testbase;

public class ContactPage extends Testbase {
	
	public ContactPage(WebDriver driver) throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//div[@class='table-wrapper']//child::tbody/tr/td[2]/a")
	List<WebElement> username;
	
	@FindBy(xpath="//div[@class='ui right secondary pointing menu toolbar-container']//a[@href='/contacts/new']/button")
	WebElement newButtton;
	
	@FindBy(xpath="//form[@class='ui form segment custom-form-container']//input[@name='first_name']")
	WebElement Firstname;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement contactButton;
	
	@FindBy(xpath="//form[@class='ui form segment custom-form-container']//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//div[@class='ui right secondary pointing menu toolbar-container']/div/button[2]")
	WebElement saveButton;
	
	public void numberOfUsers()
	{
		int size=username.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(username.get(i).getText());
		}
	}
	
	
	public void clickOnContactButton()
	{
		contactButton.click();
	}
	public void clickOnnewButton()
	{
		newButtton.click();
	}
	
	
	
	public void FillFirstName(String nn)
	{
		Firstname.sendKeys(nn);
	}
	
	public void FillLastName(String nn)
	{
		lastname.sendKeys(nn);
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	
	
	
	

}

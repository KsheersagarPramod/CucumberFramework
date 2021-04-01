package com.qa.PageObjectManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.NewContactPage;
import com.qa.utils.Utility;
import cpm.qa.testbase.Testbase;

public class PageObjectClass extends Testbase {
	
	Testbase test;
	WebDriver driver;
	public PageObjectClass() throws IOException {
		super();
		test=new Testbase();
		driver=test.initialization();
		}
	
	public WebDriver returnDriver()
	{
		return driver;
	}
	
	

	private LoginPage loginPage;
	private Utility utility;
	private HomePage homePage;
	private ContactPage contactPage;
	private Testbase testss;
    private NewContactPage newcontactPage;
	public LoginPage getLoginPage() throws IOException{
	 
	 return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	 
	 }
	 
	public Utility getUtilityPage() throws IOException{
		 
		 return (utility == null) ? utility = new Utility(driver) : utility;
		 
		 }
	 
	 public ContactPage getContactPage() throws IOException {
	 
	 return (contactPage == null) ? contactPage = new ContactPage(driver) : contactPage;
	 
	 }
	 
	 public NewContactPage getNewContactPage() throws IOException {
		 
		 return (newcontactPage == null) ? newcontactPage = new NewContactPage(driver) : newcontactPage;
		 
		 }
		 
	 public HomePage getHomePage() throws IOException {
		 
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
		 
		 }
	 
 public Testbase getTestbase() throws IOException {
		 
		 return (testss == null) ? testss = new Testbase() : testss;
		 
		 }
 
 
	 
	 
	 
	 

}

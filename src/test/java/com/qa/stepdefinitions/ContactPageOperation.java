package com.qa.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.PageObjectManager.PageObjectClass;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.NewContactPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactPageOperation  extends PageObjectClass {

	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ContactPage contacts;
	NewContactPage newcontactPage;
	
	PageObjectClass pages;
	public ContactPageOperation() throws IOException {
		super();
		pages=new PageObjectClass();
		driver=pages.returnDriver();
		login=pages.getLoginPage();
		home=pages.getHomePage();
		contacts=pages.getContactPage();
		newcontactPage=pages.getNewContactPage();
		
	}
		
		@Given("^user already  on home Page$")
		public void user_already_on_home_Page() throws IOException {
		 
			login.enterUsernameAndPassword("pkpramodksheersagar@gmail.com","Pramod@123");
			home=login.ClickOnLoginButton();
		}

		@Then("^user click on contact icon$")
		public NewContactPage user_click_on_contact_icon() throws IOException  {
			WebElement ele=driver.findElement(By.xpath("//a[@href='/contacts']"));
			Actions action=new Actions(driver);
			action.moveToElement(ele).build().perform();
			return newcontactPage= home.clickonContactIcon();
			
		}

		@Then("^user click on create button in contact page$")
		public void user_click_on_create_button_in_contact_page() throws Throwable {
			newcontactPage=contacts.clickOnContactButton();
		}

		@Then("^provide the details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
		public void provide_the_details_and_and(String fname, String middlename, String lastname) throws Throwable {
		
			newcontactPage=pages.getNewContactPage();
			newcontactPage.EnterDetails(fname,middlename,lastname);
			
		}

		@Then("^click on save button$")
		public void click_on_save_button() throws Throwable {
		
			newcontactPage.ClickOnSaveButton();
		}

		
		
		
	}
	
	



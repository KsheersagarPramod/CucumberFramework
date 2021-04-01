package com.qa.stepdefinitions;

import com.qa.PageObjectManager.PageObjectClass;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Then;

public class ContactPageStepDef {
	
	PageObjectClass pages;
	ContactPage contacts;
	LoginPage login;
	
	
	@Then("^user puts \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_puts_and(String arg1, String arg2) throws Throwable {
		pages=new PageObjectClass();
		login=pages.getLoginPage();
		contacts=pages.getContactPage();
		contacts.FillFirstName(arg1);
		contacts.FillLastName(arg2);
		login.ClickOnLoginButton();
		
	
		
	    
	}

	@Then("^check the title of homePage$")
	public void check_the_title_of_homePage() throws Throwable {
		
		System.out.println("hiii i am in homePage");
	    
	}

	@Then("^find the numbers of link in homePage$")
	public void find_the_numbers_of_link_in_homePage() throws Throwable {
		
		
	    
	}

	@Then("^need to check the number of users in contact page$")
	public void need_to_check_the_number_of_users_in_contact_page() throws Throwable {
	 
		contacts.numberOfUsers();
	}

	@Then("^need to add new contact by clicking on new button$")
	public void need_to_add_new_contact_by_clicking_on_new_button() throws Throwable {
		
	    contacts.clickOnnewButton();
	}

	@Then("^fill all the details$")
	public void fill_all_the_details() throws Throwable {
	   contacts.FillFirstName("pramod");
	   contacts.FillLastName("ksheersagar");
	   contacts.clickOnSaveButton();
		
	}

}

package com.qa.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.PageObjectManager.PageObjectClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cpm.qa.testbase.Testbase;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefinitions extends PageObjectClass  {
	
	public LoginStepDefinitions() throws IOException {
		super();
		
	}


	public LoginPage login;
	public Testbase test;
	public PageObjectClass pages;
	HomePage home;
	
	
	
	
	

@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
	
	   pages=new PageObjectClass();   
	   test= pages.getTestbase();
	   test.initialization();
 
    
}

@Then("^user checks the title of page and title of page should be \"([^\"]*)\"$")
public void user_checks_the_title_of_page_and_title_of_page_should_be(String expTittle) throws Throwable {
   
   login=pages.getLoginPage();
  
   Assert.assertEquals(expTittle,"Pramod");
}

@Then("^user checks the current url$")
public void user_checks_the_current_url() throws Throwable {
 
    String url=login.CurrentURL();
	System.out.println("Current Url"+url);
}

@Then("^quit the browser$")
public void quit_the_browser() throws Throwable {
    
	System.out.println("we are closing the browser");
	login.closeBrowser();
	
}

@Then("^user checks the forgot link enabled or not$")
public void user_checks_the_forgot_link_enabled_or_not() throws Throwable {
	
	login.checkLoginLinkisEnabledorNot();
   System.out.println("forgot link is enabled or not");
}

@Then("^user checks the register link is enabled or not$")
public void user_checks_the_register_link_is_enabled_or_not() throws Throwable {
 
	System.out.println("user check register link is enabled or not");
}

@Then("^user checks the login button enabled or not$")
public void user_checks_the_login_button_enabled_or_not() throws Throwable {
	System.out.println("login button enabled"+login.loginButtonEnabled());
}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String name, String pass) throws Throwable {
	
	pages=new  PageObjectClass();
	login=pages.getLoginPage();
    login.enterUsernameAndPassword(name,pass);
   
   
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
 
	home=login.ClickOnLoginButton();
}

@Then("^user checks the title of home page$")
public void user_checks_the_title_of_home_page() throws Throwable {
    System.out.println("title of home page");
}

@Then("^user expecting the error massage and massge should be \"([^\"]*)\"$")
public void user_expecting_the_error_massage_and_massge_should_be(String arg1) throws Throwable {
    
	System.out.println("user expecting error");
}

}

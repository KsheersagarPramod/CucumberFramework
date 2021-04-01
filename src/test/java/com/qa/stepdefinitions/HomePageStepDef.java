package com.qa.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.PageObjectManager.PageObjectClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.Utility;

import cpm.qa.testbase.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageStepDef extends PageObjectClass {
	

LoginPage login;
HomePage home;
PageObjectClass pages;
public HomePageStepDef() throws IOException {
		super();
		pages=new PageObjectClass();
		login=pages.getLoginPage();
		home=pages.getHomePage();
}

@Then("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
	home=login.ClickOnLoginButton();
}

@Then("^user enter username \"([^\"]*)\" and  password \"([^\"]*)\"$")
public void user_enter_username_and_password(String username, String password) throws Throwable {
   
	login=pages.getLoginPage();
	login.enterUsernameAndPassword(username,password);
	
	
}

@Then("^user is on home Page$")
public void user_is_on_home_Page() throws Throwable {
   String tit= home.titleOfHomePage();
   System.out.println(tit);
}


@Then("^user is on home Page and check the title of home Page$")
public String  user_is_on_home_Page_and_check_the_title_of_home_Page() throws Throwable {
 
String title=home.titleOfHomePage();
	return title;
	
}

@Then("^user checks the number of links available on home page$")
public void user_checks_the_number_of_links_available_on_home_page() throws Throwable {
    int count= home.checkNumberOfLinks();
    System.out.println("count of links"+count);
}

@Then("^check the title of the home page$")
public void check_the_title_of_the_home_page() throws Throwable {
    
	String title1=home.titleOfHomePage();
	System.out.println("title of home page"+title1);
}

@Then("^user checks the username consist of \"([^\"]*)\"$")
public void user_checks_the_username_consist_of(String username) throws Throwable {
   String result= home.getUsernameLabel();
    Assert.assertEquals(username, result);
}
	
	
}

package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.PageObjectManager.PageObjectClass;

public class NewContactPage extends PageObjectClass {

	public NewContactPage(WebDriver driver) throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	

	

}

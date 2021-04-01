package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\pramo\\eclipse-workspace\\FreeeCRMcucumberBDDFramework123\\src\\test\\java\\com\\qa\\features\\ContactPageOperation.feature", //the path of the feature files
		glue={"com\\qa\\stepdefinitions"}, //the path of the step definition files
		dryRun=false,
		monochrome=true
	   //tags= {"@smokeTest,@Regression"}
		)
		


public class TestRunner {

}

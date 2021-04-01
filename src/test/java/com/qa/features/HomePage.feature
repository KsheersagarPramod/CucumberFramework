Feature: Home Page functonality

Background:
Given user is on login page
Then user enter username "pkpramodksheersagar@gmail.com" and  password "Pramod@123"
Then user click on login button
Then user is on home Page


Scenario: check the numbers of links in contact page
Then user checks the number of links available on home page
Then quit the browser

Scenario: Check the title of the home page
Then check the title of the home page
Then quit the browser

Scenario:check the username correctly displayed in homePage
Then user checks the username consist of "pramod Ksheersagar"
Then quit the browser





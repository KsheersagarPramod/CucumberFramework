Feature: Login Functionallity

Background:
Given user is on login page

Scenario: Login to check the title of page and url
Then user checks the title of page and title of page should be "pramod"
Then user checks the current url
Then quit the browser


Scenario: Login page links are enabled or not
Then user checks the forgot link enabled or not
Then user checks the register link is enabled or not
Then user checks the login button enabled or not

Scenario Outline: Login with valid Credentials
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user checks the title of home page
Then quit the browser

Examples:
  |  username  | password |
  |pkpramodksheersagar@gmail.com | Pramod@123 |
  |pkpramodksheersagar@gmail.com |Pramod@123  |
  
Scenario Outline: Login with invalid credentials
Then user enters "<username1>" and "<password1>"
Then user clicks on login button
Then user expecting the error massage and massge should be "pramod"
Then quit the browser 

Examples:
 |  username1 | password1 |
  |pkpramodksheersagar@gmail.com | Pramod@123 |
  |pkpramodksheersagar@gmail.com |Pramod@123  |

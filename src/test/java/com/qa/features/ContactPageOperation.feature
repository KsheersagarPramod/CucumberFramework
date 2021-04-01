Feature: Updating the contact details

Scenario Outline: Adding the contact details
Given user already  on home Page
Then user click on contact icon
Then user click on create button in contact page 
And provide the details "<firstname>" and "<lastname>" and "<middlename>"
Then click on save button
 

Examples:
| firstname | lastname | middlename |
 
|Pramod     |Ksheersagar | Maruti |
|Irfan      | Konnur |    M|
|Akshay     | Lokare  | MMM |
Feature: Feature to test login feature
   	Scenario: Check login feature with valid credentials
   	
   	Given user is on login page
   	When user enters username and password
   	And click on login button
   	Then user is navigated to home page
Feature: Test the search functionality in google

  Scenario: open the browser and enters the spcific keys in search tab
    Given user is open the chrome browser
    When user enters "automation step by step" in search tab
    And navigate to Home page
    Then close the browser

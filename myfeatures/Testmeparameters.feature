
Feature: Title of your feature
Background:
Given: Testme is launched by user
Then: Click on signin link
  Scenario Outline: Login validation for multiple users on testme app
    Given testme is launched by the user
    When user clicks on Signin link in landing page
    Then user provides the valid username "<uname>"
    And user provides the valid password "<password>"
    Then user clicks for the submission of the data
    And verifies the login status for the account



    Examples: 
      | uname  | password | 
      | lalitha| Password123|    
      | admin  | Password456|    

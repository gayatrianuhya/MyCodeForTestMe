Feature: My validations on Mercury Tools
  Scenario: Login validations by registered user
    Given User has launched the application
    Then User enters the valid credentials
    And User clicks on submit button
    Then User Verifies the login status
    
    Scenario: Guest User registration in Mecury Tours
    Given User launched the app of mecury tours
    Then User clicks on Signup link
    When User enters the valid data in the form
    And User clicks on submit button available
    Then User Verifies the registration status
    
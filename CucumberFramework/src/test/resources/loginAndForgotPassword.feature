Feature: To validate the login functionality

  Background: 
    Given user has to launch the chrome and hit the Fb url

  Scenario: To verify the login functionality
    When user has to enter the username and password
      | vinith | 12345 |
    And click the login button
    Then user unable to enter the homepage

  Scenario Outline: To verify the Forgot Password Link
    When user has to click the Forgot Password Link
    And user has to enter the "<MobileNumber>"
    And click search
    Then user has to navigate to the Identify account dialogue box

    Examples: 
      | MobileNumber |
      |   8825974058 |

Feature: To validate the login functionality

  Scenario: To verify the login functionality
    Given user has to launch the chrome and hit the Fb url
    When user has to enter username and password
      | vinith | 12345 | five | 21-01 |
      | kumar  | 54321 | four | 23-01 |
    And click the login button
    Then user unable to enter the homepage

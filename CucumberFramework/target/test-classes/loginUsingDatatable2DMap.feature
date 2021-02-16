Feature: To validate the login functionality

  Scenario: To verify the login functionality
    Given user has to launch the chrome and hit the Fb url
    When users have to enter username and the password
      | username | password |
      | vinith   |    12345 |
      | barath   |    54321 |
      | sudhan   |    67890 |
    And click the login button
    Then user unable to enter the homepage

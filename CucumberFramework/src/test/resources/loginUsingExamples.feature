Feature: To validate the login functionality

  Scenario Outline: To verify the login functionality
    Given user has to launch the chrome and hit the Fb url
    When user has to enter the "<username>" and "<password>"
    And click the login button
    Then user unable to enter the homepage

    Examples: 
      | username | password |
      | vinith   |    12345 |
      | kumar    |    54321 |
      | barath   |    67890 |
      | kumar1   |    09876 |

  Scenario Outline: To verify the Forgot Password Link
    When user has to click the Forgot Password Link
    And user has to enter the "<MobileNumber>"
    And click search
    Then user has to navigate to the Identify account dialogue box

    Examples: 
      | MobileNumber |
      |   8825974058 |

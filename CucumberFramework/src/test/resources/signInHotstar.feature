Feature: To sign in the hotstar

  @Smoke
  Scenario: To sign in the hotstar
    When user has to give the credentials
    And user has to click the signin button
    Then user should view the hotstar homepage

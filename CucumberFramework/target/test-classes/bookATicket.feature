@Apple
Feature: To validate ticket booking
 
  @Sanity
  Scenario: To validate ticket booking
    When user has to sign in
    And user has to choose the category of a domain
    And user has to give the count of tickets
    Then user will be in the ticket booking page
  @Smoke @Sanity
  Scenario: To make a payment
  When user has to choose the platform 
  And user has to choose the mode of transactions
  And user has to verify the capcha
  Then user will be in the ticket successfully booked page

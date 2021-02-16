Feature: To validate if a product is added to cart

  Scenario: To validate if a product is added to cart
    Given user should launch the browser and hit the sears url
    When user has to move the cursor to clothing menu
    And user has to click the Coats & Jackets below the Mens clothing
    And user should move to the Mens coats & Jackets product page
    And user has to scroll down and click any product title
    And user should move to the Add to cart page
    And user should select size and color
    And user should click the Add to Cart button
    And user should click the Go to Cart button
    Then user should view the Your Cart page

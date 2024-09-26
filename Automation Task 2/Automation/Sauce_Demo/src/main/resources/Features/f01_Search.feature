@smoke
Feature:
  Scenario Outline: Open Amazon and Search for Car Accessories
    Given Navigate to URL website
    When Search for Car Accessories
    And Select the First Item
    And Add Item to Cart
    Then Verify Item in Cart


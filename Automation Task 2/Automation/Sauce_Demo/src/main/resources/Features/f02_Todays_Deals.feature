@smoke
Feature: Today's Deals and Add Item to Cart
  Scenario Outline: Sorting all items by price
    Given Navigate To URL website
    When Open Today's Deals
    And Apply Filters
    And Apply Discount Filter
    Then Navigate to Fourth Page and Select Item

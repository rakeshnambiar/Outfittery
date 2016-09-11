@Outfittery
Feature: To check the Starting price for Shirts

  @WebOutfitteryPriceSearchTest
  Scenario: To verify the starting price for the shirts
    Given I am an user of Outfittery webportal
    When I click on the Prices option from the home page
    Then I should able to see the starting price of all the products
    And Starting price for the shirts should be "40€"


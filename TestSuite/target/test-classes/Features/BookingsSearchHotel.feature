@BookingsMobileTest
Feature: To verify the Hotel Search in Bookings.com

  @HotelSearch
  Scenario: To Check the Hotel search for a given city
    Given I am installing the Bookings.com application
    When I navigate to the Search hotel page
    And Select the City "Dubai"
    And Click the Search Hotel button
    Then I should able to see all the available hotels in "Dubai"

  @HotelSelection
  Scenario: To Check the Hotel search for a given city
    Given I am on the Hotel Search Result Page for the city "Dubai"
    When I selects a hotel from the Search Result Page
    Then I should get the details of the selected hotel
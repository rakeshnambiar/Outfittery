@WebPropertySearch
Feature: As a user
         I want the list of the least expensive apartment to rent in the given place which has at least given minium bedrooms"

@PropertySearch
Scenario Outline: Least expensive property search for the least given <bedrooms> Bed Rooms in the area - <location>
  Given I am a user of Property finder Web portal
  When I fill the "<location>" preference
  And Entered the minimum "<bedrooms>" requirements
  And Clicked on the Search Button
  Then System should populate the search results according to my search criteria
  When I select the last item from the Search Result
  Then I should able to see the property details with requested minimum "<bedrooms>"

  Examples:
  |location      |bedrooms|
  |Dubai Marina  |2       |
  |Deira         |3       |
  |Sharjah Rolla |1       |
  |Ajman         |4       |
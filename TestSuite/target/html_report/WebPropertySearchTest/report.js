$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/PropertyFinder.feature");
formatter.feature({
  "line": 2,
  "name": "As a user",
  "description": "       I want the list of the least expensive apartment to rent in the given place which has at least given minium bedrooms\"",
  "id": "as-a-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WebPropertySearch"
    }
  ]
});
formatter.before({
  "duration": 2528877080,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Least expensive property search for the least given 2 Bed Rooms in the area - Dubai Marina",
  "description": "",
  "id": "as-a-user;least-expensive-property-search-for-the-least-given-\u003cbedrooms\u003e-bed-rooms-in-the-area---\u003clocation\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@WebPropertySearch"
    },
    {
      "line": 5,
      "name": "@PropertySearch"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am a user of Property finder Web portal",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fill the \"Dubai Marina\" preference",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Entered the minimum \"2\" requirements",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Clicked on the Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "System should populate the search results according to my search criteria",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I select the last item from the Search Result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should able to see the property details with requested minimum \"2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "propertyFinderImpl.i_am_a_user_of_Property_finder_Web_portal()"
});
formatter.result({
  "duration": 6816013717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai Marina",
      "offset": 12
    }
  ],
  "location": "propertyFinderImpl.i_fill_the_preference(String)"
});
formatter.result({
  "duration": 391309722,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "propertyFinderImpl.entered_the_minimum_requirements(String)"
});
formatter.result({
  "duration": 315313109,
  "status": "passed"
});
formatter.match({
  "location": "propertyFinderImpl.clicked_on_the_Search_Button()"
});
formatter.result({
  "duration": 3934803359,
  "status": "passed"
});
formatter.match({
  "location": "propertyFinderImpl.system_should_populate_the_search_result_according_to_my_search_criteria()"
});
formatter.result({
  "duration": 46838325,
  "status": "passed"
});
formatter.match({
  "location": "propertyFinderImpl.i_select_the_last_item_from_the_Search_Result()"
});
formatter.result({
  "duration": 3927350642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 66
    }
  ],
  "location": "propertyFinderImpl.i_should_able_to_see_the_property_details_with_requested_minimum(String)"
});
formatter.result({
  "duration": 102431771,
  "status": "passed"
});
formatter.after({
  "duration": 588911990,
  "status": "passed"
});
formatter.before({
  "duration": 1716855351,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Least expensive property search for the least given 3 Bed Rooms in the area - Deira",
  "description": "",
  "id": "as-a-user;least-expensive-property-search-for-the-least-given-\u003cbedrooms\u003e-bed-rooms-in-the-area---\u003clocation\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@WebPropertySearch"
    },
    {
      "line": 5,
      "name": "@PropertySearch"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am a user of Property finder Web portal",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fill the \"Deira\" preference",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Entered the minimum \"3\" requirements",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Clicked on the Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "System should populate the search results according to my search criteria",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I select the last item from the Search Result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should able to see the property details with requested minimum \"3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "propertyFinderImpl.i_am_a_user_of_Property_finder_Web_portal()"
});
formatter.result({
  "duration": 5776375264,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deira",
      "offset": 12
    }
  ],
  "location": "propertyFinderImpl.i_fill_the_preference(String)"
});
formatter.result({
  "duration": 369888548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "propertyFinderImpl.entered_the_minimum_requirements(String)"
});
formatter.result({
  "duration": 349531633,
  "status": "passed"
});
formatter.match({
  "location": "propertyFinderImpl.clicked_on_the_Search_Button()"
});

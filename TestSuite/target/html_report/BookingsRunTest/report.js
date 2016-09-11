$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/BookingsSearchHotel.feature");
formatter.feature({
  "line": 2,
  "name": "To verify the Hotel Search in Bookings.com",
  "description": "",
  "id": "to-verify-the-hotel-search-in-bookings.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BookingsMobileTest"
    }
  ]
});
formatter.before({
  "duration": 8574613451,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To Check the Hotel search for a given city",
  "description": "",
  "id": "to-verify-the-hotel-search-in-bookings.com;to-check-the-hotel-search-for-a-given-city",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@HotelSearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am installing the Bookings.com application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Select the City \"Dubai\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click the Search Hotel button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should able to see all the available hotels in \"Dubai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingsDotComImpl.i_am_installing_the_Bookings_com_application()"
});
formatter.result({
  "duration": 675278528,
  "status": "passed"
});
formatter.match({
  "location": "BookingsDotComImpl.i_navigate_to_the_Search_hotel_page()"
});
formatter.result({
  "duration": 5115511743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai",
      "offset": 17
    }
  ],
  "location": "BookingsDotComImpl.select_the_City(String)"
});
formatter.result({
  "duration": 16445761799,
  "status": "passed"
});
formatter.match({
  "location": "BookingsDotComImpl.click_the_Search_Hotel_button()"
});
formatter.result({
  "duration": 3216608548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai",
      "offset": 50
    }
  ],
  "location": "BookingsDotComImpl.i_should_able_to_see_all_the_available_hotels_in(String)"
});
formatter.result({
  "duration": 256007,
  "status": "passed"
});
formatter.after({
  "duration": 1733217972,
  "status": "passed"
});
formatter.before({
  "duration": 7264688490,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To Check the Hotel search for a given city",
  "description": "",
  "id": "to-verify-the-hotel-search-in-bookings.com;to-check-the-hotel-search-for-a-given-city",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@HotelSelection"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on the Hotel Search Result Page for the city \"Dubai\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I selects a hotel from the Search Result Page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should get the details of the selected hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai",
      "offset": 51
    }
  ],
  "location": "BookingsDotComImpl.i_am_on_the_Hotel_Search_Result_Page_for_the_city(String)"
});
formatter.result({
  "duration": 46644897408,
  "status": "passed"
});
formatter.match({
  "location": "BookingsDotComImpl.i_selects_a_hotel_from_the_Search_Result_Page()"
});
formatter.result({
  "duration": 6249792099,
  "status": "passed"
});
formatter.match({
  "location": "BookingsDotComImpl.i_should_get_the_details_of_the_selected_hotel()"
});
formatter.result({
  "duration": 690250092,
  "status": "passed"
});
formatter.after({
  "duration": 1644402253,
  "status": "passed"
});
});
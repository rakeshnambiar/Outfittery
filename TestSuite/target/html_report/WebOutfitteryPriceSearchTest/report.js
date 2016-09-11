$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/OutFittery.feature");
formatter.feature({
  "line": 2,
  "name": "To check the Starting price for Shirts",
  "description": "",
  "id": "to-check-the-starting-price-for-shirts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Outfittery"
    }
  ]
});
formatter.before({
  "duration": 2770111172,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To verify the starting price for the shirts",
  "description": "",
  "id": "to-check-the-starting-price-for-shirts;to-verify-the-starting-price-for-the-shirts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@WebOutfitteryPriceSearchTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am an user of Outfittery webportal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the Prices option from the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should able to see the starting price of all the products",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Starting price for the shirts should be \"40€\"",
  "keyword": "And "
});
formatter.match({
  "location": "outFitteryImpl.i_am_an_user_of_Outfittery_webportal()"
});
formatter.result({
  "duration": 10616306754,
  "status": "passed"
});
formatter.match({
  "location": "outFitteryImpl.i_click_on_the_Prices_option_from_the_home_page()"
});
formatter.result({
  "duration": 2325629918,
  "status": "passed"
});
formatter.match({
  "location": "outFitteryImpl.i_should_able_to_see_the_starting_price_of_all_the_products()"
});
formatter.result({
  "duration": 39897535,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40€",
      "offset": 41
    }
  ],
  "location": "outFitteryImpl.starting_price_for_the_shirts_should_be(String)"
});
formatter.result({
  "duration": 79564448,
  "status": "passed"
});
formatter.after({
  "duration": 603624400,
  "status": "passed"
});
});
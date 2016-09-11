package com.bookings.auto.test.Steps;

import com.bookings.auto.test.Constants.TestConstants;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.gl.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by rakeshnambiar on 7/22/16.
 */
public class propertyFinderImpl {
    private static WebDriver driver;
    private static String preferedRooms;

    @Before("@WebPropertySearch")
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After("@WebPropertySearch")
    public static void tierDown(){
        driver.quit();
    }

    @Given("^I am a user of Property finder Web portal$")
    public void i_am_a_user_of_Property_finder_Web_portal() throws Throwable {
        try {
            driver.get(TestConstants.DEFAULT_WEBADDRESS);
            Assert.assertEquals("ERROR: Web portal not loaded properly", TestConstants.DEFAULT_WEBADDRESS, driver.getCurrentUrl());
        }catch (Exception e){
            throw new Exception("ERROR: While Opening the request web portal - "+TestConstants.DEFAULT_WEBADDRESS);
        }
    }

    @When("^I fill the \"(.*?)\" preference$")
    public void i_fill_the_preference(String location) throws Throwable {
        try {
            driver.findElement(By.cssSelector(TestConstants.LOCATION_ELEMENT)).sendKeys(location);
            driver.findElement(By.cssSelector(TestConstants.LOCATION_ELEMENT)).sendKeys(Keys.TAB);
        }catch (Exception e){
            throw new Exception("ERROR: While Entering the location");
        }
    }


    @When("^Entered the minimum \"(.*?)\" requirements$")
    public void entered_the_minimum_requirements(String rooms) throws Throwable {
        try {
            boolean found = false;
            preferedRooms = rooms;
            driver.findElement(By.xpath(TestConstants.MINIMUM_BEDROOM_ELEMENT)).click();
            List<WebElement> bedrooms = driver.findElements(By.cssSelector(TestConstants.MINIMUM_BEDROOM_ITEMS_ELEMENT));
            for (int iterator = 0; iterator < bedrooms.size(); ++iterator) {
                if (bedrooms.get(iterator).getText().contains(rooms)) {
                    bedrooms.get(iterator).click();
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("ERROR: Request Minimum Bedrooms NOT available - " + rooms, found);
        }catch (Exception e){
            throw new Exception("ERROR: While Entering the Room Details");
        }
    }

    @When("^Clicked on the Search Button$")
    public void clicked_on_the_Search_Button() throws Throwable {
        try {
            driver.findElement(By.xpath(TestConstants.SEARCH_BUTTON_ELEMENT)).click();
        }catch (Exception e){
            throw new Exception("ERROR: While Clicks on the Search Button");
        }
    }

    @Then("^System should populate the search results according to my search criteria$")
    public void system_should_populate_the_search_result_according_to_my_search_criteria() throws Throwable {
        Assert.assertTrue("ERROR: Search Result Page NOT loaded properly",driver.findElement(By.id(TestConstants.SEARCH_RESULT_ELEMENT)).isDisplayed());
    }

    @When("^I select the last item from the Search Result$")
    public void i_select_the_last_item_from_the_Search_Result() throws Throwable {
        try {
            List<WebElement> resultItems = driver.findElements(By.cssSelector(TestConstants.SEARCH_RESULT_ITEMS_ELEMENT));
            if (resultItems.size() > 0) {
                resultItems.get(resultItems.size() - 1).click();
            } else {
                throw new Exception("ERROR: Search Results are NOT available");
            }
        }catch (Exception e){
            throw new Exception("ERROR: While selecting the last item from the first Page");
        }
    }

    @Then("^I should able to see the property details with requested minimum \"(.*?)\"$")
    public void i_should_able_to_see_the_property_details_with_requested_minimum(String arg1) throws Throwable {
        try {
            List<WebElement> facts = driver.findElements(By.cssSelector(TestConstants.SEARCH_RESULT_FACT_ROW_ELEMENT));
            facts.get(3).click();
            String[] bedRoomDetails = facts.get(3).getText().split(" ");
            if (!(Integer.parseInt(bedRoomDetails[1]) >= Integer.parseInt(preferedRooms))) {
                throw new AssertionError("ERROR: Preferred Minimum Rooms are NOT available in the selected option");
            } else {
                System.out.print("Verified the Minimum Room requirement");  //Can write and print it in the cucumber report
            }
        }catch (Exception e){
            throw new Exception("ERROR: While Verifying the Room Details in the Selected option");
        }
    }
}

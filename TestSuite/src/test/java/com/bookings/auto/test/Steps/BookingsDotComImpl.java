package com.bookings.auto.test.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by rakeshnambiar on 7/10/16.
 */
public class BookingsDotComImpl extends bookingsdotComFunctions{

    @Before("@BookingsMobileTest")
    public static void setUp() throws Exception {
        getLocalAndroidPhone();  //To Run the Local Android Emulator
        //getRemoteTestObjectDriver();  //To Run Test Object Cloud Device
    }

    @After("@BookingsMobileTest")
    public static void tearDown(){
        driver.quit();
    }

    @Given("^I am installing the Bookings\\.com application$")
    public void i_am_installing_the_Bookings_com_application() throws Throwable {
        Assert.assertTrue("ERROR: Application NOT installed",driver.isAppInstalled("com.booking"));
    }

    @When("^I navigate to the Search hotel page$")
    public void i_navigate_to_the_Search_hotel_page() throws Throwable {
        try {
            if (driver.findElement(By.id("com.booking:id/android_dcl_startup_skip")).isDisplayed()) {
                driver.findElement(By.id("com.booking:id/android_dcl_startup_skip")).click();
                driver.findElement(By.id("com.booking:id/btn_start_search")).click();
            }
        }catch (NoSuchElementException e){
            driver.findElement(By.id("com.booking:id/btn_start_search")).click();
        }

        try{
            WebElement backArrow = driver.findElement(By.xpath("com.booking:id/search_searchInput\n" +
                    "BackArrow - //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]"));
            if(backArrow.isEnabled()){
                backArrow.click();
            }
        }catch (NoSuchElementException e){}
    }

    @When("^Select the City \"(.*?)\"$")
    public void select_the_City(String arg1) throws Throwable {
        driver.findElement(By.id("com.booking:id/search_searchInput")).click();
        driver.findElement(By.id("com.booking:id/disam_search")).sendKeys("Dubai");
        driver.findElement(By.id("com.booking:id/disam_list_root")).click();

        List<WebElement> days = driver.findElements(By.id("com.booking:id/calendar_tv"));
        if(days.size() > 1){
            for(int iterator=days.size()-1; iterator > 0; --iterator){
                if(days.get(iterator).isEnabled()){
                    days.get(iterator).click();
                    break;
                }
            }
        }
    }

    @When("^Click the Search Hotel button$")
    public void click_the_Search_Hotel_button() throws Throwable {
        driver.findElement(By.id("com.booking:id/search_search")).click();
    }

    @Then("^I should able to see all the available hotels in \"(.*?)\"$")
    public void i_should_able_to_see_all_the_available_hotels_in(String arg1) throws Throwable {
        System.out.println("Results are available");
    }

    @Given("^I am on the Hotel Search Result Page for the city \"(.*?)\"$")
    public void i_am_on_the_Hotel_Search_Result_Page_for_the_city(String cityName) throws Throwable {
        i_am_installing_the_Bookings_com_application();
        i_navigate_to_the_Search_hotel_page();
        select_the_City(cityName);
        click_the_Search_Hotel_button();
    }

    @When("^I selects a hotel from the Search Result Page$")
    public void i_selects_a_hotel_from_the_Search_Result_Page() throws Throwable {
        driver.findElement(By.id("com.booking:id/sresult_thumb")).click();
    }

    @Then("^I should get the details of the selected hotel$")
    public void i_should_get_the_details_of_the_selected_hotel() throws Throwable {
        if(!driver.findElement(By.id("com.booking:id/book_now_layout")).isDisplayed()){
            throw new Exception("ERROR: Hotel Details are NOT loaded properly");
        }
    }
}

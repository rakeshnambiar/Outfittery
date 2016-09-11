package com.bookings.auto.test.Steps;

import com.bookings.auto.test.Constants.TestConstants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by rakeshnambiar on 7/23/16.
 */
public class outFitteryImpl {
    private static WebDriver driver;

    @Before("@Outfittery")
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After("@Outfittery")
    public static void tierDown(){
        driver.quit();
    }

    @Given("^I am an user of Outfittery webportal$")
    public void i_am_an_user_of_Outfittery_webportal() throws Throwable {
        try {
            driver.get(TestConstants.OF_DEFAULT_WEBADDRESS);
            Assert.assertEquals("ERROR: Web portal not loaded properly", TestConstants.OF_DEFAULT_WEBADDRESS, driver.getCurrentUrl());
        }catch (Exception e){
            throw new Exception("ERROR: While Opening the request web portal - "+TestConstants.OF_DEFAULT_WEBADDRESS);
        }
    }

    @When("^I click on the Prices option from the home page$")
    public void i_click_on_the_Prices_option_from_the_home_page() throws Throwable {
        driver.findElement(By.id(TestConstants.OF_PRICES_ELEMENT)).click();
    }

    @Then("^I should able to see the starting price of all the products$")
    public void i_should_able_to_see_the_starting_price_of_all_the_products() throws Throwable {
        Assert.assertTrue("ERROR: Price Page NOT loaded properly",driver.findElement(By.id(TestConstants.OF_PRICECOLUMN_ELEMENT)).isDisplayed());
    }

    @Then("^Starting price for the shirts should be \"(.*?)\"$")
    public void starting_price_for_the_shirts_should_be(String price) throws Throwable {
        if(driver.findElement(By.xpath(TestConstants.OF_SHIRTPRICE_ELEMENT)).isDisplayed()){
            String actulaPrice= driver.findElement(By.xpath(TestConstants.OF_SHIRTPRICE_ELEMENT)).getText();
            Assert.assertTrue("ERROR: Price is NOT Same. Actual Price - "+actulaPrice,actulaPrice.contains(price));
        }
    }
}

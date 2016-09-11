package com.bookings.auto.test.RunCukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@HotelSearch, @HotelSelection"},
        format = {"pretty", "html:target/html_report/BookingsRunTest/",
                "json:target/cucumber-report/BookingsRunTest.json"},
        features = {"src/test/resources/Features/BookingsSearchHotel.feature"},
        glue = {"com.bookings.auto.test"}
)
public class MobileHotelSearchTest {

}

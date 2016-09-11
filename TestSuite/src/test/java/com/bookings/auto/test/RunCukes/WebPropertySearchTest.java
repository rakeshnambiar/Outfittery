package com.bookings.auto.test.RunCukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@HotelSearch, @PropertySearch"},
        format = {"pretty", "html:target/html_report/WebPropertySearchTest/",
                "json:target/cucumber-report/WebPropertySearchTest.json"},
        features = {"src/test/resources/Features/PropertyFinder.feature"},
        glue = {"com.bookings.auto.test"}
)
public class WebPropertySearchTest {

}

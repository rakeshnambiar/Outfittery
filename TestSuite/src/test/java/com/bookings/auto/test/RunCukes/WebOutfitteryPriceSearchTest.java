package com.bookings.auto.test.RunCukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@WebOutfitteryPriceSearchTest"},
        format = {"pretty", "html:target/html_report/WebOutfitteryPriceSearchTest/",
                "json:target/cucumber-report/WebOutfitteryPriceSearchTest.json"},
        features = {"src/test/resources/Features/OutFittery.feature"},
        glue = {"com.bookings.auto.test"}
)
public class WebOutfitteryPriceSearchTest {

}

package com.bookings.auto.test.Steps;

import com.bookings.auto.test.Constants.TestConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by rakeshnambiar on 7/9/16.
 */
public class BookingsDotComTestNGImpl {
    private  static AppiumDriver driver;

    @Test(groups = {"Regression"},description = "SetUp")
    public static void setUp() throws MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/src/test/resources/Apps/");
        File app = new File(appDir, "BookingsDotCom.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.VERSION, TestConstants.ANDROID_VERSION);
        capabilities.setCapability("deviceName", TestConstants.ANDROID_DEF_DEVICENAME);
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.booking");
        capabilities.setCapability("appActivity", "com.booking.activity.StartActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue("ERROR: Application NOT installed",driver.isAppInstalled("com.booking"));
    }

    @Test(groups = {"Regression"},description = "GoToSearch",dependsOnMethods = "setUp")
    public static void gotToSearchPage(){
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

    @Test(groups = {"Regression"},description = "SearchFunction",dependsOnMethods = {"setUp","gotToSearchPage"})
    public static void performSearch(){
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

    @Test(groups = {"Regression"},description = "SearchFunction",dependsOnMethods = {"setUp","gotToSearchPage","performSearch"})
    public static void clickSearchButton() throws Exception{
        driver.findElement(By.id("com.booking:id/search_search")).click();
    }
}

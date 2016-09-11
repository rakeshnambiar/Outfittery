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

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by rakeshnambiar on 7/16/16.
 */
public class bookingsdotComFunctions {
    public static AppiumDriver driver;

    public static void getLocalAndroidPhone() throws Exception {
        try{
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
        }catch (Exception e){
            throw new Exception("ERROR: While Initialiazing the Device");
        }
    }

    public static void getRemoteTestObjectDriver() throws Exception {
        try{
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability(CapabilityType.VERSION, TestConstants.ANDROID_VERSION);
            capabilities.setCapability("deviceName", TestConstants.ANDROID_DEF_DEVICENAME);
            capabilities.setCapability("testobject_api_key", TestConstants.TESTOBJ_API_KEY);
            capabilities.setCapability("testobject_app_id",TestConstants.TESTOBJ_APP_ID);
            capabilities.setCapability("testobject_device", TestConstants.TESTOBJ_DEVICE_NAME);

            driver = new AndroidDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }catch (Exception e){
            throw new Exception("ERROR: While Initialiazing the Device");
        }
    }

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

    public static void clickSearchButton() throws Exception{
        driver.findElement(By.id("com.booking:id/search_search")).click();
    }
}

package com.bookings.auto.test.Constants;

/**
 * Created by rakeshnambiar on 7/20/16.
 */
public class TestConstants {

    /*Mobile Automation Data*/
    public static final String ANDROID_VERSION = "4.4";
    public static final String ANDROID_DEF_DEVICENAME = "AndroidEmulator";
    public static final String TESTOBJ_API_KEY="";
    public static final String TESTOBJ_APP_ID="1";
    public static final String TESTOBJ_DEVICE_NAME="LG_Nexus_4_E960_real";

    /*Web Automation Data and Elements*/
    public static final String DEFAULT_WEBADDRESS="https://www.propertyfinder.ae/";
    public static final String LOCATION_ELEMENT = "input[placeholder=\"City or Community or Tower\"]";
    public static final String MINIMUM_BEDROOM_ELEMENT = "//*[@id=\"bedroom_group\"]/div[1]/div/button";
    public static final String MINIMUM_BEDROOM_ITEMS_ELEMENT = "div[id=\"bedroom_group\"] > div:first-child > div > div > ul > li";
    public static final String SEARCH_BUTTON_ELEMENT = "//*[@id=\"search-form-property\"]/div[3]/div[1]/button";
    public static final String SEARCH_RESULT_ELEMENT = "serp";
    public static final String SEARCH_RESULT_ITEMS_ELEMENT = "section[id=\"serp\"] > ul > li";
    public static final String SEARCH_RESULT_FACT_ROW_ELEMENT = "section[id=\"property-facts\"] > table > tbody > tr";

    /*Outfittery Data*/
    public static final String OF_DEFAULT_WEBADDRESS = "https://www.outfittery.de/";
    public static final String OF_PRICES_ELEMENT = "menu-116";
    public static final String OF_PRICECOLUMN_ELEMENT = "column_section";
    public static final String OF_SHIRTPRICE_ELEMENT = "//*[@id=\"column_section\"]/div/div/div[2]/div[2]/p[2]";
}

package ui_tests.HomeTasks;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.StylusPageObject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 24.07.2015.
 */
public class HomeTask_2_Test extends TestBase{

    private String searchText ="Sony Z2";
    private String stylusURL = "http://stylus.com.ua/";



  //  private String iPhone

    @Test
    public void stilysSearchTest(){

        StylusPageObject stylusPageObject = new StylusPageObject(driver);
        stylusPageObject.open(stylusURL);

        assertEquals(driver.getCurrentUrl(), stylusURL, "Site not opened yet or open URL not stylus.com.ua");

        stylusPageObject.appleStoreButtonClick();
        stylusPageObject.iPhoneButtonClick();
        stylusPageObject.iPhoneCheckBoxClick();

        assertTrue(driver.getTitle().contains("Apple iPhone"), "This page not Apple iPhone's");

        stylusPageObject.setMinRange("20000");
        stylusPageObject.setMaxRange("30000");
        stylusPageObject.submitRangeClick();

        assertTrue(driver.getTitle().contains("Apple iPhone 6 128GB Space Gray"), "Title not contains Apple iPhone 6 128GB Space Gray");
        assertTrue(stylusPageObject.displayedResult().contains("Apple iPhone 6 128GB Space Gray"),"Apple iPhone 6 128GB Space Gray not found");

    }



}

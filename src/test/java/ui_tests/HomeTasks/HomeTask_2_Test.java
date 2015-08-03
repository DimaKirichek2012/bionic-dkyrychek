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
    public void stylusSearchTest(){

        StylusPageObject stylusPageObject = new StylusPageObject(driver);
        stylusPageObject.open(stylusURL);

        assertEquals(stylusPageObject.getCurrentUrl(), stylusURL, "Site not opened yet or open URL not stylus.com.ua");

        stylusPageObject.appleStoreButtonClick();
        stylusPageObject.iPhoneButtonClick();
        stylusPageObject.iPhoneCheckBoxClick();

        assertTrue(stylusPageObject.getTitle().contains("Apple iPhone"), "This page not Apple iPhone's");

        stylusPageObject.setRange("20000", "30000");
        stylusPageObject.submitRangeClick();

        assertTrue(stylusPageObject.getTitle().contains("Apple iPhone 6 128GB Space Gray"), "Title not contains Apple iPhone 6 128GB Space Gray");
        assertTrue(stylusPageObject.displayedResult().contains("Apple iPhone 6 128GB Space Gray"),"Apple iPhone 6 128GB Space Gray not found");

    }

}

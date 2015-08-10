package ui_tests.HomeTasks;

import core.TestBase;
import org.testng.annotations.Test;
import page.AppleiPhone6128GBPageObject;
import page.AppleiPhonePageObject;
import page.StylusBasePage;
import page.AppleStorePageObject;
import static org.testng.Assert.*;


/**
 * Created by Hasler on 24.07.2015.
 */
public class HomeTask_2_Test extends TestBase{

    private String stylusURL = "http://stylus.com.ua/";



    @Test
    public void stylusSearchTest()  {


        AppleStorePageObject stylusPageObject = new AppleStorePageObject(driver);
        StylusBasePage basePage = new StylusBasePage(driver);
        AppleStorePageObject appleStorePageObject = new AppleStorePageObject(driver);
        AppleiPhonePageObject appleiPhonePageObject = new AppleiPhonePageObject(driver);
        AppleiPhone6128GBPageObject appleiPhone6128GBPageObject = new AppleiPhone6128GBPageObject(driver);


        basePage.open(stylusURL);

        assertEquals(basePage.getCurrentUrl(), stylusURL, "Site not opened yet or open URL not stylus.com.ua");

        basePage.appleStoreButtonClick();
        appleStorePageObject.iPhoneButtonClick();
        appleiPhonePageObject.iPhoneCheckBoxClick();

        assertTrue(appleiPhonePageObject.getTitle().contains("Apple iPhone"), "This page not Apple iPhone's");

        appleiPhonePageObject.setRange("20000", "30000");
        appleiPhonePageObject.submitRangeClick();

        String title = appleiPhone6128GBPageObject.getTitle();
        assertTrue(title.contains("Apple iPhone "), "Title not contains Apple iPhone 6 128GB Space Gray. Value: "+title);
        assertTrue(appleiPhone6128GBPageObject.displayedResult().contains("Apple iPhone 6 128GB Space Gray"),"Apple iPhone 6 128GB Space Gray not found");

    }

}

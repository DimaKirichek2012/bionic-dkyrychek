package ui_tests.Lesson_7;

import core.TestBase;
import org.testng.annotations.Test;
import page.StylusBasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 24.07.2015.
 */
public class stylusTest  extends TestBase{

    private String searchText ="Sony Z2";
    private String stylusURL = "http://stylus.com.ua";


    @Test
    public void stilysSearchTest(){

        StylusBasePage basePageObject = new StylusBasePage(driver);
        basePageObject.open(stylusURL);
        basePageObject.enterSearchText(searchText);
        basePageObject.clickFindButton();

        assertTrue(basePageObject.searchLinkText().contains("Sony"));
    }

}

package ui_tests.Lesson_7;

import core.TestBase;
import org.testng.annotations.Test;
import page.StylusSearchPage;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 24.07.2015.
 */
public class stylusTest  extends TestBase{

    private String searchText ="Sony Z2";
    private String stylusURL = "http://stylus.com.ua";


    @Test
    public void stilysSearchTest(){

        StylusSearchPage onStylusSearchPage = new StylusSearchPage(driver);
        onStylusSearchPage.open(stylusURL);
        onStylusSearchPage.EnterSearchText(searchText);
        onStylusSearchPage.ClickFindButton();

        assertTrue(onStylusSearchPage.SearchLinkText().contains("Sony"));
    }

}

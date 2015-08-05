package ui_tests.Lesson_7;

import core.TestBase;
import org.testng.annotations.Test;
import page.AppleStorePageObject;
import page.BasePageObject;

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

        BasePageObject basePageObject = new BasePageObject(driver);
        basePageObject.open(stylusURL);
        basePageObject.EnterSearchText(searchText);
        basePageObject.ClickFindButton();

        assertTrue(basePageObject.SearchLinkText().contains("Sony"));
    }

}

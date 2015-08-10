package Asserts;

import core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 10.08.2015.
 */
public class AssertsRozetkaNotebookPage extends TestBase {
    public AssertsRozetkaNotebookPage(WebDriver driver) {
        this.driver = driver;
    }
    public void assertManufacturesDisplayed(List<WebElement> manufacturesList) {
        for (WebElement type:manufacturesList){
            assertTrue(type.isDisplayed());
        }
    }
}
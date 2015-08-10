package Asserts;

import core.TestBase;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

/**
 * Created by Hasler on 10.08.2015.
 */
public class AssertsRozetkaBasePage extends TestBase {
    public AssertsRozetkaBasePage (WebDriver driver) {
        this.driver = driver;
    }
    public void assertrozetkaUrl(String rozetkaURL) {
        assertEquals(driver.getCurrentUrl(), rozetkaURL, "Site not opened yet or open URL not rozetka.com.ua");
    }
}

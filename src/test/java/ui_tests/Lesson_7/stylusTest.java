package ui_tests.Lesson_7;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.StylusSearchPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 24.07.2015.
 */
public class stylusTest  extends TestBase{

    private String searchText ="Sony Z2";
    private String stylusURL = "http://stylus.com.ua";
    private WebElement findButton;

    @Test
    public void stilysSearchTest(){
        driver.get(stylusURL);
        StylusSearchPage onStylusSearchPage = new StylusSearchPage(driver);
        onStylusSearchPage.SearchElement(searchText);
        findButton=driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[2]"));
        findButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchLink = driver.findElement(By.xpath(".//*[@id='search-list']/ul/li[2]/a/span"));

        assertTrue(searchLink.getText().contains("Sony"));


    }
    @AfterTest
    public  void tearDown(){
        driver.quit();
    }
}

package ui_tests.HomeTasks;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 24.07.2015.
 */
public class HomeTask_1_Test extends TestBase {


    private String searchElement;
    private WebElement searchField;
    private WebElement searchLink;
    private WebElement findButton;

    @Test
    public void stilysSearchTest(){
        searchElement = "Sony Z2";
        driver.get("http://stylus.com.ua");
        searchField=driver.findElement(By.name("q"));
        searchField.sendKeys(searchElement);
        findButton=driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[2]"));
        findButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchLink = driver.findElement(By.xpath(".//*[@id='search-list']/ul/li[2]/a/span"));

        assertTrue(searchLink.getText().contains("Sony"));


    }

}

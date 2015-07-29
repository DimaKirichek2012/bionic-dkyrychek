package HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 24.07.2015.
 */
public class HomeTask_1_Test {

    private FirefoxDriver driver;
    private String searchElement;
    private WebElement searchField;
    private WebElement searchLink;
    private WebElement findButton;

    @BeforeTest
    public void setUp(){
        searchElement = "Sony Z2";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://stylus.com.ua");
    }

    @Test
    public void stilysSearchTest(){

        searchField=driver.findElement(By.name("q"));
        searchField.sendKeys(searchElement);
        findButton=driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[2]"));
        findButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchLink = driver.findElement(By.xpath(".//*[@id='search-list']/ul/li[2]/a/span"));

        assertTrue(searchLink.getText().contains("Sony"));


    }
    @AfterTest
    public  void tearDown(){
        driver.quit();s
    }
}

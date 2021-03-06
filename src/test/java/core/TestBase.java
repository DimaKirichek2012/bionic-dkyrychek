package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import page.GoogleSearchPage;
import ui_tests.TestData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by selenium on 29.07.2015.
 */
public class TestBase{
    protected WebDriver driver;
    protected static WebDriverWait webDriverWait;

    @BeforeSuite
    public void setUp() throws IOException{
        driver = WebDriverFactory.getWebDriver(TestData.BROWSER_NAME);
        webDriverWait = new WebDriverWait(driver,20);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

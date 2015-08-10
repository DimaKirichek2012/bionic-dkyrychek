package Asserts;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 10.08.2015.
 */
public class AssertsRozetkaComparePage extends TestBase {
    public AssertsRozetkaComparePage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertAppleMacBookPro15OnComparePage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='comparison-thead-row-first']/td[3]/div/div[2]/a")));
        WebElement appleMacBookPro15Compare = driver.findElement(By.xpath(".//*[@class='comparison-thead-row-first']/td[3]/div/div[2]/a"));
        assertTrue(appleMacBookPro15Compare.getText().contains("Apple MacBook Pro Retina 15\""));
    }

    public void assertAppleMacBookPro13OnComparePage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='comparison-thead-row-first']/td[2]/div/div[2]/a")));
        WebElement appleMacBookPro13Compare = driver.findElement(By.xpath(".//*[@class='comparison-thead-row-first']/td[2]/div/div[2]/a"));
        assertTrue(appleMacBookPro13Compare.getText().contains("Apple MacBook Pro Retina 13\""));
    }

}


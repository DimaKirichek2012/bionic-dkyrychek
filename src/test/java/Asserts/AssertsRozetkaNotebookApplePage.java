package Asserts;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 10.08.2015.
 */
public class AssertsRozetkaNotebookApplePage extends TestBase {
    public AssertsRozetkaNotebookApplePage(WebDriver driver) {
        this.driver = driver;
    }
    public void assertAppleMacBoocPro15OnCompareList() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='catalog-comparison']/div/ul/li[2]/a[2]")));
        WebElement catalogComparison15 = driver.findElement(By.xpath(".//*[@id='catalog-comparison']/div/ul/li[2]/a[2]"));
        assertTrue(catalogComparison15.getText().contains("Apple MacBook Pro Retina 15\""));
    }

    public void assertAppleMacBookPro13OnCompareList() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='catalog-comparison']/div/ul/li/a[2]")));
        WebElement catalogComparison13 = driver.findElement(By.xpath(".//*[@id='catalog-comparison']/div/ul/li/a[2]"));
        assertTrue(catalogComparison13.getText().contains("Apple MacBook Pro Retina 13\""));
    }

    public void assertNotebookApplePageOpened() {
        webDriverWait.until(ExpectedConditions.urlContains("http://rozetka.com.ua/notebooks/apple"));
        assertTrue(driver.getCurrentUrl().contains("http://rozetka.com.ua/notebooks/apple"));
    }
    public void assertManufacturesDisplayed(List<WebElement> manufacturesList) {
        for (WebElement type : manufacturesList) {
            assertTrue(type.isDisplayed());
        }
    }
    public void assertAppleMacBookPro13OnPage(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Z0QP000X6')]")));
        WebElement appleMacBookPro13 = driver.findElement(By.xpath("//a[contains(text(), 'Z0QP000X6')]"));
        assertTrue(appleMacBookPro13.getText().contains("Z0QP000X6"));
    }
    public void assertAppleMacBookPro15OnPage(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'MGXA2UA/A')]")));
        WebElement appleMacBookPro15 = driver.findElement(By.xpath("//a[contains(text(), 'MGXA2UA/A')]"));
        assertTrue(appleMacBookPro15.getText().contains("MGXA2UA/A"));
    }
}

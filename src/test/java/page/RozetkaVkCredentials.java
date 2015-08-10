package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Hasler on 08.08.2015.
 */
public class RozetkaVkCredentials extends TestBase {
    private WebDriver driver;

    public RozetkaVkCredentials(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String URL) {
        driver.get(URL);
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void submitVkCredentials() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("install_allow")));
        WebElement submitVkCredentials = driver.findElement(By.id("install_allow"));
        submitVkCredentials.click();
    }

    public void credentialsForVK(String Login,String pass) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='box']/div/input[6]")));
        WebElement phoneNumberforVk = driver.findElement(By.xpath(".//*[@id='box']/div/input[6]"));
        phoneNumberforVk.sendKeys(Login);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='box']/div/input[7]")));
        WebElement passForVk = driver.findElement(By.xpath(".//*[@id='box']/div/input[7]"));
        passForVk.sendKeys(pass);
    }
}

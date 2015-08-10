package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Hasler on 08.08.2015.
 */
public class RozetkaBasePage extends TestBase {
    private WebDriver driver;

    public RozetkaBasePage(WebDriver driver) {
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

    public void loginWithVK() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='btn-link btn-auth-vk sprite-side']/a")));
        WebElement loginWithVk = driver.findElement(By.xpath(".//*[@class='btn-link btn-auth-vk sprite-side']/a"));
        loginWithVk.click();
    }

    public void loginRozetka() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='header_user_menu_parent']/a")));
        WebElement login = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a"));
        login.click();
    }
    public void notebooksComputersButtonClick() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@menu_id='2']/a")));
        WebElement notebooksComputersButton = driver.findElement(By.xpath(".//*[@menu_id='2']/a"));
        notebooksComputersButton.click();
    }
}

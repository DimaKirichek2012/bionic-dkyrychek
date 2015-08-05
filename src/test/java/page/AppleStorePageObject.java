package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


/**
 * Created by selenium on 29.07.2015.
 */
public class AppleStorePageObject {

    private WebDriver driver;
    private WebElement iPhoneButton;

    public AppleStorePageObject(WebDriver driver) {
        this.driver = driver;
    }
     public void iPhoneButtonClick() throws InterruptedException {
        Thread.sleep(2000);
        iPhoneButton = driver.findElement(By.xpath(".//*[@id='content']/div[1]/ul/li[1]/a"));
        iPhoneButton.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}


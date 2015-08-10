package page;



import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by selenium on 29.07.2015.
 */
public class AppleStorePageObject  extends TestBase{

    private WebDriver driver;
    private WebElement iPhoneButton;


    public AppleStorePageObject(WebDriver driver) {
        this.driver = driver;
    }

     public void iPhoneButtonClick(){

        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='content']/div[1]/ul/li[1]/a")));
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


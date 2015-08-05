package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



/**
 * Created by selenium on 29.07.2015.
 */
public class  AppleiPhonePageObject {

    private WebDriver driver;
    private WebElement iPhoneCheckBox;
    private WebElement min;
    private WebElement max;
    private WebElement submitRange;


    public  AppleiPhonePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void iPhoneCheckBoxClick() throws InterruptedException {
        Thread.sleep(2000);
        iPhoneCheckBox = driver.findElement(By.xpath(".//*[@id='filter144']/li[6]/label/a"));
        iPhoneCheckBox.click();
    }

    public void setRange(String minRange, String maxRange) throws InterruptedException {
        Thread.sleep(2000);
        min = driver.findElement(By.id("min"));
        min.clear();
        min.sendKeys(minRange);
        max = driver.findElement(By.id("max"));
        max.clear();
        max.sendKeys(maxRange);
    }

    public void submitRangeClick() throws InterruptedException {
        Thread.sleep(2000);
        submitRange = driver.findElement(By.xpath(".//*[@id='filter']/fieldset/div[1]/div[2]/input"));
        submitRange.click();
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}


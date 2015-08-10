package page;



import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by selenium on 29.07.2015.
 */
public class  AppleiPhonePageObject extends TestBase {

    private WebDriver driver;
    private WebElement iPhoneCheckBox;
    private WebElement min;
    private WebElement max;
    private WebElement submitRange;


    public  AppleiPhonePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void iPhoneCheckBoxClick() {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='filter144']/li[6]/label/a")));
        iPhoneCheckBox = driver.findElement(By.xpath(".//*[@id='filter144']/li[6]/label/a"));
        iPhoneCheckBox.click();
    }

    public void setRange(String minRange, String maxRange) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("min")));
        min = driver.findElement(By.id("min"));
        min.clear();
        min.sendKeys(minRange);
        max = driver.findElement(By.id("max"));
        max.clear();
        max.sendKeys(maxRange);
    }

    public void submitRangeClick() {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='filter']/fieldset/div[1]/div[2]/input")));
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


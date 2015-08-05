package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Hasler on 04.08.2015.
 */
public class AppleiPhone6128GBPageObject {

    private WebDriver driver;
    private WebElement displayedResult;

    public AppleiPhone6128GBPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String displayedResult() {
        displayedResult = driver.findElement(By.xpath(".//*[@itemprop='name']"));
        return displayedResult.getText();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}

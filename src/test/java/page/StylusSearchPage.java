package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by selenium on 29.07.2015.
 */
public class StylusSearchPage extends TestBase {
    private String searchElement;
    private WebElement findButton;
    private WebElement searchField;
    private WebDriver driver;

    public StylusSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void SearchElement(String searchElement){
        searchField=driver.findElement(By.name("q"));
        searchField.sendKeys(searchElement);
    }
}

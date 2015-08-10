package page;


import core.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by Hasler on 04.08.2015.
 */
public class StylusBasePage extends TestBase {

    private WebDriver driver;
    private WebElement appleStoreButton;
    private WebElement searchField;
    private WebElement findButton;
    private WebElement searchLink;


    public StylusBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String URL) {
        driver.get(URL);
    }

    public void enterSearchText(String searchElement) {
        searchField = driver.findElement(By.name("q"));
        searchField.sendKeys(searchElement);
    }

    public void clickFindButton() {
        findButton = driver.findElement(By.xpath(".//*[@class='search']/form/input[2]"));
        findButton.click();
    }

    public String searchLinkText() {
        searchLink = driver.findElement(By.xpath("//*[@class='product-grid']/li[2]/a/span"));
        return searchLink.getText();
    }

    public void appleStoreButtonClick() {
        appleStoreButton = driver.findElement(By.cssSelector("#nav>li>a"));
        appleStoreButton.click();
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }


}


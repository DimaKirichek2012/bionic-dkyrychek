package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Hasler on 04.08.2015.
 */
public class BasePageObject {

    private WebDriver driver;
    private WebElement appleStoreButton;
    private WebElement searchField;
    private WebElement findButton;
    private WebElement searchLink;


    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String URL) {
        driver.get(URL);
    }

    public void EnterSearchText(String searchElement) {
        searchField = driver.findElement(By.name("q"));
        searchField.sendKeys(searchElement);
    }

    public void ClickFindButton() {
        findButton = driver.findElement(By.xpath(".//*[@class='search']/form/input[2]"));
        findButton.click();
    }

    public String SearchLinkText() {
        searchLink = driver.findElement(By.xpath("//*[@class='product-grid']/li[2]/a/span"));
        return searchLink.getText();
    }

    public void appleStoreButtonClick() {
        appleStoreButton = driver.findElement(By.cssSelector("#nav>li>a"));
        appleStoreButton.click();
    }

}


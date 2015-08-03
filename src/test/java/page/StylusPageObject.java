package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by selenium on 29.07.2015.
 */
public class StylusPageObject {

    private WebElement findButton;
    private WebElement searchField;
    private WebElement searchLink;
    private WebDriver driver;
    private WebElement appleStoreButton;
    private WebElement iPhoneButton;
    private WebElement iPhoneCheckBox;
    private WebElement min;
    private WebElement max;
    private WebElement submitRange;
    private WebElement displayedResult;

    public StylusPageObject(WebDriver driver) {
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

    public void iPhoneButtonClick() {
        iPhoneButton = driver.findElement(By.xpath(".//*[@id='content']/div[1]/ul/li[1]/a/span"));
        iPhoneButton.click();
    }

    public void iPhoneCheckBoxClick() {
        iPhoneCheckBox = driver.findElement(By.xpath(".//*[@id='filter144']/li[6]/label/a"));
        iPhoneCheckBox.click();
    }

    public void setRange(String minRange, String maxRange) {
        min = driver.findElement(By.id("min"));
        min.clear();
        min.sendKeys(minRange);
        max = driver.findElement(By.id("max"));
        max.clear();
        max.sendKeys(maxRange);
    }

    public void submitRangeClick() {
        submitRange = driver.findElement(By.xpath(".//*[@id='filter']/fieldset/div[1]/div[2]/input"));
        submitRange.click();
    }

    public String displayedResult() {
        displayedResult = driver.findElement(By.xpath(".//*[@itemprop='name']"));
        return displayedResult.getText();
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}


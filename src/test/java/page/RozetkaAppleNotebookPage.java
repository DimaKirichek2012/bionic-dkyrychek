package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by Hasler on 10.08.2015.
 */
public class RozetkaAppleNotebookPage extends TestBase {
    private WebDriver driver;

    public RozetkaAppleNotebookPage (WebDriver driver) {
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
    public void descendingSort() {
        WebElement sortList = driver.findElement(By.xpath(".//*[@id='sort_view']/a"));
        sortList.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sort_view']/div//ul/li[2]/a")));
        WebElement descendingSort = driver.findElement(By.xpath(".//*[@id='sort_view']/div//ul/li[2]/a"));
        descendingSort.click();
    }
    public void compareSelectItems() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='novisited list-compare-more-link arrow-link']")));
        WebElement compareSelectItems = driver.findElement(By.xpath(".//*[@class='novisited list-compare-more-link arrow-link']"));
        compareSelectItems.click();
    }

    public void appleMacbookPro13(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Z0QP000X6')]")));
        WebElement appleMacBookPro13AddToCompareList = driver.findElement(By.xpath("//div[@id='wishlist-popup-2686197']/following::img[1]\n"));
        appleMacBookPro13AddToCompareList.click();
    }
    public void appleMacbookPro15(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'MGXA2UA/A')]")));
        WebElement appleMacBookPro15AddToCompareList = driver.findElement(By.xpath("//div[@id='wishlist-popup-3253823']/following::img[1]\n"));
        appleMacBookPro15AddToCompareList.click();
    }

}

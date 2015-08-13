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
   /*public void appleMacBookPro13AddToCompare() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='block_with_goods']/div[1]/div[4]/div[1]/div/div/div/div[6]/ul/li[2]/div/label/span")));
        WebElement addToCompare13 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[4]/div[1]/div/div/div/div[6]/ul/li[2]/div/label/span"));
        addToCompare13.click();
    }
    public void appleMacBookPro15AddToCompare() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='block_with_goods']/div[1]/div[3]/div[1]/div/div/div/div[6]/ul/li[2]/div/label/span")));
        WebElement addToCompare15 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[3]/div[1]/div/div/div/div[6]/ul/li[2]/div/label/span"));
        addToCompare15.click();
    }*/
    public void compareSelectItems() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='novisited list-compare-more-link arrow-link']")));
        WebElement compareSelectItems = driver.findElement(By.xpath(".//*[@class='novisited list-compare-more-link arrow-link']"));
        compareSelectItems.click();
    }
    public List<WebElement> listOfNotebooks(){
        List<WebElement> webElementList = driver.findElements(By.xpath(".//*[@id='block_with_goods']/div[1]/div"));
        return webElementList;
    }
    public void appleMacbookPro13(List<WebElement> webElementList){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='block_with_goods']/div[1]/div")));
        for (WebElement appleBook13:webElementList){
            if (appleBook13.getText().contains("Apple MacBook Pro Retina 13\"")){
                appleBook13.findElement(By.cssSelector(".g-compare")).click();
                break;
            }
        }
    }
    public void appleMacbookPro15(List<WebElement> webElementList){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='block_with_goods']/div[1]/div")));
        for (WebElement appleBook15:webElementList){
            if (appleBook15.getText().contains("Apple MacBook Pro Retina 15\"")){
                appleBook15.findElement(By.cssSelector(".g-compare")).click();
                break;
            }
        }
    }
}

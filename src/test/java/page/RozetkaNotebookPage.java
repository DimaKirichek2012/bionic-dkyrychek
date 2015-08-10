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
public class RozetkaNotebookPage extends TestBase {
    private WebDriver driver;

    public RozetkaNotebookPage(WebDriver driver) {
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
    public void notebookAppleClick(List<WebElement> manufacturesList) {
        for (WebElement type:manufacturesList){
            if (type.getText().contains("Apple")){
                driver.findElement(By.xpath(".//*[@class='m-cat-l']/li[2]/ul/li[2]/a")).click();
                break;
            }
        }
    }
    public List<WebElement> getManufacturesList() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='m-cat-l']/li[2]/ul/li")));
        return driver.findElements(By.xpath(".//*[@class='m-cat-l']/li[2]/ul/li"));
    }
}

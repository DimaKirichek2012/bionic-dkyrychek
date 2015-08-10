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
public class RozetkaNotebooksAndComputersPage extends TestBase {

    private WebDriver driver;

    public RozetkaNotebooksAndComputersPage(WebDriver driver) {
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
    public List<WebElement> getNotebooksComputersList() {
          List<WebElement> notebooksComputerslist =driver.findElements(By.xpath(".//*[@class='m-cat-l']/li[1]/ul/li"));
          return notebooksComputerslist;
    }
    public void notebookButtonClick() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='m-cat-l']/li[1]/ul/li[1]/a")));
        WebElement notebookButton = driver.findElement(By.xpath(".//*[@class='m-cat-l']/li[1]/ul/li[1]/a"));
        notebookButton.click();
    }
}

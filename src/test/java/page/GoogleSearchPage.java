package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by selenium on 29.07.2015.
 */
public class GoogleSearchPage {
    private WebElement searchField;
    private WebElement searchLink;
    private WebDriver driver;


    public GoogleSearchPage(WebDriver driver){
       this.driver = driver;
    }
    public void open(String URL){
        driver.get(URL);
    }
    public void searchText(String searchText){
        searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);
    }
    public WebElement findURL(){
        searchLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/div[1]/div/h3/a"));
        return searchLink;
    }

}

package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by selenium on 29.07.2015.
 */
public class StylusSearchPage  {

    private WebElement findButton;
    private WebElement searchField;
    private WebElement searchLink;
    private WebDriver driver;

    public StylusSearchPage(WebDriver driver){
        this.driver = driver;
    }
    public void open(String URL){
        driver.get(URL);
    }
    public void EnterSearchText(String searchElement){
        searchField=driver.findElement(By.name("q"));
        searchField.sendKeys(searchElement);
    }
    public void ClickFindButton() {
        findButton=driver.findElement(By.xpath(".//*[@class='search']/form/input[2]"));
        /*� ���� �� ��������� xPath .//*[@type='submit'][@value='�����'] ���� �� ��������
         � css input[type='submit'][value='�����'] ���� �������� ������
         Unable to locate element: {"method":"xpath","selector":".//*[@type='submit'][@value='�����']"}
         � ��� ����� ��� ������� ��� � ���������� # -- coding: utf-8 -- */
        findButton.click();
    }

    public String SearchLinkText() {
        searchLink = driver.findElement(By.xpath("//*[@class='product-grid']/li[2]/a/span"));
        return searchLink.getText();
    }
}

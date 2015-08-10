package ui_tests.Lesson_10;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by selenium on 10.08.2015.
 */
public class Test_3 extends TestBase {
    private String URL = "http://www.quackit.com/html/codes/html_popup_window_code.cfm";
    @Test
    public void Test_3(){
        driver.get(URL);
        WebElement openNewWindow = driver.findElement(By.xpath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/div/h4/a"));
        openNewWindow.click();
        String firstWindow = driver.getWindowHandle();
        driver.switchTo().window("popUpWindow");
        assertTrue(driver.getTitle().contains("Popup Example"));
        driver.switchTo().window(firstWindow);
        assertTrue(driver.getTitle().contains("HTML"));
    }
}

package ui_tests.Lesson_10;

import core.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;


/**
 * Created by selenium on 10.08.2015.
 */
public class AllertTest extends TestBase {
    private String URL ="http://www.quackit.com/javascript/codes/javascript_prompt.cfm";

    @Test
    public void AllertTest() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement iFrame = driver.findElement(By.xpath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/iframe"));
        driver.switchTo().frame(iFrame);
        WebElement clickMeButton = driver.findElement(By.xpath("html/body/input"));
        clickMeButton.click();
        Alert alert = driver.switchTo().alert();

        if (alert.getText().equals("WQuackit.com")) {
            alert.accept();
            assertTrue(true);
        } else {
            fail("No, this is not you want");
        }
    }
}

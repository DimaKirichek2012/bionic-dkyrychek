package ui_tests.Lesson_10;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by selenium on 10.08.2015.
 */
public class Test2 extends TestBase {

    @Test
    public void Test_2(){
        driver.get("http://www.quackit.com/html/templates/frames/frames_example_1.html");
      //  List<WebElement> frames = driver.findElements(By.xpath("html/body"));

        driver.switchTo().frame(0);
        WebElement whitePage =driver.findElement(By.xpath("html/body/p/a"));
        assertTrue(whitePage.getText().contains("White Page"), " fail name WhiteBox");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement contentName = driver.findElement(By.xpath("html/body/h1"));
        assertTrue(contentName.getText().contains("Content"));
    }
}

package ui_tests.HomeTasks;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import page.RozetkaBasePage;
import page.RozetkaVkCredentials;




import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Created by Hasler on 06.08.2015.
 */
public class Home_Task_3_Test extends TestBase {

    private String rozetkaURL = "http://rozetka.com.ua/";

    @Test
    public void StylusLoginTest() {

        RozetkaBasePage rozetkaBasePage = new RozetkaBasePage(driver);
        RozetkaVkCredentials rozetkaVkCredentials = new RozetkaVkCredentials(driver);

        rozetkaBasePage.open(rozetkaURL);
        assertEquals(rozetkaBasePage.getCurrentUrl(), rozetkaURL, "Site not opened yet or open URL not rozetka.com.ua");

        rozetkaBasePage.loginRozetka();
        rozetkaBasePage.loginWithVK();

        String winHandleBefore = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        rozetkaVkCredentials.credentialsForVK("+380505027377", "qqqwww12");
        rozetkaVkCredentials.submitVkCredentials();

        driver.switchTo().window(winHandleBefore);
        driver.navigate().refresh();


        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='header_user_menu_parent']/a")));
        WebElement firstAndLastName = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a"));
        assertEquals(firstAndLastName.getText(),"Li Loi");
        firstAndLastName.click();
    }


}

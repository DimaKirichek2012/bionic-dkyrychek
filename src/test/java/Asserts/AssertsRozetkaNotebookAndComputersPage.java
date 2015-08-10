package Asserts;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.RozetkaNotebooksAndComputersPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Hasler on 10.08.2015.
 */
public class AssertsRozetkaNotebookAndComputersPage extends TestBase {
    public AssertsRozetkaNotebookAndComputersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertNotebookList(RozetkaNotebooksAndComputersPage rozetkaNotebooksAndComputersPage) {
        assertEquals(rozetkaNotebooksAndComputersPage.getNotebooksComputersList().size() - 1, 6, "Size not 6");
    }

    public void assertRozetkaNotebookAndComputersPageOpened() {
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@class='pab-h1']"))));
        assertTrue(driver.getCurrentUrl().contains("http://rozetka.com.ua/computers-notebooks"), "Current page not computers & notebooks");
    }

}


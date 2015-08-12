package ui_tests.HomeTasks;

import Asserts.*;
import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import page.RozetkaAppleNotebookPage;
import page.RozetkaBasePage;
import page.RozetkaNotebookPage;
import page.RozetkaNotebooksAndComputersPage;

import java.util.List;
import static org.testng.Assert.*;


/**
 * Created by Hasler on 09.08.2015.
 */
public class FinalTaskKyrychek extends TestBase {

    private String rozetkaURL = "http://rozetka.com.ua/";

    @Test
    public void StylusLoginTest() {

        RozetkaBasePage rozetkaBasePage = new RozetkaBasePage(driver);
        RozetkaNotebooksAndComputersPage rozetkaNotebooksAndComputersPage = new RozetkaNotebooksAndComputersPage(driver);
        RozetkaNotebookPage rozetkaNotebookPage = new RozetkaNotebookPage(driver);
        RozetkaAppleNotebookPage rozetkaAppleNotebookPage = new RozetkaAppleNotebookPage(driver);
        AssertsRozetkaComparePage assertsRozetkaComparePage =new AssertsRozetkaComparePage(driver);
        AssertsRozetkaNotebookApplePage assertsRozetkaNotebookApplePage = new AssertsRozetkaNotebookApplePage(driver);
        AssertsRozetkaNotebookPage assertsRozetkaNotebookPage = new AssertsRozetkaNotebookPage(driver);
        AssertsRozetkaNotebookAndComputersPage assertsRozetkaNotebookAndComputersPage = new AssertsRozetkaNotebookAndComputersPage(driver);
        AssertsRozetkaBasePage assertsRozetkaBasePage =new AssertsRozetkaBasePage(driver);

        //1
        rozetkaBasePage.open(rozetkaURL);
        //2
        assertsRozetkaBasePage.assertrozetkaUrl(rozetkaURL);
        //3
        rozetkaBasePage.notebooksComputersButtonClick();
        //4
        assertsRozetkaNotebookAndComputersPage.assertRozetkaNotebookAndComputersPageOpened();
        //5
        rozetkaNotebooksAndComputersPage.getNotebooksComputersList();
        assertsRozetkaNotebookAndComputersPage.assertNotebookList(rozetkaNotebooksAndComputersPage);
        //6
        rozetkaNotebooksAndComputersPage.notebookButtonClick();
        //7
        List<WebElement> manufacturesList = rozetkaNotebookPage.getManufacturesList();
        assertsRozetkaNotebookPage.assertManufacturesDisplayed(manufacturesList);
        //6
        assertsRozetkaNotebookApplePage.assertManufacturesDisplayed(manufacturesList);
        rozetkaNotebookPage.notebookAppleClick(manufacturesList);
        //7
        assertsRozetkaNotebookApplePage.assertNotebookApplePageOpened();
        //8
        rozetkaAppleNotebookPage.descendingSort();
        //9
        assertsRozetkaNotebookApplePage.assertAppleMacBookPro13OnPage();
        //10
        rozetkaAppleNotebookPage.appleMacBookPro13AddToCompare();
        //11
        assertsRozetkaNotebookApplePage.assertAppleMacBookPro13OnCompareList();
        //12
        assertsRozetkaNotebookApplePage.assertAppleMacBookPro15OnPage();
        //13
        rozetkaAppleNotebookPage.appleMacBookPro15AddToCompare();
        //14
        assertsRozetkaNotebookApplePage.assertAppleMacBoocPro15OnCompareList();
        //15
        rozetkaAppleNotebookPage.compareSelectItems();
        //16
        assertsRozetkaComparePage.assertComparePageOpen();
        //17
        assertsRozetkaComparePage.assertAppleMacBookPro13OnComparePage();
        assertsRozetkaComparePage.assertAppleMacBookPro15OnComparePage();
    }
}
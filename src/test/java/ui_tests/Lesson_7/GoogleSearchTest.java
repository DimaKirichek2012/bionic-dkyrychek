package ui_tests.Lesson_7;

import core.TestBase;
import org.apache.xpath.operations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.GoogleSearchPage;

import java.lang.String;

import static org.testng.Assert.assertTrue;


/**
 * Created by selenium on 22.07.2015.
 */
public class GoogleSearchTest extends TestBase{

    private String googleWebSite = "https://www.google.com";
    private String searchText ="Selenium";

    @Test
    public void seleniumSearchTest(){
        GoogleSearchPage onGoogleSearchPage = new GoogleSearchPage(driver);
        onGoogleSearchPage.open(googleWebSite);
        onGoogleSearchPage.searchText(searchText);

        assertTrue(onGoogleSearchPage.findURL().getText().toLowerCase().contains(searchText.toLowerCase()));
    }



}
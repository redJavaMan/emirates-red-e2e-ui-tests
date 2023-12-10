package com.emiratesred.tests;

import com.emiratesred.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class HomePageTest {

    private HomePage homePage;
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new SafariDriver();
        homePage = new HomePage(driver);
    }
    @Test
    public void searchValidProductTest(){
        homePage.goTo().closeNotification().acceptPrivacy().getHeader().search("merlin");
        assertFalse(homePage.getHeader().getResults().isEmpty(), "Search did not return any results");
    }

    @Test
    public void searchProductNoResultTest(){
        homePage.goTo().getHeader().search("ferrari");
        assertFalse(homePage.getHeader().getNoResult().isEmpty(), "Result not found not shown");
    }

    @AfterTest
    public void teardown(){
        if (driver!=null){
           driver.quit();
        }
    }
}

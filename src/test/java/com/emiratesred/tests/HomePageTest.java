package com.emiratesred.tests;

import com.emiratesred.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class HomePageTest {

    private HomePage homePage;

    @BeforeTest
    public void setup(){
        WebDriver driver = new SafariDriver();
        homePage = new HomePage(driver);
    }
    @Test
    public void searchValidProductTest(){
        homePage.goTo().closeNotification().acceptPrivacy().getHeader().search("merlin");
        assertFalse(homePage.getHeader().getResults().isEmpty(), "Search did not return any results");
    }
}

package com.emiratesred.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final Header header;
    private final WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.header = new Header(driver);
    }
   public Header getHeader(){
        return this.header;
   }

    public HomePage goTo() {
        this.driver.get("https://www.emiratesred.com");
        return this;
    }
}



package com.emiratesred.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private final Header header;
    private final WebDriver driver;

    private final By closeNotification = By.xpath("//div[@class='close']");
    private By acceptPrivacy = By.xpath("//button[text()='Accept']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.header = new Header(driver);
    }

    public Header getHeader() {
        return this.header;
    }

    public HomePage goTo() {
        this.driver.get("https://www.emiratesred.com");
        return this;
    }

    public HomePage closeNotification() {
        this.driver.findElement(closeNotification).click();
        return this;
    }

    public HomePage acceptPrivacy() {
        List<WebElement> accept = this.driver.findElements(acceptPrivacy);
        if (!accept.isEmpty()) {
            accept.get(0).click();
        }
        return this;
    }
}



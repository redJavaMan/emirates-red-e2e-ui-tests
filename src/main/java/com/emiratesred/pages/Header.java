package com.emiratesred.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Header {
    private final WebDriver driver;
    private final By searchField = By.cssSelector("#search");

    private final By results = By.id("product");

    private final WebDriverWait wait;
    private By noResultFound    = By.id("searchsuite-autocomplete");

    public Header(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void search(String text){
        this.driver.findElement(searchField).sendKeys(text);
    }
    public List<WebElement> getResults(){
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(results));
        return result.findElements(By.tagName("li"));
    }

    public List<WebElement> getNoResult() {
        return this.driver.findElements(noResultFound);
    }
}

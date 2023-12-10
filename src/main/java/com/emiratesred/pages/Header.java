package com.emiratesred.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Header {
    private final WebDriver driver;
    private final By searchField = By.cssSelector("#search");

    private final By results = By.cssSelector("#product li");

    public Header(WebDriver driver){
        this.driver = driver;
    }
    public void search(String text){
        this.driver.findElement(searchField).sendKeys(text);
    }
    public List<WebElement> getResults(){
        return this.driver.findElements(results);
    }
}

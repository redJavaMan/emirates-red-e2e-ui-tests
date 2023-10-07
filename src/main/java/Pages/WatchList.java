package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchList {
    private WebDriver driver;
    protected By watch =By.xpath("//a[contains (.,'Cerruti 1881 Rendinara Ladies Watch ')]");

    public WatchList(WebDriver driver) {
        this.driver=driver;
    }
    public Cerruti selectWatch(){
        driver.findElement(watch).click();
        return new Cerruti(driver);
    }
}

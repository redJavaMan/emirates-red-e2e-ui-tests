package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchListPage {
    private WebDriver driver;
    protected By watch =By.xpath("//a[contains (.,'Cerruti 1881 Rendinara Ladies Watch ')]");

    public WatchListPage(WebDriver driver) {
        this.driver=driver;
    }
    public CerrutiPage selectWatch(){
        driver.findElement(watch).click();
        return new CerrutiPage(driver);
    }
}

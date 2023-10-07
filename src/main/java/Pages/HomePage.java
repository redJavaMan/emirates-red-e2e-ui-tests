package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    protected By close = By.xpath("//div[@class='close']");
    protected By watches=By.xpath("//span[text()='Watches']");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void closeNotification(){
        driver.findElement(close).click();
    }
    public WatchList clickWatches(){
        driver.findElement(watches).click();
        return new WatchList(driver);
    }



}

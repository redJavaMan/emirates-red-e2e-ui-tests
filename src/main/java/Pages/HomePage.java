package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    protected By close = By.xpath("//div[@class='close']");
    protected By watches=By.xpath("//span[text()='Watches']");
    protected By add2Cart=By.xpath("//a[@class='action showcart']");
    protected By proceed2CheckOut=By.id("top-cart-btn-checkout");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void closeNotification(){
        driver.findElement(close).click();
    }
    public WatchListPage clickWatches(){
        driver.findElement(watches).click();
        return new WatchListPage(driver);
    }
    public CheckOutPage clickAddToCart(){
        driver.findElement(add2Cart).click();
        driver.findElement(proceed2CheckOut).click();
        return new CheckOutPage(driver);
    }


}

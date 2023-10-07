package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cerruti {
    private WebDriver driver;
    protected By add2Cart=By.id("product-addtocart-button");
    protected By cookies=By.xpath("//button[text()='Accept']");
    public Cerruti(WebDriver driver) {
        this.driver=driver;
    }
    public void acceptCookies() {
        driver.findElement(cookies).click();
    }
    public void addToCart(){
        driver.findElement(add2Cart).click();
    }

}

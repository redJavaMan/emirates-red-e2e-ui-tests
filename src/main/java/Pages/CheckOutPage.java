package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private WebDriver driver;
    protected By email =By.id("customer-email");
    protected By departureAirport=By.id("dep_airport");
    protected By arrivalAirport=By.id("final_destination");
    protected By dateOfDeparture=By.id("date_of_travel");
    protected By setDate=By.id("//a[text()='14']");
    protected By flightNumber=By.id("flight_number");
    protected By pNR =By.id("pnr");
    protected By passengerName=By.id("passenger");
    protected By clickContinue=By.id("passenger");


    public CheckOutPage(WebDriver driver) {
        this.driver=driver;
    }
    public void setEmail(String emailId){
        driver.findElement(email).sendKeys(emailId);
    }
    public void flightInformation(String depart,String arvl,String flightNo,String pnrNo,String passenger){
        Select dep=new Select(driver.findElement(departureAirport));
        dep.selectByVisibleText(depart);
        Select arrival=new Select(driver.findElement(arrivalAirport));
        arrival.selectByVisibleText(arvl);
        driver.findElement(dateOfDeparture).click();
        driver.findElement(setDate).click();
        Select fno=new Select(driver.findElement(flightNumber));
        fno.selectByVisibleText(flightNo);
        driver.findElement(pNR).sendKeys(pnrNo);
        driver.findElement(passengerName).sendKeys(passenger);
        driver.findElement(clickContinue).click();
    }
}

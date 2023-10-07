package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "M:\\chromedriver-win32\\chromedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.emiratesred.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}


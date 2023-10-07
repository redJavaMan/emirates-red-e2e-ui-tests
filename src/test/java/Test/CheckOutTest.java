package Test;

import Base.BaseTest;
import Pages.CheckOutPage;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {
    @Test
    public void testCheckOut(){
       CheckOutPage checkOutPage=homePage.clickAddToCart();
       checkOutPage.setEmail("abc.gmail.com");
       checkOutPage.flightInformation("Dubai (DXB)","Chennai (MAA)","EK542 - 21:00 PM","1234ad","Mohammed");
    }
}

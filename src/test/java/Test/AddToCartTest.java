package Test;

import Base.BaseTest;
import Pages.CerrutiPage;
import Pages.WatchListPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddToCart(){
       homePage.closeNotification();
       WatchListPage watchList=homePage.clickWatches();
       CerrutiPage cerruti=watchList.selectWatch();
       cerruti.acceptCookies();
       cerruti.addToCart();
    }

}

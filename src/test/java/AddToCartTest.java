import Base.BaseTest;
import Pages.Cerruti;
import Pages.WatchList;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddToCart(){
       homePage.closeNotification();
       WatchList watchList=homePage.clickWatches();
       Cerruti cerruti=watchList.selectWatch();
       cerruti.acceptCookies();
       cerruti.addToCart();
    }

}

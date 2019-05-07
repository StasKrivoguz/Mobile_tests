
import org.testng.annotations.Test;
public class AddItemToTheCart extends TestBase{

  @Test
  public void testAddItemToTheCart() throws Exception {
    openSite();
    searchItem();
    openItemCart();
    addToCart();
    closingSplashWindow();
    verificationCartExit();
  }

}

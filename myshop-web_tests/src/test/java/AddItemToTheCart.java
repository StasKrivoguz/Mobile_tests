import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  TestBase {
  @Test
  public void loginTest() throws InterruptedException {
    clickOnLoginButton();
    loggingInSystem();
    assertLogin();


  }

}

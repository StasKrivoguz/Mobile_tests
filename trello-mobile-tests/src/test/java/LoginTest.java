import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  TestBase {
  @Test
  public void loginTest() throws InterruptedException {
    driver.findElement(By.id("log_in_button")).click();

    Thread.sleep(5000);

    driver.findElement(By.id("user")).sendKeys("elena.telran@yahoo.com");
    driver.findElement(By.id("password")).sendKeys("12345.com");

    Thread.sleep(2000);

    driver.findElement(By.id("authenticate")).click();

    Thread.sleep(10000);
    WebElement boardsTitle = driver.findElement(By.xpath("//*[contains(@text, 'Boards')]"));
    Assert.assertTrue(boardsTitle.isDisplayed());

  }
}

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
  AppiumDriver driver;

  @BeforeClass
  public void setUp() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "qa17_8");
    capabilities.setCapability("platformVersion", "8.0");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability("appPackage", "com.trello");
    capabilities.setCapability("appActivity", ".home.HomeActivity");
    capabilities.setCapability("app", "D:/QA Works/Mobile_tests/trello-mobile-tests/apk/com.trello_11966_apps.evozi.com.apk");

    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  @AfterClass
  public  void tearDown(){
    driver.quit();
  }

  public void assertLogin() throws InterruptedException {
    Thread.sleep(10000);
    WebElement boardsTitle = driver.findElement(By.xpath("//*[contains(@text, 'Boards')]"));
    Assert.assertTrue(boardsTitle.isDisplayed());
  }

  public void loggingInSystem() throws InterruptedException {
    driver.findElement(By.id("user")).sendKeys("elena.telran@yahoo.com");
    driver.findElement(By.id("password")).sendKeys("12345.com");

    Thread.sleep(2000);

    driver.findElement(By.id("authenticate")).click();
  }

  public void clickOnLoginButton() throws InterruptedException {
    driver.findElement(By.id("log_in_button")).click();

    Thread.sleep(5000);
  }
}

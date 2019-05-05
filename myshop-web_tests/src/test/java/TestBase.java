import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void verificationCartExit() {
      driver.findElement(By.xpath("//div[@id='totalRows']")).click();
      driver.findElement(By.xpath("//div[@id='logo']//a//img")).click();
    }

    public void closingSplashWindow() {
      driver.findElement(By.xpath("//div[@class='id']//div//img")).click();
    }

    public void addToCart() {
      driver.findElement(By.id("add-to-cart-btn")).click();
    }

    public void openItemCart() {
      driver.findElement(By.xpath("//div[contains(text(),'טלפונים סלולרים')]")).click();
      driver.findElement(By.xpath("//a[contains(text(),'אייפון Apple iPhone 6s 32GB צבע אפור - שנה אחריות ')]")).click();
    }

    public void searchItem() {
      driver.findElement(By.id("txt_search")).click();
      driver.findElement(By.id("txt_search")).clear();
      driver.findElement(By.id("txt_search")).sendKeys("apple");
      driver.findElement(By.cssSelector("i.fa-search")).click();
    }

    public void openSite() {
      driver.get("https://ksp.co.il/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        openSite();

    }

    public void openSite() {
        wd.get("https://www.wikipedia.org/");
    }

    public void confirmLogin() {
        wd.findElement(By.cssSelector("button[value='Log in']")).click();
    }

    public void fillLoginForm() {
        wd.findElement(By.name("wpName")).click();
        wd.findElement(By.name("wpName")).clear();
        wd.findElement(By.name("wpName")).sendKeys("rinosi");


        wd.findElement(By.name("wpPassword")).click();
        wd.findElement(By.name("wpPassword")).clear();
        wd.findElement(By.name("wpPassword")).sendKeys("12345.com");
    }

    public void initLogin() {
        wd.findElement(By.cssSelector("#pt-login")).click();
    }

    public void selectLanguage() {
        wd.findElement(By.xpath("//a[@id='js-link-box-en']")).click();
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        openSite();
    }
    @AfterClass
    public void tearDown(){
        wd.quit();
    }

    public void openSite() {
        wd.get("https://www.wikipedia.org/");
    }

    public void confirmLogin() {
        click(By.cssSelector("button[value='Log in']"));
    }

    public void fillLoginForm(String user, String password) {
        type(By.name("wpName"), user);

        type(By.name("wpPassword"), password);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initLogin() {
        click(By.cssSelector("#pt-login"));
    }

    public void selectLanguage() {
        click(By.xpath("//a[@id='js-link-box-en']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    public void clickOnStar() {
        click(By.cssSelector("#ca-watch"));
    }

    public void searchArticle(String articleTitle){
        type(By.name("search"), articleTitle);
        click(By.name("go"));
    }

    public void validLogin() {
        selectLanguage();
        initLogin();
        fillLoginForm("Stasikovich", "12028484");
        confirmLogin();
    }
}

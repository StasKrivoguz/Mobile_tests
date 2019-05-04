import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationsTest extends TestBase {
@Test
    public void readNotification(){
    validLogin();
    clickOnNotificationIcon();
//    clickOnButtonAllNotifications();
//
//    String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
//
//    Assert.assertEquals(pageTitle,"Notifications");

}

    public void clickOnButtonAllNotifications() {

    }

    public void clickOnNotificationIcon() {
    click(By.id("pt-notifications-notice"));
    }
}

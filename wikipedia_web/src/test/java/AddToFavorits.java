
import org.testng.annotations.Test;

public class AddToFavorits extends TestBase {
    @Test
    public void testAddToFavorits() {
        validLogin();
        searchArticle("Game of Thrones");
        clickOnStar();
    }



}

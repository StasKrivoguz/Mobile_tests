
import org.testng.annotations.Test;

public class Wiki_LoginTest extends TestBase{

    @Test
    public void testLogin()  {

        selectLanguage();
        initLogin();
        fillLoginForm("Stasikovich", "12028484");
        confirmLogin();
    }

}

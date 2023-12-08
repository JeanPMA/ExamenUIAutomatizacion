import base.BaseTest;
import org.testng.annotations.Test;
import task.LoginElement;
import task.RegisterElement;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginElement.as(webDriver, "jean@gmail.com","12345678");

    }
}

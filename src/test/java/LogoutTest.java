import base.BaseTest;
import org.testng.annotations.Test;
import task.LoginElement;
import task.LogoutElement;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutTest(){
        LogoutElement.as(webDriver, "jean@gmail.com","12345678");

    }
}

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.RegisterElement;

public class RegisterTest extends BaseTest {
    @Test
    public void registerTest(){
        RegisterElement.as(webDriver, "jean", "jean@gmail.com","12345678");

    }
}

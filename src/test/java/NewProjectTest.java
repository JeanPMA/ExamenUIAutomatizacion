import base.BaseTest;
import org.testng.annotations.Test;
import task.LoginElement;
import task.NewProjectElement;

public class NewProjectTest extends BaseTest {
    @Test
    public void newProjectTest(){
        NewProjectElement.as(webDriver, "jean@gmail.com","12345678", "Diplomado V5");

    }
}

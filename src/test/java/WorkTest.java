import base.BaseTest;
import org.testng.annotations.Test;
import task.NewProjectElement;
import task.WorkElement;

public class WorkTest extends BaseTest {
    @Test
    public void newWorkTest(){
        WorkElement.as(webDriver, "jean@gmail.com","12345678", "Tarea completada");

    }
}

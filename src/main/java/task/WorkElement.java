package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.InicioPageUI;
import ui.LoginUI;
import ui.TareaUI;

public class WorkElement {
    public static void as(WebDriver webDriver, String email, String pass, String tarea) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, pass);
        Click.on(webDriver, LoginUI.loginclick);
        Click.on(webDriver, InicioPageUI.diplomado);
        Enter.text(webDriver, TareaUI.tareanombre, tarea);
        Click.on(webDriver, TareaUI.añadir);

    }
}

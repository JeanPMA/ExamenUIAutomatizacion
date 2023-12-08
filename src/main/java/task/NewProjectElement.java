package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.InicioPageUI;
import ui.LoginUI;
import ui.RegistrarUI;

public class NewProjectElement {
    public static void as(WebDriver webDriver, String email, String pass, String nombre) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, pass);
        Click.on(webDriver, LoginUI.loginclick);
        Click.on(webDriver, InicioPageUI.newproject);
        Enter.text(webDriver, InicioPageUI.nombre, nombre);
        Click.on(webDriver, InicioPageUI.añadir);

    }
}

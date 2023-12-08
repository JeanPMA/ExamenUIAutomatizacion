package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.RegistrarUI;

public class RegisterElement {
    public static void as(WebDriver webDriver, String fullName, String email, String pass) {
        Click.on(webDriver, HomePageUI.registrarse);
        Enter.text(webDriver, RegistrarUI.fullName, fullName);
        Enter.text(webDriver, RegistrarUI.email, email);
        Enter.text(webDriver, RegistrarUI.password, pass);
        Click.on(webDriver, RegistrarUI.aceptar);
        Click.on(webDriver, RegistrarUI.signup);
    }
}

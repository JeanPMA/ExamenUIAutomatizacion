package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginUI;
import ui.RegistrarUI;

public class LoginElement {
    public static void as(WebDriver webDriver,String email, String pass) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, pass);
        Click.on(webDriver, LoginUI.loginclick);
    }
}

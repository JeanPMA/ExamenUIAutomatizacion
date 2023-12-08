package ui;

import org.openqa.selenium.By;

public class InicioPageUI {
    public static By logout = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By newproject = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]");

    public static By nombre = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By añadir = By.xpath("//*[@id=\"NewProjNameButton\"]");

    public static By diplomado = By.xpath("//*[@id=\"ItemId_4173900\"]/table/tbody/tr/td[3]");

}

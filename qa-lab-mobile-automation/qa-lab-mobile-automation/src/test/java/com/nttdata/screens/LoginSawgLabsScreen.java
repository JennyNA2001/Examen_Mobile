package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginSawgLabsScreen extends PageObject {

    @AndroidFindBy(id="test-Username")
    private WebElement usuario;

    @AndroidFindBy(id="test-Password")
    private WebElement password;

    @AndroidFindBy(xpath="t//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")
    private WebElement boton;

    public void escribirUsuario(String user) {
        usuario.getText();
    }

    public void escribirPassword(String user) {
        usuario.getText();
    }

        public void clickLogin(){
        boton.click();
    }

}

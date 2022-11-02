package com.nttdata.steps;

import com.nttdata.screens.LoginSawgLabsScreen;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class LoginSwagLabsSteps {

    LoginSawgLabsScreen loginSawgLabsScreen;


    public void seleccionoBoton(){
        loginSawgLabsScreen.clickLogin();
    }

    public void Password(String pass) {
        loginSawgLabsScreen.escribirPassword(pass);
    }

    public void Usuario(String user) {
        loginSawgLabsScreen.escribirUsuario(user);
    }

    @Step("Click en cerrar")
    public void clickClose(){


    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
       /* searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();*/
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return "";
    }
}

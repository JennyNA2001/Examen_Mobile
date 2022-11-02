package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSwagLabsSD {
    @Steps
    LoginSwagLabsSteps loginSwagLabsSteps;

    @Given("me encuentro en la app de login de SwagsLabs")
    public void meEncuentroEnLaAppDeLoginDeSwagsLabs() {
    }

    @When("ingreso el usuario correcto {string}")
    public void ingresoElUsuarioCorrecto(String user) {
    loginSwagLabsSteps.Usuario(user);
    }

    @And("ingreso la contraseña correcta {string}")
    public void ingresoLaContraseñaCorrecta(String pass) {
        loginSwagLabsSteps.Password(pass);
    }

    @And("se da click en el boton LOGIN")
    public void seDaClickEnElBotonLOGIN() {
        loginSwagLabsSteps.seleccionoBoton();
    }

    @Then("se valida que debe aparecer el titulo {string}")
    public void seValidaQueDebeAparecerElTitulo(String arg0) {
    }

    @And("se valida que al menos exista un item")
    public void seValidaQueAlMenosExistaUnItem() {
    }
}

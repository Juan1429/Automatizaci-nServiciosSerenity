package io.petstore.pruebas.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.petstore.steps.PetstoreStep;
import net.thucydides.core.annotations.Steps;

public class PetstoreStepDefinition {


    //No se necesita el metodo given, para automatizar servicios no es necesario levantar el navegador web
    @Steps
    PetstoreStep petstorestep = new PetstoreStep();


    @When("^se envien las peticiones al servicio$")
    public void seEnvienLasPeticionesAlServicio() {
        petstorestep.CrearUsuario();
        petstorestep.CrearOrden();
    }

    @Then("^se valida que el codigo de status sea (.*)$")
    public void seValidaQueElCodigoDeStatusSea(int arg1) {
        petstorestep.validarUser();
        petstorestep.CrearOrden();
    }

}

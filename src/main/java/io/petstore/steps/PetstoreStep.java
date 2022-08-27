package io.petstore.steps;

import io.petstore.models.PetstoreModel;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetstoreStep {

    PetstoreModel petstoremodel = new PetstoreModel();

    //peticiones a los servicios de crear usuario y crear orden

    @Step
    public void CrearUsuario(){
        SerenityRest.given().baseUri(petstoremodel.getUrl()).contentType(petstoremodel.getHeaders()).body(petstoremodel.getBodyUser()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void CrearOrden(){
        SerenityRest.given().baseUri(petstoremodel.getUrl()).contentType(petstoremodel.getHeaders()).body(petstoremodel.getBodyOrden()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    //validamos del status del response
    @Step
    public void validarUser(){

        SerenityRest.lastResponse().then().statusCode(petstoremodel.getRESPONSECODE());
    }
    @Step
    public void validarOrden(){
        SerenityRest.lastResponse().then().statusCode(petstoremodel.getRESPONSECODE());
    }

}

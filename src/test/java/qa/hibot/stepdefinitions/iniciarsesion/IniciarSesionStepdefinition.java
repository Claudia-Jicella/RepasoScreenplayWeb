package qa.hibot.stepdefinitions.iniciarsesion;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matcher;
import qa.hibot.models.login.LoginModel;
import qa.hibot.questions.iniciarsesion.Login;
import qa.hibot.stepdefinitions.Setup;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import static org.hamcrest.CoreMatchers.equalTo;
import static qa.hibot.questions.iniciarsesion.Login.login;
import static qa.hibot.tasks.OpenLandingPage.openLandingPage;
import static qa.hibot.tasks.iniciarsesion.FillLogin.fillLogin;

public class IniciarSesionStepdefinition extends Setup {

    private static final String ACTOR_NAME = "Claudia";
    LoginModel loginModel = new LoginModel();


    //Background:
    @Given("que el cliente está en la página de inicio de sesion de hibot")
    public void queElClienteEstaEnLaPaginaDeInicioDeSesionDeHibot() {
        actorSetuptheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );



    }
    //Scenario1
    @When("el cliente llene los siguentes datos")
    public void elClienteLleneLosSiguentesDatos(DataTable dataTable) {
        loginModel.setCorreo(dataTable.row(0).get(1));
        loginModel.setContrasena(dataTable.row(1).get(1));

        theActorInTheSpotlight().attemptsTo(
                fillLogin()
                        .withCorreo(loginModel.getCorreo())
                        .andContrasena(loginModel.getContrasena())
        );


    }

    @Then("la pagina le debe mostrar las novedades de la app")
    public void la_pagina_le_debe_mostrar_las_novedades_de_la_app() {
           theActorInTheSpotlight().should(
                seeThat(
                        login()
                                .wasNovedadesApp("Novedades app")
                                .is(),equalTo(true)
                )
        );

    }



}

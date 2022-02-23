package qa.hibot.stepdefinitions.iniciarsesion;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.hibot.stepdefinitions.Setup;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static qa.hibot.tasks.OpenLandingPage.openLandingPage;
import static qa.hibot.tasks.iniciarsesion.BrowseToLogin.browseToLogin;

public class IniciarSesionStepdefinition extends Setup {

    private static final String ACTOR_NAME = "Claudia";


    //Background:
    @Given("que el cliente está en la página principal de hibot")
    public void que_el_cliente_esta_en_la_pagina_principal_de_hibot() {
        actorSetuptheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );



    }
    //Scenario1
    @When("el cliente navegue hasta el boton iniciar sesión y llena los siguentes datos")
    public void elClienteNavegueHastaElBotonIniciarSesionYLlenaLosSiguentesDatos(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                browseToLogin()
        );


    }

    @Then("la pagina le debe mostrar las novedades de la app")
    public void la_pagina_le_debe_mostrar_las_novedades_de_la_app() {

    }

}
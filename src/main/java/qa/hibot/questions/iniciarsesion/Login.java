package qa.hibot.questions.iniciarsesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static qa.hibot.userinterfaces.login.Login.NOVEDADES_APP_VALIDACION;

public class Login implements Question <Boolean>{

    private String novedadesApp;



    public Login wasNovedadesApp(String novedadesApp) {
        this.novedadesApp = novedadesApp;
        return this;
    }

    public Login is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (NOVEDADES_APP_VALIDACION.resolveFor(actor).containsOnlyText("Novedades app"));
    }

    public static Login login(){
        return new Login();
    }
}
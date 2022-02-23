package qa.hibot.tasks.iniciarsesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static qa.hibot.userinterfaces.login.Login.*;


public class FillLogin implements Task {

    private String correo;
    private String contrasena;


    public FillLogin withCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public FillLogin andContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CORREO),
                Enter.theValue(correo).into(CORREO),

                Scroll.to(CONTRASENA),
                Enter.theValue(contrasena).into(CONTRASENA),

                Scroll.to(INGRESAR),
                Click.on(INGRESAR)

        );

    }
    public static FillLogin fillLogin(){
        return new FillLogin();
    }
}

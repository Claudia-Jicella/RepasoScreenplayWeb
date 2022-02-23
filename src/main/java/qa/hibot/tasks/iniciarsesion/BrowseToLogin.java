package qa.hibot.tasks.iniciarsesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static qa.hibot.userinterfaces.login.Login.INICIARSESION;

public class BrowseToLogin implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(INICIARSESION),
                Click.on(INICIARSESION)
        );

    }
    public static BrowseToLogin browseToLogin (){
        return new BrowseToLogin();

    }
}

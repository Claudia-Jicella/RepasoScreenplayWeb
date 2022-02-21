package qa.hibot.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OpenLandingPage implements Task{

    public OpenLandingPage() {
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static OpenLandingPage openLandingPage(){
        return new OpenLandingPage();



    }

}

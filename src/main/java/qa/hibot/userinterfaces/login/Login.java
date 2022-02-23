package qa.hibot.userinterfaces.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class Login extends PageObject {
    public static final Target INICIARSESION = Target
            .the("Iniciar sesion")
            .located(By.xpath("//*[@class=\"elementor-button-link elementor-button elementor-size-sm\"]"));

    //Llenar Datos Inicio sesion

    public static final Target CORREO = Target
            .the("Correo Electronico")
            .located(By.xpath("//*[@type='email' or @id='email']"));
    public static final Target CONTRASENA = Target
            .the("Contraseña")
            .located(By.xpath("//*[@type='password' or @id='password']"));


    //Validaciones

    public static final Target NOVEDADES_APP_VALIDACION = Target
            .the("Novedades app")
            .located(By.xpath(".//h1[text()=\"Novedades app\"]"));


}

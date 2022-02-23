package qa.hibot.runners.iniciarsesion;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/iniciarsesion/iniciarsesion.feature"},
        glue = {"qa.hibot.stepdefinitions.iniciarsesion"},
        tags = {"@Scenario1"}
)

public class IniciarSesion {
}

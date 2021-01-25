package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/enviar_correo_gmail.feature",
        glue = "stepdefinitions")

public class EnviarCorreoGmailRunner {
}

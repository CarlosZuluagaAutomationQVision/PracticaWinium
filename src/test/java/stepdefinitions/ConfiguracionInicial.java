package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import tasks.Abrir;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class ConfiguracionInicial {

    private Process proceso;
    private EnvironmentVariables variablesDeAmbiente = Injectors.getInjector().getInstance(EnvironmentVariables.class);

    @Before
    public void configurarActor() {
        setTheStage(new OnlineCast());
        theActorCalled("Carlos");
    }

    @Before
    public void iniciarServidorWinium() throws IOException, InterruptedException {
        String directorio = EnvironmentSpecificConfiguration.from(variablesDeAmbiente).getProperty("servidor.winium.path");
        ProcessBuilder constructor = new ProcessBuilder(new File(directorio).getAbsolutePath());
        proceso = constructor.start();
        proceso.waitFor(3, TimeUnit.SECONDS);
    }

    @After
    public void terminarServidorWinium() {
        proceso.destroy();
    }

    @Dado("que el actor desea abrir la pagina de {string}")
    public void abrirUrl(String nombrePagina) {
        theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina.toUpperCase()));
    }

}

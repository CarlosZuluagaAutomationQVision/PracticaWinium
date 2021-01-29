package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.winium.abilities.Use;
import tasks.Abrir;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class ConfiguracionInicial {

    @Before
    public void configurarActor() {
        setTheStage(new OnlineCast());
        theActorCalled("Carlos");
        theActorInTheSpotlight().can(Use.DesktopApplications());
    }

    @Dado("que el actor desea abrir la pagina de {string}")
    public void abrirUrl(String nombrePagina) {
        theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina.toUpperCase()));
    }

}

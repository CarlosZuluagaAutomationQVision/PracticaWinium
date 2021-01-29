package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import tasks.Cargar;
import tasks.IniciarSesion;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActualizarFotoPerfilOrange {

    @Dado("que {word} inicia sesion en la pagina de Orange")
    public void iniciarSesion(String nombreUsuario) {
       theActorInTheSpotlight().attemptsTo(IniciarSesion.enOrange(nombreUsuario));
    }

    @Cuando("actualice su foto de perfil")
    public void actualizarFotoPerfil() {
        theActorInTheSpotlight().attemptsTo(Cargar.fotoPerfil());
    }

    @Entonces("podemos visualizar la nueva fotografia")
    public void podemos_visualizar_el_correo_enviado_con_el_archivo_cargado() {

    }

}

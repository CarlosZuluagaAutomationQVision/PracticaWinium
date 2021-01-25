package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.Usuarios;

import static userinterface.InicioSesionOrangeUserInterface.*;


@AllArgsConstructor
public class IniciarSesion implements Task {

    private final String nombreUsuario;

    public static IniciarSesion enOrange(String nombreUsuario) {
        return Tasks.instrumented(IniciarSesion.class, nombreUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_USUARIO),
                Enter.theValue(Usuarios.valueOf(nombreUsuario.toUpperCase()).getUsuario()).into(TXT_USUARIO),
                Click.on(TXT_CONTRASENIA),
                Enter.theValue(Usuarios.valueOf(nombreUsuario.toUpperCase()).getClave()).into(TXT_CONTRASENIA),
                Click.on(BTN_INICIO_SESION));
    }
}

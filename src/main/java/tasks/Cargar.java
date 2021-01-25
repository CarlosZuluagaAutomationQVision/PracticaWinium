package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.OrangeUserInterface.*;

public class Cargar implements Task {


    public static Cargar fotoPerfil() {
        return Tasks.instrumented(Cargar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LNK_MY_INFO),
                Click.on(LNK_IMAGEN),
                Click.on(BTN_SELECCIONAR_ARCHIVO));
        actor.attemptsTo(Click.on(LNK_IMAGEN));
    }
}

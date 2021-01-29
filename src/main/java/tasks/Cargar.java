package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.type.TypeValue;
import net.serenitybdd.screenplay.winium.actions.ClickDesk;
import net.serenitybdd.screenplay.winium.actions.EnterDesk;
import net.serenitybdd.screenplay.winium.actions.EnterValueIntoTargetDesk;
import net.serenitybdd.screenplay.winium.actions.HitDesk;
import org.openqa.selenium.Keys;

import javax.naming.spi.Resolver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
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
        actor.attemptsTo(ClickDesk.on(DSK_TXT_NOMBRE));
        actor.attemptsTo(EnterDesk.theValue("C:\\Users\\QV-3967\\Documents\\Q-Vision\\Revision Pruebas\\PracticaGmailWinium\\src\\test\\resources\\data\\f4f6ccd5cf3a919facce327e990cdcfb.jpg").into(DSK_TXT_NOMBRE));
        actor.attemptsTo(ClickDesk.on(DSK_LBL_ELEMENTOS));
        actor.attemptsTo(ClickDesk.on(DKS_BTN_ABRIR));
        actor.attemptsTo(ClickDesk.on(DKS_BTN_ABRIR));
        actor.attemptsTo(HitDesk.the(Keys.ENTER).into(DKS_BTN_ABRIR));
        actor.attemptsTo(Click.on(BTN_UPLOAD));
        actor.attemptsTo(Click.on(LNK_IMAGEN));
    }
}

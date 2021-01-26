package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Subir implements Interaction {

    DesktopOptions options = new DesktopOptions();

    public Subir() throws MalformedURLException {
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
        driver.findElement(By.name("Nombre:")).click();
        driver.findElement(By.name("Nombre:")).sendKeys("Hola");
        driver.findElement(By.name("Nombre:")).click();
    }


    public static Subir imagen() {
        return Tasks.instrumented(Subir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Subir.this);
    }
}

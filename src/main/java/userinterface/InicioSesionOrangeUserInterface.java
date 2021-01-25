package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionOrangeUserInterface {

    public static final Target TXT_USUARIO = Target.the("Ingresar Nombre Usuario").located(By.id("txtUsername"));
    public static final Target BTN_INICIO_SESION = Target.the("Boton Inicio Sesion").located(By.id("btnLogin"));
    public static final Target TXT_CONTRASENIA = Target.the("Ingresar Contraseña Usuario").located(By.id("txtPassword"));

}

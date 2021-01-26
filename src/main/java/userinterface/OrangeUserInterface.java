package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeUserInterface {

    public static final Target LNK_MY_INFO = Target.the("Ingresar Pagina My Info").located(By.id("menu_pim_viewMyDetails"));
    public static final Target LNK_IMAGEN = Target.the("Acceder a la Foto de perfil").located(By.id("profile-pic"));
    public static final Target BTN_SELECCIONAR_ARCHIVO = Target.the("Boton Seleccionar Archivo").located(By.xpath("//*[@id='frmPhoto']/fieldset/ol/li/label[1]"));

}

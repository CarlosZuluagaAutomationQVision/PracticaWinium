package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.winium.targets.TargetDesktop;

public class OrangeUserInterface {

    public static final Target LNK_MY_INFO = Target.the("Ingresar Pagina My Info").located(By.id("menu_pim_viewMyDetails"));
    public static final Target LNK_IMAGEN = Target.the("Acceder a la Foto de perfil").located(By.id("profile-pic"));
    public static final Target BTN_SELECCIONAR_ARCHIVO = Target.the("Boton Seleccionar Archivo").located(By.xpath("//*[@id='frmPhoto']/fieldset/ol/li/label[1]"));
    public static final TargetDesktop DSK_TXT_NOMBRE = TargetDesktop.the("").located(By.name("Nombre:"));
    public static final TargetDesktop DSK_LBL_ELEMENTOS = TargetDesktop.the("").located(By.name("Vista Elementos"));
    public static final TargetDesktop DKS_BTN_ABRIR = TargetDesktop.the("").located(By.xpath("//*[@AccessKey='Alt+A']"));
    public static final Target BTN_UPLOAD = Target.the("Boton Subir Archivo").located(By.id("btnSave"));

}

package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.travelocity.com/")
public class PaginaLogin extends PageObject {
    public static final Target BUTTON_CAMBIAR_IDIOMA = Target.the("Cambiar El idioma de la pagina a espanol").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text']"));
    public static final Target BUTTON_INICIO_SESION = Target.the("Boton de inicio de sesion").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text uitk-menu-icon-trigger gc-header-custom-menu-trigger']"));
    public static final Target BUTTON_INICIO_SESIONDOS = Target.the("Boton de inicio de sesion dos").located(By.xpath("//a[contains(text(),'Iniciar sesión')]"));
    public static final Target INPUT_INGRESO_USUARIO =Target.the("Ingreso de usuario").located(By.id("signin-loginid"));
    public static final Target INPUT_INGRESO_CONTRASENA = Target.the("Ingreso de contrasena").located(By.id("signin-password"));
    public static final Target BUTTON_INGRESO = Target.the("Boton de inicio").located(By.id("submitButton"));
}

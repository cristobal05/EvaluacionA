package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.travelocity.com/")
public class HomePage extends PageObject{

    public static final Target BUTTON_CAMBIAR_IDIOMA = Target.the("Cambiar El idioma de la pagina a espanol").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text']"));
    public static final Target BUTTON_VUELOS = Target.the("Tomar la opcion de vuelos").located(By.xpath("//a[@href='?pwaLob=wizard-flight-pwa']"));
    public static final Target INPUT_BUSCAR_CIUDADO = Target.the("Buscar la ciudad origen").located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Origen']"));
    public static final Target INPUT_BUSCAR_DIUDADD = Target.the("Buscar Ciudad destino").located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Destino']"));
    public static final Target BUTTON_CIUDADO = Target.the("Click en ciudad origen").located(By.xpath("//button[@data-stid='location-field-leg1-origin-result-item-button']"));
    public static final Target BUTTON_CIUDADD = Target.the("Click en ciudad destino").located(By.xpath("//button[@data-stid='location-field-leg1-destination-result-item-button']"));
    public static final Target INPUT_BUSCAR_FECHAI = Target.the("Buscar la fecha de ida").located(By.id("d1-btn"));
    //public static final Target BUTTON_NUMERO_FECHA = Target.the("Tomar el dia").located(By.xpath("//table[@class='uitk-new-date-picker-weeks']"));

    public static final Target BUTTON_OPCION_FECHAI = Target.the("Fecha nummero ida").located(By.xpath("//button[@aria-label='15 de diciembre de 2020']"));
    public static final Target BUTTON_OPCION_FECHAV = Target.the("Fecha nummero vuelta").located(By.xpath("//button[@aria-label='26 de diciembre de 2020']"));
    public static final Target BUTTON_ACEPTAR_FECHA = Target.the("Buscar fecha vuelta").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target INPUT_NUMERO_PASAJEROS = Target.the("Numero de pasajeros").located(By.xpath("//a[@aria-label='Personas']"));
    public static final Target BUTTON_MENOS_PERSONAS = Target.the("Menos personas").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button']"));
    public static final Target BUTTON_CONFIRMAR_NUMERO = Target.the("Confirmar numero de pasajeros").located(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating']"));
    public static final Target BUTTON_BUSCAR_VUELO = Target.the("Darle chic al boton buscar").located(By.xpath("//button[contains(text(),'Buscar')]"));

}

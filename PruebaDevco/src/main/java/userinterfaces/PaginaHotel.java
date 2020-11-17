package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaHotel extends PageObject {
    public static final Target BUTTON_CAMBIAR_IDIOMA = Target.the("Cambiar El idioma de la pagina a espanol").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text']"));
    public static final Target BUTTON_OPCION_HOTEL = Target.the("click en la opcion de hoteles").located(By.xpath("//a[@href='?pwaLob=wizard-hotel-pwa-v2']"));
    public static final Target INPUT_CIUDAD_HOTEL = Target.the("insertar ciudad para el hotel").located(By.xpath("//button[@aria-label='Destino']"));
    public static final Target OPCION_CIUDAD_HOTEL = Target.the("Opcion de la ciudad").located(By.xpath("//button[@data-stid='location-field-destination-result-item-button']"));
    public static final Target INPUT_FECHA_INGRESO = Target.the("Instertar fecha de ingreso").located(By.id("d1-btn"));
    public static final Target INPUT_FECHA_EXACTAI= Target.the("Instertar fecha de ingreso").located(By.xpath("//button[@aria-label='15 de diciembre de 2020']"));
    public static final Target INPUT_FECHA_EXACTAR = Target.the("Instertar fecha de ingreso").located(By.xpath("//button[@aria-label='25 de diciembre de 2020']"));
    public static final Target BUTTON_ACEPTAR_FECHA = Target.the("Insertar fecha de retiro").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target BUTTON_PERSONAS = Target.the("boton personas").located(By.xpath("//button[@data-testid='travelers-field-trigger']"));
    public static final Target BUTTON_MENOS_PERSONA = Target.the("menos personas").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button']"));
    public static final Target BUTTON_ACEPTAR_PERSONAS = Target.the("acpetar personas").located(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating']"));
    public static final Target INPUT_NUMERO_PERSONAS = Target.the("Insertar numero de personas").located(By.xpath("//button[@data-testid='travelers-field-trigger']"));
    public static final Target BUTTON_BUSCAR_HOTEL = Target.the("click boton de buscar").located(By.xpath("//button[contains(text(),'Buscar')]"));
}

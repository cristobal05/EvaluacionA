package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class PaginaActividad extends PageObject {
    public static final Target BUTTON_CAMBIAR_IDIOMA = Target.the("Cambiar El idioma de la pagina a espanol").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text']"));
    public static final Target BUTTON_OPCION_ACTIVIDAD = Target.the("Click en actividades").located(By.xpath("//a[@href='?pwaLob=wizard-lx-pwa']"));
    public static final Target INPUT_CIUDAD_ACTIVIDAD = Target.the("Insertar ciudade en la actividad").located(By.xpath("//button[@class='uitk-faux-input']"));
    public static final Target OPCION_BUSQUEDA_ACTIVIDAD = Target.the("Opcion de busqueda").located(By.xpath("//button[@data-stid='location-field-location-result-item-button']"));
    public static final Target INPUT_FECHA_ACTIVIDAD = Target.the("Instertar fecha de actividad").located(By.id("d1-btn"));
    public static final Target BUTTON_OPCION_FECHA = Target.the("Fecha exacta").located(By.xpath("//button[@aria-label='15 de diciembre de 2020']"));
    public static final Target INPUT_FECHA_FINALA = Target.the("Insertar fecha final de la actividad").located(By.xpath("//button[@aria-label='26 de diciembre de 2020']"));
    public static final Target BUTTUN_ACEPTAR_FECHA = Target.the("Aceptar fecha").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text uitk-button-primary uitk-flex-align-self-flex-end uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
    public static final Target BUTTON_BUSCAR_ACTIVIDAD = Target.the("click al boton buscar activiad").located(By.xpath("//button[contains(text(),'Buscar')]"));
}

package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class PaginaAutos extends PageObject {
    public static final Target BUTTON_CAMBIAR_IDIOMA = Target.the("Cambiar El idioma de la pagina a espanol").located(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text']"));
    public static final Target BUTTON_AUTOS = Target.the("Boton por la opcion de Autos").located(By.xpath("//a[@href='?pwaLob=wizard-car-pwa']"));
    public static final Target BUTTON_RENTA_AUTOS = Target.the("Boton de renta de autos").located(By.xpath("//a[@href='carsForm']"));
    public static final Target INPUT_CIUDAD_ENTREGA = Target.the("insertar ciudad").located(By.xpath("//button[@aria-label='Entrega']"));
    public static final Target OPCION_CIUDAD_ENTREGA = Target.the("Opcion de de busqueda de la ciudad entrega").located(By.xpath("//button[@data-stid='location-field-locn-result-item-button']"));
    public static final Target INPUT_CIUDAD_DEVOLUCION = Target.the("Insertar ciudad de devolucion ").located(By.xpath("//button[@aria-label='Misma que la de entrega']"));
    public static final Target OPCION_CIUDAD_DEVOLUCION = Target.the("Opcion ciudad de devolucion").located(By.xpath("//button[@data-stid='location-field-loc2-result-item-button']"));
    public static final Target INPUT_FECHA_ENTREGA = Target.the("Insertar Fecha de entrega").located(By.id("d1-btn"));
    public static final Target BUTTON_FECHA_EXACTAU = Target.the("Insertar fecha exacta").located(By.xpath("//button[@aria-label='24 de diciembre de 2020']"));
    public static final Target BUTTON_ACEPTAR_FECHA = Target.the("Insertar fecha de devolucion").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target BUTTON_FECHA_EXACTAD = Target.the("Insertar fecha exacta dos").located(By.xpath("//button[@aria-label='31 de diciembre de 2020']"));
    public static final Target INPUT_HORA_ENTREGA = Target.the("Insertar hora de entrega").located(By.xpath("//select[@aria-label='Hora de entrega']"));
    public static final Target INPUT_HORA_DEVOLUCION = Target.the("Insertar hora de devolucion").located(By.xpath("//select[@aria-label='Hora de devolución']"));
    public static final Target BUTTON_BUSCAR_AUTO = Target.the("Darcle click al boton buscar").located(By.xpath("//button[contains(text(),'Buscar')]"));

}

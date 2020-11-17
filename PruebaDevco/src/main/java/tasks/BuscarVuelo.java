package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.security.Key;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.HomePage.*;


public class BuscarVuelo implements Task{

    private String ciudadOrigen;
    private String ciudadDestino;
    private String fechaIda;
    private String fechaRegreso;
    private String numeroPasajeros;
    public BuscarVuelo(String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaRegreso, String numeroPasajeros){
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaIda = fechaIda;
        this.fechaRegreso = fechaRegreso;
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Hit.the(Keys.ENTER).into(BUTTON_CAMBIAR_IDIOMA),
                Hit.the(Keys.ENTER).into(BUTTON_VUELOS),
                Enter.keyValues(ciudadOrigen).into(INPUT_BUSCAR_CIUDADO),
                WaitUntil.the(BUTTON_CIUDADO, isVisible()),
                Hit.the(Keys.ENTER).into(BUTTON_CIUDADO),
                Enter.keyValues(ciudadDestino).into(INPUT_BUSCAR_DIUDADD),
                WaitUntil.the(BUTTON_CIUDADD, isVisible()),
                Hit.the(Keys.ENTER).into(BUTTON_CIUDADD),
                //Enter.theValue(ciudadDestino).into(INPUT_BUSCAR_DIUDADD),
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_FECHAI),

                Hit.the(Keys.ENTER).into(BUTTON_OPCION_FECHAI),
                Hit.the(Keys.ENTER).into(BUTTON_OPCION_FECHAV),
                Hit.the(Keys.ENTER).into(BUTTON_ACEPTAR_FECHA),
                Hit.the(Keys.ENTER).into(INPUT_NUMERO_PASAJEROS),
                Hit.the(Keys.ENTER).into(BUTTON_MENOS_PERSONAS),
                Hit.the(Keys.ENTER).into(BUTTON_CONFIRMAR_NUMERO),
                Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_VUELO)


        );

    }
    public static BuscarVuelo conDescripcion (String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaRegreso, String numeroPasajeros){
        return instrumented(BuscarVuelo.class, ciudadOrigen, ciudadDestino, fechaIda, fechaRegreso, numeroPasajeros);
    }
}

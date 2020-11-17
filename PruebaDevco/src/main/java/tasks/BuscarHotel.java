package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static userinterfaces.PaginaHotel.*;


public class BuscarHotel implements Task {
    private String ciudadVisita;
    private String fechaIn;
    private String fechaOut;
    private String numeroPersonas;
    public BuscarHotel(String ciudadVisita, String fechaIn, String fechaOut, String numeroPersonas){
        this.ciudadVisita = ciudadVisita;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.numeroPersonas = numeroPersonas;

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Hit.the(Keys.ENTER).into(BUTTON_CAMBIAR_IDIOMA),
                Hit.the(Keys.ENTER).into(BUTTON_OPCION_HOTEL),
                Enter.keyValues(ciudadVisita).into(INPUT_CIUDAD_HOTEL),
                WaitUntil.the(OPCION_CIUDAD_HOTEL, isVisible()),
                Hit.the(Keys.ENTER).into(OPCION_CIUDAD_HOTEL),

                Hit.the(Keys.ENTER).into(INPUT_FECHA_INGRESO),
                Hit.the(Keys.ENTER).into(INPUT_FECHA_EXACTAI),
                Hit.the(Keys.ENTER).into(INPUT_FECHA_EXACTAR),
                Hit.the(Keys.ENTER).into(BUTTON_ACEPTAR_FECHA),
                Hit.the(Keys.ENTER).into(BUTTON_PERSONAS),
                Hit.the(Keys.ENTER).into(BUTTON_MENOS_PERSONA),
                Hit.the(Keys.ENTER).into(BUTTON_ACEPTAR_PERSONAS),

                Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_HOTEL)
                //Enter.theValue(fechaIn).into(BUTTON_FECHA)


        );

    }
    public static BuscarHotel conTuristas (String ciudadVisita, String fechaIn, String fechaOut, String numeroPersonas){
        return instrumented(BuscarHotel.class, ciudadVisita, fechaIn, fechaOut, numeroPersonas);
    }
}

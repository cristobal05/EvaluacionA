package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaActividad.*;
import static userinterfaces.PaginaLogin.BUTTON_INICIO_SESION;

public class BuscarActividad implements Task {
    private String ciudadHotel;
    private String fechaDel;
    private String fechaAl;
    public BuscarActividad(String ciudadHotel, String fechaDel, String fechaAl){
        this.ciudadHotel = ciudadHotel;
        this.fechaDel = fechaDel;
        this.fechaAl = fechaAl;
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Hit.the(Keys.ENTER).into(BUTTON_CAMBIAR_IDIOMA),
                Hit.the(Keys.ENTER).into(BUTTON_OPCION_ACTIVIDAD),
                Enter.keyValues(ciudadHotel).into(INPUT_CIUDAD_ACTIVIDAD),
                WaitUntil.the(OPCION_BUSQUEDA_ACTIVIDAD, isVisible()),
                Hit.the(Keys.ENTER).into(OPCION_BUSQUEDA_ACTIVIDAD),
                Hit.the(Keys.ENTER).into(INPUT_FECHA_ACTIVIDAD),
                Hit.the(Keys.ENTER).into(BUTTON_OPCION_FECHA),
                Hit.the(Keys.ENTER).into(INPUT_FECHA_FINALA),
                Hit.the(Keys.ENTER).into(BUTTUN_ACEPTAR_FECHA),
                Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_ACTIVIDAD)


        );

    }
    public static BuscarActividad conTuristas (String ciudadHotel, String fechaDel, String fechaAl){
        return instrumented(BuscarActividad.class, ciudadHotel, fechaDel, fechaAl);
    }
}

package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaActividad.OPCION_BUSQUEDA_ACTIVIDAD;
import static userinterfaces.PaginaAutos.*;


public class BuscarAuto implements Task {
    private String ciudadEntrega;
    private String ciudadDestino;
    private String fechaEntrega;
    private String fechaDestino;
    private String horaEntrega;
    private String horaDestino;
    public BuscarAuto(String ciudadEntrega, String ciudadDestino, String fechaEntrega, String fechaDestino, String horaEntrega, String horaDestino){
        this.ciudadEntrega = ciudadEntrega;
        this.ciudadDestino = ciudadDestino;
        this.fechaEntrega = fechaEntrega;
        this.fechaDestino = fechaDestino;
        this.horaDestino = horaDestino;
        this.horaEntrega = horaEntrega;
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Hit.the(Keys.ENTER).into(BUTTON_CAMBIAR_IDIOMA),
                Hit.the(Keys.ENTER).into(BUTTON_AUTOS),
                Hit.the(Keys.ENTER).into(BUTTON_RENTA_AUTOS),
                Enter.keyValues(ciudadEntrega).into(INPUT_CIUDAD_ENTREGA),
                WaitUntil.the(OPCION_CIUDAD_ENTREGA, isVisible()),
                Hit.the(Keys.ENTER).into(OPCION_CIUDAD_ENTREGA),
                Enter.keyValues(ciudadDestino).into(INPUT_CIUDAD_DEVOLUCION),
                WaitUntil.the(OPCION_CIUDAD_DEVOLUCION, isVisible()),
                Hit.the(Keys.ENTER).into(OPCION_CIUDAD_DEVOLUCION),
                Hit.the(Keys.ENTER).into(INPUT_FECHA_ENTREGA),

                Hit.the(Keys.ENTER).into(BUTTON_FECHA_EXACTAU),
                Hit.the(Keys.ENTER).into(BUTTON_FECHA_EXACTAD),
                Hit.the(Keys.ENTER).into(BUTTON_ACEPTAR_FECHA),
                Enter.keyValues(horaEntrega).into(INPUT_HORA_ENTREGA),
                Enter.keyValues(horaDestino).into(INPUT_HORA_DEVOLUCION),
                Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_AUTO)


        );

    }
    public static BuscarAuto conTuristas (String ciudadEntrega, String ciudadDestino, String fechaEntrega, String fechaDestino, String horaEntrega, String horaDestino){
        return instrumented(BuscarAuto.class, ciudadEntrega, ciudadDestino, fechaEntrega, fechaDestino, horaEntrega, horaDestino);
    }
}

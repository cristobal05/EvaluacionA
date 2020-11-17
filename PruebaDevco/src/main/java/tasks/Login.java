package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static userinterfaces.PaginaLogin.*;


public class Login implements Task {
    private String usuarioLogin;
    private String contrasenaLogin;
    public Login(String usuarioLogin, String contrasenaLogin){
        this.usuarioLogin = usuarioLogin;
        this.contrasenaLogin = contrasenaLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Hit.the(Keys.ENTER).into(BUTTON_CAMBIAR_IDIOMA),
                WaitUntil.the(BUTTON_INICIO_SESION, isVisible()),
                Hit.the(Keys.ENTER).into(BUTTON_INICIO_SESION),
                WaitUntil.the(BUTTON_INICIO_SESIONDOS, isVisible()),
                Hit.the(Keys.ENTER).into(BUTTON_INICIO_SESIONDOS),

                Enter.theValue(usuarioLogin).into(INPUT_INGRESO_USUARIO),
                Enter.theValue(contrasenaLogin).into(INPUT_INGRESO_CONTRASENA),
                WaitUntil.the(BUTTON_INGRESO, isVisible()),
                Hit.the(Keys.ENTER).into(BUTTON_INGRESO)


        );

    }

    public static Login conUsuario (String usuarioLogin, String contrasenaLogin){
        return instrumented(Login.class, usuarioLogin, contrasenaLogin);
    }
}

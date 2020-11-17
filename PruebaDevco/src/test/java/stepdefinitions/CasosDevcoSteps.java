package stepdefinitions;


import tasks.*;

import userinterfaces.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.WebDriver;


import java.util.List;

import static userinterfaces.ResultadoVuelo.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class CasosDevcoSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Devco");
    private HomePage homePage = new HomePage();


    @Dado("^que un usuario ingresa a la opcion de vuelos$")
    public void queUnUsuarioIngresaALaOpcionDeVuelos() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^busca la ciudad destino llena toda la informacion requerida$")
    public void buscaLaCiudadDestinoLlenaTodaLaInformacionRequerida(List<String> datos) {
        actor.wasAbleTo(
                BuscarVuelo.conDescripcion(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4))
        );

    }

    @Entonces("^reserva su vuelo$")
    public void reservaSuVuelo() {
        actor.should(seeThat(the(RESULTADO_BUSQUEDA_VUELO), isPresent()));

    }






    @Dado("^el usuario ingresa a la opcion de hotel$")
    public void ElUsuarioIngresaaLaOpcionDeHotel() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^busca un hotel en la ciudad con la fecha de estadia$")
    public void buscaUnHotelEnLaCiudadConLaFechaDeEstadia(List<String> datosd){
        actor.wasAbleTo(
                BuscarHotel.conTuristas(datosd.get(0),datosd.get(1),datosd.get(2),datosd.get(3))

        );

    }
    @Entonces("^realizo la busqueda de un hotel$")
    public void realizoLaBusquedaDeUnHotel() {
        actor.should(seeThat(the(RESULTADO_BUSQUEDA_HOTEL), isPresent()));

    }




    @Dado("^el usuario ingresa a la opcion de autos$")
    public void ElUsuarioIngresaaLaOpcionDeAutos() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^busca un auto en la ciudad con la fecha de uso$")
    public void buscaUnAutoEnLaCiudadConLaFechaDeUso(List<String> datosa){
        actor.wasAbleTo(
                BuscarAuto.conTuristas(datosa.get(0),datosa.get(1),datosa.get(2),datosa.get(3),datosa.get(4),datosa.get(5))

        );

    }
    @Entonces("^realizo la busqueda de un auto$")
    public void realizoLaBusquedaDeUnAuto() {
        actor.should(seeThat(the(RESULTADO_BUSQUEDA_AUTOS), isPresent()));

    }



    @Dado("^el usuario ingresa a la opcion de actividades$")
    public void ElUsuarioIngresaaLaOpcionDeActividades() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^busca una actividad en la ciudad con la fecha de estadia$")
    public void BuscaUnaActividadEnLaCiudadConLaFechaDeEstadia(List<String> datosac){
        actor.wasAbleTo(
                BuscarActividad.conTuristas(datosac.get(0),datosac.get(1),datosac.get(2))

        );

    }
    @Entonces("^realizo la busqueda de la acitividad$")
    public void realizoLaBusquedaDeLaAcitividad() {
        actor.should(seeThat(the(RESULTADO_BUSQUEDA_ACTIVIDAD), isPresent()));

    }


    @Dado("^el usuario cuneta con un usuario registrado$")
    public void elUsuarioCunetaConUnUsuarioRegistrado() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^busca la opcion de inicio de sesion e ingresa usuario y contrasena$")
    public void BuscaLaOpcionDeInicioDeSesioneIngresaUsuarioyContrasena(List<String> datosl){
        actor.wasAbleTo(
                Login.conUsuario(datosl.get(0),datosl.get(1))

        );

    }

    @Entonces("^inicio sesion$")
    public void inicioSesion() {
        actor.should(seeThat(the(RESULTADO_LOGIN), isPresent()));

    }


}

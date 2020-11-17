package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoVuelo {
    public static final Target RESULTADO_BUSQUEDA_VUELO = Target.the("Resultado de busqueda vuelo").located(By.id("homePage"));
    public static final Target RESULTADO_BUSQUEDA_ACTIVIDAD = Target.the("Resultado busqueda de activida").located(By.id("app"));
    public static final Target RESULTADO_BUSQUEDA_AUTOS = Target.the("Resultado busqueda de autos").located(By.id("app"));
    public static final Target RESULTADO_BUSQUEDA_HOTEL = Target.the("Resultado busqueda de hotel").located(By.id("app"));
    public static final Target RESULTADO_LOGIN = Target.the("Resultado login").located(By.id("app"));
}

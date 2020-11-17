#language: es
  Característica: Realizar la busqueda de un vuelo en la plataforma web https://www.travelocity.com/
    ingresando sin registrarme en la plataforma y
    reservar un vuelo en clase economica redondo sin asignaciones adicionales


    @EscenarioUno
    Esquema del escenario: Realizar una busqueda de vuelo en la plataforma web https://www.travelocity.com/
      Dado que un usuario ingresa a la opcion de vuelos
      Cuando busca la ciudad destino llena toda la informacion requerida
        |<CiudadO>|<CiudadD>|<FechaI>|<FechaR>|<nPasajero>|
      Entonces reserva su vuelo


      Ejemplos:
        |CiudadO       |CiudadD    |FechaI  |FechaR |nPasajero|
        |Medellin      |Bogota     |26      |28     |1        |



    @EscenarioDos
    Esquema del escenario: Realizar una busqueda de hotel en la plataforma web https://www.travelocity.com/
      Dado el usuario ingresa a la opcion de hotel
      Cuando busca un hotel en la ciudad con la fecha de estadia
        |<CiudadR>|<FechaI>|<FechaO>|<NumeroPersonas>|
      Entonces realizo la busqueda de un hotel
      Ejemplos:
        | CiudadR   | FechaI  |FechaO |NumeroPersonas |
        | Medellin  | 24      |26     |1              |



    @EscenarioTres
    Esquema del escenario: Realizar una busqueda de un auto en la plataforma web https://www.travelocity.com/
      Dado el usuario ingresa a la opcion de autos
      Cuando busca un auto en la ciudad con la fecha de uso
        |<CiudadE>|<CiudadD>|<FechaE>|<FechaD>|<HoraE>|<HoraD>|
      Entonces realizo la busqueda de un auto
      Ejemplos:
        |CiudadE  |CiudadD  |FechaE |FechaD |HoraE  |HoraD  |
        |Medellin |Bogota   |28 Dic |29 Dic |08:00  |07:00  |


    @EscenarioCuatro
    Esquema del escenario: Realizar una busqueda de una actividad en la plataforma web https://www.travelocity.com/
      Dado el usuario ingresa a la opcion de actividades
      Cuando busca una actividad en la ciudad con la fecha de estadia
        |<CiudadActividad>|<Fechaingreso>|<FechaSalida>|
      Entonces realizo la busqueda de la acitividad
      Ejemplos:
        |CiudadActividad  |Fechaingreso |FechaSalida  |
        |Medellin         |27           |29           |



    @EscenarioCinco
    Esquema del escenario: Realizar el ingreso como usuario registrado a la plataforma web https://www.travelocity.com/
      Dado el usuario cuneta con un usuario registrado
      Cuando busca la opcion de inicio de sesion e ingresa usuario y contrasena
        |<Usuario>|<Contrasena>|
      Entonces inicio sesion
      Ejemplos:
        |Usuario                  |Contrasena       |
        |pruevadevco@hotmail.com  |12345678@        |

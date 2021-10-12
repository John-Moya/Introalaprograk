package Library;
import Viajes.Avion;
import Viajes.Crucero;
import Viajes.Tren;

public class Main {

    public static void main(String[] args) {
	// Tipo de Viaje:
        //1)AVION
        Avion Lufthansa = new Avion();
        Lufthansa.aerolinea= "Alemana";
        Lufthansa.motores= "Rolls-Royce Trent XWB";
        Lufthansa.aeronaveTipo= "Airbus";
        System.out.println("--Aerolinea Lufthansa--");

        Lufthansa.ruta();
        Lufthansa.tipoReserva();
        Lufthansa.equipaje();
        System.out.println();

        //2)TREN
        Tren Renfe = new Tren();
        Renfe.capacidad = "700 pasajeros";
        Renfe.velocidad= "310 Km/h";
        Renfe.color= "Blanco";
        System.out.println("--Tren Renfe--");

        Renfe.clase();
        Renfe.servicioAbordo();
        Renfe.asientos();
        System.out.println();

        //3)CRUCERO
        Crucero CristalCruises= new Crucero();
        CristalCruises.linea= "Lujo";
        CristalCruises.nave= "Symphony";
        CristalCruises.tipo= "Mediterraneo";
        System.out.println("--Crucero Cristal Cruises--");

        CristalCruises.habitacion();
        CristalCruises.actividadDesembarco();
        CristalCruises.gastronomia();

    }
}

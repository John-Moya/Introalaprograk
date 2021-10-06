package data;
import data.Automovil;
public class Main {

    public static void main(String[] args) {
	// Sonar pito, encender y acelerar
    // Color, marca, motor, modelo, año, cilindrada
    // Paquetes=data - Main Automovil // Nombre de la Clase objeto = *new* Nombre de la clase()
        /*/Automovil Toyota= new Automovil(); //Instancia=copia de la clase Automovil
        Toyota.año = 1983;
        Toyota.cilindrada = 2394.00;
        Toyota.color = "Gris";
        Toyota.marca = "Toyota";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";
        System.out.println(Toyota.marca);
        String elPito= Toyota.sonarPitoconRetorno();
        System.out.println(elPito);
        Toyota.encernder();
        Toyota.acelerar();
        System.out.println();*/

        // Toyota 1983, Volkswagen 1981
        /*Automovil volkswagen = new Automovil();
        volkswagen.año = 1981;
        volkswagen.cilindrada = 2410.00;
        volkswagen.color = "Azul";
        volkswagen.marca= "Volkswagen";
        volkswagen.modelo = "Escarabajo";
        volkswagen.motor ="k600";
        System.out.println(volkswagen.año);*/

        //PRACTICA 1//
        //CASA
        /*Casa nueva = new Casa();
        nueva.Características = "Grande, con vistas y gran terreno";
        nueva.Lugar = "Aserri";
        nueva.Materiales = "Concreto";
        nueva.vivienda();
        System.out.println(nueva.Lugar);*/

        //TABLETS
        /*Tablets IPad = new Tablets();
        IPad.marca = "Apple";
        IPad.año = 2021;
        IPad.caracteristicas = "Diagonal de 11, color gris ratón";
        IPad.modelo = "Air";
        IPad.docs();
        IPad.entretenimiento();
        System.out.println(IPad.año);*/

        //ACTOR-ACTRIZ
        Actor_Actriz Stefania = new Actor_Actriz();
        Stefania.nombre = "Stefania ";
        Stefania.apellido = "Spampinato ";
        Stefania.proyectos = "Grey´s Anatomy, Station 19, il giorno piú bello del mondo";
        System.out.println(Stefania.nombre + Stefania.apellido);
        System.out.println(Stefania.proyectos);
        Stefania.actuar();
        Stefania.contar();

        //LINTERNA
        /*Linterna panasonic = new Linterna();
        panasonic.marca= "Panasonic";
        panasonic.tamaño= "Mediana";
        panasonic.LEDS= 10;
        panasonic.luz();
        System.out.println(panasonic.LEDS);*/
        }

    }


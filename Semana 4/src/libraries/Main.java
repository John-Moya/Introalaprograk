package libraries;

import libraries.Automovil;

import libraries.Casa;

public class Main {

    public static void main(String[] args) {
	    // Acciones: Sonar Pito, Encender, Acelerar
        // Atributos: Color, Marca, Modelo, Año
        // Paquete Main Automovil // Nombre de la Clase Objeto = new Nombre de la clase();
        Automovil Toyota = new Automovil();
        // Instancia de la clase Automovil Copia
        Toyota.año = 1983;
        Toyota.cilindrada = 2394.00;
        Toyota.color = "Gris";
        Toyota.marca = "Toyota";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";

        System.out.println(Toyota.motor);
        String elPito = Toyota.sonarpitoConRetorno();
        System.out.println(elPito);
        Toyota.encender();
        Toyota.acelerar();
        Toyota.sonarPito();

        // Objeto Carro

        Automovil NissanGtr = new Automovil();

        NissanGtr.año = 2021;
        NissanGtr.cilindrada = 3799.00;
        NissanGtr.color = "Negro";
        NissanGtr.marca = "Nissan";
        NissanGtr.modelo = "R35";
        NissanGtr.motor = "V6";
    }
}

package libreria;

import libreria.Automovil;


public class Main {

    public static void main(String[] args) {
        Automovil Toyota = new Automovil();
// Instancia de la clase Automovil Copia
        Toyota.año = 1983;
        Toyota.cilindrada = 2394.00;
        Toyota.color = "Gris";
        Toyota.marca = "Toyota";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";
        System.out.println(Toyota.motor);
        String elPito = Toyota.sonarPitoConRetorno();
        System.out.println(elPito);
        Toyota.encender();
        Toyota.accelerar();
        Toyota.sonarPito();

    }
}

package libreria;

import libreria.Automovil;
import libreria.Doctor;
import libreria.Policia;
import libreria.Pasteleria;

public class Main {

    public static void main(String[] args) {

    //Automovil
	/*Automovil Toyota = new Automovil();
    Toyota.ano = 1983;
    Toyota.cilindrada = 2394.00;
    Toyota.color = "Gris";
    Toyota.modelo = "Celica";
    Toyota.motor = "22r";
    String elPito = Toyota.sonarPitoConRetorno();
    System.out.println(elPito);
    Toyota.encender();
    Toyota.accelerar();
    Toyota.sonarPito();*/

    //Doctor
    Doctor Doc = new Doctor();
    Doc.nombre = "Gabriel";
    Doc.apellido = "Ulloa";
    Doc.diasLaborales = "Lunes-Viernes";
    Doc.horasDia = 8;
    Doc.salarioSemanal = 300000;
    System.out.println(Doc.nombre);
    Doc.atenderPacientes();

    //Policia
    Policia Pol = new Policia();
    Pol.nombre = "Max";
    System.out.println(Pol.nombre);
    Pol.mantenerOrden();

    //Veterinario
    Veterinario Vet =  new Veterinario();
    Vet.nombre = "Kevin";
    System.out.println(Vet.nombre);
    Vet.revisarAnimal();

    //Pasteleria
    Pasteleria Past = new Pasteleria();
    Past.ubicacion = "San Jose";
    System.out.println(Past.ubicacion);
    Past.hacerPasteles();




    }
}

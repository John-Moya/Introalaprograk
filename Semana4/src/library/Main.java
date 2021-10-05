package library;
import  library.Automovil;
import  library.Computadora;
import  library.Celular;
import library.Cocinero;
import  library.Perro;
public class Main {

    public static void main(String[] args) {
        Automovil Toyota = new Automovil();

        Toyota.ano = 1983;
        Toyota.cilindraje = 2394.00;
        Toyota.marca = "Toyota";
        Toyota.color = "Gris";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";

        Automovil Ford = new Automovil();
        Ford.ano = 1969;
        Ford.cilindraje = 3273.00;
        Ford.marca = "Ford";
        Ford.color = "Negro";
        Ford.modelo = "Mustang";
        Ford.motor = "302-4V V8";

        Ford.encender();
        Ford.acelerar();
        Ford.sonarPito();

        Computadora Hp = new Computadora();
        Hp.marca = "HP";
        Hp.memoriaRam = "8 gigas";
        Hp.procesador = "i5";
        Hp.tipoDisco = "SSD";
        Hp.encender();
        Hp.apagar();

        Celular samsung = new Celular();
        samsung.marca = "Samsung";
        samsung.color = "negro";
        samsung.modelo = "J9";
        samsung.encender();
        samsung.llamar("Marco");
        samsung.apagar();

        Cocinero Marta = new Cocinero();
        Marta.nombre = "Marta Solis";
        Marta.edad = 42;
        Marta.experenciaAnos = 11;
        Marta.especialidad = "Comida Francesa";
        Marta.cortar("Carne");
        Marta.picar("Cebolla");
        Marta.cocinar();

        Perro Teo = new Perro();
        Teo.nombre = "Teo";
        Teo.edad = 2;
        Teo.raza = "Golden";
        Teo.ladrar();
        Teo.comer();


    }
}

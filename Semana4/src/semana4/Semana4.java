package semana4;

import semana4.Automovil;

public class Semana4 {

    public static void main(String[] args) {
        Automovil Toyota = new Automovil();
        Automovil BMW = new Automovil();
        Graficas Grafica = new Graficas();
        Moto Motos = new Moto();
        Perros perro = new Perros();
        Zapato Zapatos = new Zapato();

        Toyota.ano = 1983;
        Toyota.cilindrada = 2394.00;
        Toyota.color = "Gris";
        Toyota.marca = "Toyota";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";
        System.out.println(Toyota.motor);

        BMW.ano = 2012;
        BMW.cilindrada = 3500.00;
        BMW.color = "Azul";
        BMW.marca = "BMW";
        BMW.modelo = "Serie 3";
        BMW.motor = "n20";
        System.out.println(BMW.motor);
        String elPito = Toyota.sonarPitoConRetorno();
        System.out.println(elPito);
        Toyota.encender();
        Toyota.accelerar();
        Toyota.sonarPito();

        Grafica.Distribuidor = "NVIDIA";
        Grafica.Marca = "Zotac";
        Grafica.Memoria = 8;
        Grafica.Modelo = "GTX 1070 TI";
        Grafica.Imagen();
        

        Motos.ano = 2010;
        Motos.cilindraj = 700.00;
        Motos.marca = "Ducatti";
        Motos.Apaga();
        Motos.Enciende();

        perro.Edad = 5;
        perro.tamano = "Pequeno";
        perro.Raza = "Snauser";
        perro.Ladra();

        Zapatos.calsado = 40;
        Zapatos.color = "Naranja";
        Zapatos.marca = "NAIK";
        Zapatos.prueba();
    }

}

package Ejercicios;

import java.sql.SQLOutput;

public class Restaurante {
    String ubicacion;
    String horario;

    public void tipoOrden(){
        System.out.println("Comer en el restaurante o Llevar");
    }

    public void menu(){
        System.out.println("Niño o Adulto");
    }

    public void mesa(){
        System.out.println("Cantidad de personas");
    }
}

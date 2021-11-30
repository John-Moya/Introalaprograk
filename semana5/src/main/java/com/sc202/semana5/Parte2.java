package com.sc202.semana5;

public class Parte2 {
    public static void main(String [] args){
    
    parte1 torresLara = new parte1();
    Aceras acera =  new Aceras();
    torresLara.funcionaEdificio();
    torresLara.tienePermisos();
    /*double metrosDeConstruccion;
    metrosDeConstruccion = torresLara.calculametros(25.8999999999, 35.0000000);*/
   
    
    /*int capacidad = torresLara.persona(10,25,8);
        System.out.println("La capacidad del edificio es de " + capacidad);
        
     
     int cantidad = torresLara.aforo(5000);
        System.out.println(cantidad);*/
        
        
        acera.ancho = 4;
        acera.largo = 200;
        acera.calidad = "La acera esta en mal estado";
        
        System.out.println(acera.ancho);
        System.out.println(acera.largo);
        System.out.println(acera.calidad);
        
        acera.limpieza();
        acera.estado();
        acera.cantidadPersonas();
        
    }
    
}

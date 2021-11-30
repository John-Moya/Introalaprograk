package com.sc202.exampart1;

public class Vidrios {
    public static void main (String [] args){
    Cliente client =  new Cliente();
    client.nombre = "Kevin";
    
    caractVidrio vidrio1 = new caractVidrio();
    vidrio1.grosor = " El grosor es de 4 pulgadas";
    vidrio1.precio = " el precio es de 100 mil colones";
    vidrio1.tamano = " el tamaño es de 10 metros";
    
     caractVidrio vidrio2 = new  caractVidrio();
     vidrio2.grosor = " el grosor es de 1 pulgada";
     vidrio2.precio= " el precio es de 50 mil";
     vidrio2.tamano = " el tamaño es de 5 metros";
     
        System.out.println(" El cliente es"+ client.nombre+ vidrio1.grosor + vidrio1.tamano +  vidrio1.precio);
        System.out.println( vidrio2.grosor+ vidrio2.tamano +  vidrio2.precio);
}
}

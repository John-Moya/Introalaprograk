package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Paquete paquete1= new Paquete("Jet Box","Grande","300km","Mensagero: Rodrigo Bonilla Sotto");
        Paquete paquete2= new Paquete("Correos de Costa Rica","Mediano","475km","Mensagero: Alicia Melendez Estrada");


        JOptionPane.showMessageDialog(null,"  ##  Control de Envios  ##\n \n"+"Paquete 1\n"+
                "Almacen: "+ paquete1.getAlmacen()+"\n" +
        "Tipo de paquete: "+ paquete1.getTipoDedaquete()+"\n"+
                "Distancia en Km: "+ paquete1.getDistanciaKm()+"\n"+
                "Mensagero:"+ paquete1.getNombreDelDensajero()+"\n"+"\n"+
                        "Paquete 2\n"+
                        "Almacen: "+ paquete2.getAlmacen()+"\n" +
                        "Tipo de paquete: "+ paquete2.getTipoDedaquete()+"\n"+
                        "Distancia en Km: "+ paquete2.getDistanciaKm()+"\n"+
                        "Mensagero:"+ paquete2.getNombreDelDensajero()




        );


    }
}

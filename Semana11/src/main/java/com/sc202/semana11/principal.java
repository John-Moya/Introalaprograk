// Bus Cantidad Pasajeros // Ruta // Litros  // Chofer // Bus // Ruta

package com.sc202.semana11;

import javax.swing.JOptionPane;

public class principal {
    
     public static void main(String[] args) {
      
       bus Bus[] = new bus[2];
         
      
            Bus[0] = new bus("0", "0", "0" );
            Bus[0].setCantidad(JOptionPane.showInputDialog(null, " Ingrese la cantidad de pasajeros del bus "));
            Bus[0].setLitros(JOptionPane.showInputDialog(null, " Ingrese la cantidad de litros que gasta el bus "));
            Bus[0].setRuta(JOptionPane.showInputDialog(null, "Digite la ruta que va a recorrer "));
            Bus[0].Elchofer.setNumChofer(JOptionPane.showInputDialog(null, "digite el codigo del chofer "));
            Bus[0].Elchofer.setRuta(JOptionPane.showInputDialog(null, "la ruta que recorrio el bus fue "));

            System.out.println("La cantidad de pasajeros es de: " + Bus[0].getCantidad()+ " y la cantidad de litros que gasta es: " + Bus[0].getLitros()+ " y la ruta que recorre es: " + Bus[0].getRuta());
        
            
            
     }
}

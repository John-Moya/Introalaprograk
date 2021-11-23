package lab;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Bus Cantidad Pasajeros // Ruta // Litros  // Chofer // Bus // Ruta
    Bus[] losBuses = new Bus [2];
        for (int i = 0; i < losBuses.length; i++){
            losBuses[i] = new Bus("", "");
            losBuses[i].setPasajeros(JOptionPane.showInputDialog(null,"Ingrese la cantidad de pasajeros"));
            losBuses[i].setLitros(JOptionPane.showInputDialog(null,"Ingrese los litros de gasolina"));
            losBuses[i].laRuta.setUbicacion(JOptionPane.showInputDialog(null,"Ingrese donde parte y termina la ruta"));
            losBuses[i].laRuta.setHora(JOptionPane.showInputDialog(null,"Ingrese el tiempo aproximado"));
            losBuses[i].elChofer.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del chofer"));
        }
        for (int i = 0; i < losBuses.length; i++){
            System.out.println(losBuses[i].getPasajeros() + " " + losBuses[i].getLitros() + " " + losBuses[i].laRuta.getUbicacion() + " " + losBuses[i].laRuta.getHora() + " " + losBuses[i].elChofer.getNombre());

        }
    }
}

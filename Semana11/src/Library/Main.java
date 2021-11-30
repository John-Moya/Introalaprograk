package Library;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



        /*/DOCTOR= ESPECIALIDAD, NOMBRE Y HORARIO/ PACIENTE= NOMBRE, CEDULA, TEL Y HORARIO
        Doctor[] losDoctores= new Doctor[2];
        for (int i = 0; i < losDoctores.length; i++) {
            losDoctores[i].setNombre(JOptionPane.showInputDialog(null, ""));
            losDoctores[i].setEspecialidad(JOptionPane.showInputDialog(null, ""));


        }*/
        //bus= cantidad pasajeros, ruta y litros de gasolina/ chofer= bus y ruta
        Bus[] losBuses= new Bus[2];

        for (int i = 0; i < losBuses.length; i++) {
            losBuses[i] = new Bus("", "", "");

            losBuses[i].setCantPasajeros(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pasajeros:"));
            losBuses[i].setRura(JOptionPane.showInputDialog(null, "Ingrese la Ruta:"));
            losBuses[i].setLitros(JOptionPane.showInputDialog(null, "cantidad de litros:"));
            losBuses[i].laRuta.setSalida(JOptionPane.showInputDialog(null, "Ingrese el lugar de salida:"));
            losBuses[i].laRuta.setLlegada(JOptionPane.showInputDialog(null, "Ingrese el lugar de llegada:"));
            losBuses[i].laRuta.setParadas(JOptionPane.showInputDialog(null, "Ingrese la cantidad de paradas"));
        }
        for (int i = 0; i < losBuses.length; i++) {
            System.out.println("Bus= " +(i + 1));
            System.out.println("Pasajeros: " + losBuses[i].getCantPasajeros()+", Ruta: "+losBuses[i].getRura()+", Cant de litros que gasto: "+losBuses[i].getLitros());
            System.out.println("Lugar de salida: "+losBuses[i].laRuta.getSalida()+", Lugar de llegada: "+losBuses[i].laRuta.getLlegada()+", paradas realizadas: "+losBuses[i].laRuta.getParadas());

        }

    }
}

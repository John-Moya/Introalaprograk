// Bus Cantidad Pasajeros // Ruta // Litros  // Chofer // Bus // Ruta
package semana.pkg11main;

import javax.swing.JOptionPane;

public class Semana11main {

    public static void main(String[] args) {
        Bus[] buses = new Bus[1];
        Chofer[] Chofe = new Chofer[1];

        buses[0].setCantbus(JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas que caben en el bus"));
        buses[0].setLitros(JOptionPane.showInputDialog(null, "Ingrese la cantidad de litros que gasta el bus"));
        buses[0].setRuta(JOptionPane.showInputDialog(null, "Ingrese la ruta de trabajo"));
        
        for (int i = 0; i < buses.length; i++) {

            System.out.println("Pasajeros:" + buses[i].getCantbus() + " Litros gastados: " + buses[i].getLitros() + " Ruta: " + buses[i].getRuta());
        }

        Chofe[0].setBus(JOptionPane.showInputDialog(null, "Ingrese el numero de bus"));
        Chofe[0].setNumChofe(JOptionPane.showInputDialog(null, "Ingrese eol numero de chofer"));
        Chofe[0].setRuta(JOptionPane.showInputDialog(null, "Ingrese la ruta del bus"));

        for (int i = 0; i < buses.length; i++) {

            System.out.println("Horario:" + Chofe[i].getBus() + ", Num de chofer: " + Chofe[i].getNumChofe() + ", Codigo: " + Chofe[i].getRuta());

        }

    }
}

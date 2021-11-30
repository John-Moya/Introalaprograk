package semana.pkg11;

import javax.swing.JOptionPane;

public class Semana11 {

    public static void main(String[] args) {
        Bus[] buses = new Bus[2];
        Chofer[] Chofe = new Chofer[2];

        for (int i = 0; i < buses.length; i++) {
            buses[i].setCantbus(JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas que caben en el bus"));
            buses[i].setLitros(JOptionPane.showInputDialog(null, "Ingrese la cantidad de litros que gasta el bus"));
            buses[i].setRuta(JOptionPane.showInputDialog(null, "Ingrese la ruta de trabajo"));
            Chofe[i].setBus(JOptionPane.showInputDialog(null, "Ingrese el numero de bus"));
            Chofe[i].setNumChofe(JOptionPane.showInputDialog(null, "Ingrese eol numero de chofer"));
            Chofe[i].setRuta(JOptionPane.showInputDialog(null, "Ingrese la ruta del bus"));
        }
        for (int i = 0; i < buses.length; i++) {
            System.out.println("Pasajeros:" + buses[i].getCantbus() + " Litros gastados: " + buses[i].getLitros() + " Ruta: " + buses[i].getRuta());
            System.out.println("Horario:" + Chofe[i].getBus() + ", Num de chofer: " + Chofe[i].getNumChofe() + ", Codigo: " + Chofe[i].getRuta());

        }
    }
}

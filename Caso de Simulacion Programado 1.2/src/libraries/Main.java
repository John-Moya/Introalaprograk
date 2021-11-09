package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Clase camiones

        Camiones camion1 = new Camiones("BHC-131", "Mack", "Granite", "1000kg");

        Camiones camion2 = new Camiones("MKL-098", "Mack,", "rd688", "750kg");

        // Impresión del camion

        JOptionPane.showMessageDialog(null, "Las características del primer camión son:\n"
                + "Placa: "+ camion1.getPlaca() + "\n"
                + "Marca: " + camion1.getMarca() + "\n"
                + "Modelo: " + camion1.getModelo() + "\n"
                + "Peso que puede llevar: " + camion1.getPeso());


    }
}

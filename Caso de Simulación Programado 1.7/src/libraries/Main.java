package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Clases de empleados

        Empleados empleado1 = new Empleados("Adrián Ruiz", 113456789, 10);

        Empleados empleado2 = new Empleados("Alejandro Solano", 115867958, 7);

        // Impresion de los empleados

        JOptionPane.showMessageDialog(null, "Los datos del primer empleado son:\n"
                + "Nombre: " + empleado1.getNombre() + "\n"
                + "Cédula: " + empleado1.getCedula() + "\n"
                + "Máximo de horas permitidas: " + empleado1.getHorasMax());

        JOptionPane.showMessageDialog(null, "Los datos del segundo empleado son:\n"
                + "Nombre: " + empleado2.getNombre() + "\n"
                + "Cédula: " + empleado2.getCedula() + "\n"
                + "Máximo de horas permitidas: " + empleado2.getHorasMax());


    }
}

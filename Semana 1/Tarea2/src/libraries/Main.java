package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	//Realizar un programa que pida el nombre, apellido y sueldo, luego de almacenarlos en variables, muestre con JOptionPane lo siguiente "El nombre es , la edad es y el sueldo es " poniendo en la cadena los valores.
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido:");
        String edad = JOptionPane.showInputDialog("Ingrese su Edad:");
        String sueldo = JOptionPane.showInputDialog("Ingrese su Sueldo:");

        JOptionPane.showMessageDialog(null, "El nombre es "+nombre+" "+apellido+", la edad es "+edad+", y el sueldo es "+sueldo+".");
    }
}

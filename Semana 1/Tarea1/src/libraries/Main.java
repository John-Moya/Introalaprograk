package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
//Escriba un programa que lea el nombre del trabajador y su salario semanal. Calcule su salario mensual sin deducciones y el salario luego de aplicado un 9.34% siguiente de deducciones.
        int salariob = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
        salariob = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su salario bruto:"));
        int deduccion = (int) (salariob*0.0934);
        int salarion = salariob-deduccion;
        System.out.println("Estimado trabajador "+nombre+", el salario de este mes se desglosa de la siguiente manera:\n" +
                "\n" +
                "Salario bruto: "+salariob+
                "\n" +
                "Deducciones: "+deduccion+
                "\n" +
                "Salario neto: "+salarion);
    }
}

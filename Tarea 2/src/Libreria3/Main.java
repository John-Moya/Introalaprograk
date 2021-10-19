package Libreria3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double salarioBruto;
        int años = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años de antigüedad:"));
        int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas laboradas:"));
        double precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio por hora:"));
        salarioBruto = hora * precio;
        if (años >= 10) {
            salarioBruto = salarioBruto * 0.20;
        }
        if ((salarioBruto > 1000) && (salarioBruto <= 2000)) {
            JOptionPane.showMessageDialog(null, "Su salario bruto es " + salarioBruto * 0.10);
        } else if (salarioBruto > 2000) {
            JOptionPane.showMessageDialog(null, "Su salario bruto es " + salarioBruto * 0.15);
        }


    }
}

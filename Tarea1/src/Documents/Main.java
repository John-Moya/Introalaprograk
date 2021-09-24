package Documents;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    public static void main(String[] args) {
	String nombre = "";
    nombre = showInputDialog("Digite su nombre: ");
    int salario = Interger.parseInt(showInputDialog("Digite su salario semanal: "));
        System.out.println(nombre);
        System.out.println(salario);
        JOptionPane.showMessageDialog(null, "Estimado trabajador " + nombre + ", el salario de este mes se desglosa de la siguiente manera: ");
        int salariobruto = salario * 4;
        JOptionPane.showMessageDialog(null,"El salario bruto es de: " + salariobruto);
        JOptionPane.showMessageDialog(null, "El salario sin deducciones es de: " + salariobruto);
        double deducciones = salariobruto * 0.0934;
        JOptionPane.showMessageDialog(null, "El total de deducciones es de: " + deducciones);
        double salarioneto = salariobruto - deducciones;
        JOptionPane.showMessageDialog(null, "El salario neto es de: " + salarioneto);
    }

}


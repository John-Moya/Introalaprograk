package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	String nombre = JOptionPane.showInputDialog("Estimado(a) trabajador(a), porfavor ingrese su nombre:");

    Double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario semanal:"));


    Double deduccion = (salario * 9.34)/100;

    Double neto = salario - deduccion;

    JOptionPane.showMessageDialog(null, "Estimado trabajador " + nombre + ", el salario de este mes se desglosa de la siguiente manera: "
    +"\n"
    +"\n"
    +"Salario bruto: " + salario
    +"\n"
    +"Deducciones: "+ deduccion
    +"\n"
    +"Salario neto:"+ neto);

//Anthony Pennant Allen


    }
}

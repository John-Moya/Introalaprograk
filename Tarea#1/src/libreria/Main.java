package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Parte 1
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        float elsalario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su salario semanal"))*4;
        double deducciones = elsalario*9.34/100;
        double salarioNeto = elsalario-deducciones;
        JOptionPane.showMessageDialog(null, "Estimado trabajador "+nombre+" "+apellido+", el salario de este mes se desglosa de la siguiente manera:"+"\n Salrio bruto: "+elsalario+"\n Deduccion: "+deducciones+ "\n Salario neto: "+salarioNeto);

        //Parte 2
        String elnombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String elapellido = JOptionPane.showInputDialog("Ingrese su apellido");
        String edad = JOptionPane.showInputDialog("Ingrese su edad");
        float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su sueldo"));
        JOptionPane.showMessageDialog(null,"El nombre es "+elnombre+" el apellido es "+elapellido+" la edad es "+edad+ " y el sueldo es "+sueldo);


    }
}

package Library;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Tarea de Codigo

        //Problema #1

        //Escriba un programa que lea el nombre del trabajador y su salario semanal.
        //Calcule su salario mensual sin deducciones y el salario luego de aplicado un 9.34% siguiente de deducciones.
        //Muestre por pantalla lo siguiente:
        //Estimado trabajador <<nombre>>, el salario de este mes se desglosa de la siguiente manera:
        //Salario bruto: 999999.99
        //Deducciones: 99999.99
        //Salario neto: 999999.99

        String nombreDelTrabajador = "Ines Blanco";
        float salarioSemanal;
        salarioSemanal = 118000.50F;

        float SalMensual;
        float DeduccionSal;
        float SalaNeto;

        SalMensual = (salarioSemanal * 4);
        DeduccionSal = (int) (SalMensual * 0.0934);
        SalaNeto = (int) (SalMensual -DeduccionSal);

        System.out.println("Estimado trabajador " + nombreDelTrabajador + ", el salario de este mes se desglosa de la siguiente manera:");
        System.out.println("Salario bruto: " + SalMensual);
        System.out.println("Deducciones: " + DeduccionSal);
        System.out.println("Salario Neto: " + SalaNeto);


        //Problema #2

        //Realizar un programa que pida el nombre, apellido y sueldo, luego de almacenarlos en variables,
        // muestre con JOptionPane lo siguiente "El nombre es , la edad es y
        // el sueldo es " poniendo en la cadena los valores adecuados
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        JOptionPane.showMessageDialog( null, nombre);

        String apellido;
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido");
        JOptionPane.showMessageDialog( null, apellido);

        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        JOptionPane.showMessageDialog( null, edad);
        int salario;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Salario"));
        JOptionPane.showMessageDialog( null, salario);

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + ", Apellido: " + apellido + " Edad: " + edad + " Salario : " + salario );

    }
}

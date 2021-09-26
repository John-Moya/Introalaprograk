package semana1;

import javax.swing.JOptionPane;

public class Tarea1 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Porfavor ingreseme el nombre");

        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingreseme su edad"));

        int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingreseme el salario"));

        JOptionPane.showMessageDialog(null, "El nombre es" + nombre + " , la edad es " + edad + " y el sueldo es " + salario);
    }
}

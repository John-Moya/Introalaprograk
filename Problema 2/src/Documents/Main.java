package Documents;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su salario: "));
        String nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        String edad = JOptionPane.showInputDialog("Digite su edad: ");
        JOptionPane.showMessageDialog(null, "El nombre es " + nombre + " la edad es " + edad + ", y el sueldo es " + sueldo);
    }
}

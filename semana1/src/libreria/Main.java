package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // write code here
            String nombre = "Julian alvarez";// cadena de caracteres
            int edad = 25; // Integrer o entero
            float salario = 35.0F; // Decimales
            double temperatura = 25.3; // mas precicion
            char inicial = 'b';
            // Ana alvarez 35 27 21.2 a
            String nombre2 = "Ana Alvarez";// cadena de caracteres
            int edad2 = 35; // Integrer o entero
            float salario2 = 27.0F; // Decimales
            double temperatura2 = 21.2; // mas precicion
            char inicial2 = 'a';
            System.out.println(nombre);

            // nombre completo e imprimir
            /*String nombrecompleto = "Alonso Hernandez Bonilla";// mi nombre completo.
            System.out.println(nombrecompleto);
            String estado = "Feliz"; //Espacio Direccion
            String Jav = "Bienvenido al mundo de Java. Podras dar solucion a muchos problemas.";
            JOptionPane.showMessageDialog(null,estado);
            JOptionPane.showMessageDialog(null,Jav);*/

            String direccion = "";
            direccion = JOptionPane.showInputDialog("ingrese su direccion");
            JOptionPane.showMessageDialog(null, direccion);

            String precio = "";
            int precio1 = 0;
            precio1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio del carro"));
            System.out.println(precio1);
    }
}

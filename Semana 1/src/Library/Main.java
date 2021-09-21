package Library;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hola Mundo");
        String nombre = "Ines Blanco"; // Cadena de caracteres
        int edad = 34;// Integer o Entero
        float salario = 28.0F;// Decimales
        double temperatura = 21.2666;// Mas precision
        char inicial = 'a';


        //Ana Alvarez 35 27 21.2 a
        String elNombre = "Ana Alvarez";
        int edadDeAna = 35;
        float elSalarioDeAna = 27;
        double laTemperatura = 21.2;
        char laInicial = 'a';

        System.out.println(elNombre);

        //Nombre Completo String e imprimir
        String miNombre = "Ines Blanco";
        System.out.println(miNombre);

        //Variable espacio de memoria
        //RAM Random Access Memory
        // [ OFE456767 ] Nombre String
        // Java GC

        String estado = "Feliz"; //Espacio y Direccion
        JOptionPane.showMessageDialog(null, estado);

        String mensaje = "Bienvenido al mundo de Java\n" +
                "Podras dar solucion a muchos problemas";
        JOptionPane.showMessageDialog(null, mensaje);

        String direccion = "";
        direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        JOptionPane.showMessageDialog(null, direccion);

        //Recordar siempre asignar variables y tipo de Dato

        //hacer una caja donde se ingrese un salario y despues imprimirlo
        String precio = "";
        int elprecio = 0;
        precio = JOptionPane.showInputDialog("Ingrese el Precio");
        // o de forma directa-> elprecio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio del Carro"));
        elprecio = Integer.parseInt(precio); //el string se convirtio en Integer (String a String)
        System.out.println(precio);

        //Juanito <- String 89 69  **para convertir tipos de datos:
        // Integer <- Integer.parseInt("69")
        // Float.parseFloat()
        // Double.parseDouble()

        //Ejemplo Precio del carro
        JOptionPane.showInputDialog("Ingrese el Precio del Carro"); //devuelve el string (una cadena de caracteres)
        int precioCarro = 0; // lo que hace es guardarlo en una variable entera
        //ent hay que convertirlo asi:
        precioCarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio del Carro"));
        System.out.println(precioCarro);

    }
}
package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // int numero = 95;
        //  Funcion if numero = 73;

        int [] losNumeros = new int [4];
        // Tipo de Primitivo Int
        // Indice 0
        // Posiciones 4
        // [ , , , ]
        losNumeros[0] = 8;
        losNumeros[1] = 10;
        losNumeros[2] = 12;
        losNumeros[3] = 14;

        // for
        for (int i = 0; i < losNumeros.length; i++){
            System.out.println(losNumeros[i]);
            int numero = 54;
            //losNumeros[i]
            // 8
            // 0 + 1 = 1
            //losNumeors[i] = 1
            // 10
            // indice -> Valor
        }
        //Out of bounds

        // Arreglo de strings de 6 posiciones
        // Imprimir con un for

        String [] Colores = new String [6];
        Colores[0] = "Rojo";
        Colores[1] = "Azul";
        Colores[2] = "Verde";
        Colores[3] = "Café";
        Colores[4] = "Amarillo";
        Colores[5] = "Morado";

        for (int i = 0; i < Colores.length; i++){
            System.out.println(Colores[i]);
        }

        // Scope Globales locales
        // Scope Global For Local

        int [][] numerosCuadrados = new int [2][2];
        // [ [ 35,36] , [ 40, 50] ]
        numerosCuadrados[0][0] = 35;
        numerosCuadrados[0][1] = 36;
        numerosCuadrados[1][0] = 40;
        numerosCuadrados[1][1] = 50;

        for (int i = 0; i < numerosCuadrados.length; i++ ){
            for (int j = 0; j < numerosCuadrados.length; j++){
                System.out.println(numerosCuadrados[i][j]);
            }
        }

        int[] rellenar = new int [3];
        for (int i = 0; i < rellenar.length; i++){
            rellenar[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        }

        for (int i = 0; i < rellenar.length; i++){


        }

         //Arreglo pedir longitud en JOptionPane
         // For para rellenar Leer // int

        int longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la longitud del arreglo"));
        int[] arreglo = new int[longitud];
        int numeroPorBuscar  =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero por buscar"));

        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número"));
        }

        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }

        Casa[] lasCasas = new Casa[2];

        for (int i = 0; i < lasCasas.length; i++) {
            lasCasas[i] = new Casa("2500","300");
            System.out.println(lasCasas[i].getPrecio() + lasCasas[i].getMetros());
        }
    }
}

package Library;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Desarrollar un programa que genere una lista de números desde 1 a N
        //1. Permita al usuario mediante un menú elegir la forma de la estructura de control repetitiva para el procesamiento:
        //a) Ejercicio con While.
        //b) Ejercicio con Do While.
        //c) Ejercicio con For.
        //d) Salir
        // e imprima su suma, con las tres estructuras repetitivas vistas
        //La lista de valores, La cantidad de valores pares e impares

        int opcion2 = 4;

        do {
            System.out.println();
            System.out.println("Programa Estructuras de Control Repetitivas" +
                    "\n Eliga la forma de estructura" +
                    "\n 1-While " +
                    "\n 2-Do While" +
                    "\n 3-For" +
                    "\n 4-Salir");

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion:"));
            if (opcion == 1) {
                System.out.println("-----CICLO WHILE-----");
                int i = 0, N, contPar = 0, contImpar = 0;
                N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para el ciclo WHILE:"));
                while (i < N) {
                    System.out.println(i);
                    i++;
                    if (i % 2 == 1) {
                        contPar++;

                    } else {
                        contImpar++;
                    }
                }
                System.out.println("Cantidad de numeros impares es: " + contImpar);
                System.out.println("Cantidad de numeros pares es: " + contPar);

            } else if (opcion == 2) {
                System.out.println("----CICLO DO WHILE----");
                int j = 0, N, contPar = 0, contImpar = 0;
                N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para el ciclo DO WHILE:"));
                do {
                    System.out.println(j);
                    j++;
                    if (j % 2 == 1) {
                        contPar++;

                    } else {
                        contImpar++;
                    }

                } while (j < N);
                System.out.println("Cantidad de numeros impares es: " + contImpar);
                System.out.println("Cantidad de numeros pares es: " + contPar);

            } else if (opcion == 3) {
                System.out.println("----CICLO FOR----");
                int N, contPar = 0, contImpar = 0;
                N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para el ciclo FOR:"));
                for (int k = 0; k < N; k++) {
                    System.out.println(k);
                    if (k % 2 == 1) {
                        contImpar++;

                    } else {
                        contPar++;
                    }
                }
                System.out.println("Cantidad de numeros impares es: " + contImpar);
                System.out.println("Cantidad de numeros pares es: " + contPar);

            }
            System.out.println();
            if (opcion == 4) {
                System.out.println("---- Seguro que desea salir ?----" +
                        "\n 1-SI" +
                        "\n 2-NO ");
                int opcion4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Esta seguro que desea SALIR \n seleccione: "));

                if (opcion4 == 1) {
                    System.out.println("***Gracias por usar el Programa Estructuras de Control Repetitivas***");
                    break;


                }

            }
        } while (opcion2 <= 4);


    }
}



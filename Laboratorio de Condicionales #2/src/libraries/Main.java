package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Desarrollo del menú principal

        int opción;
        opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al menú, " +
                "seleccione una opción:\n"
        +"\n"
        + "1) Ejercicios con While\n"
        + "2) Ejercicios con Do While\n"
        + "3) Ejercicios con For\n"
        + "4) Salir\n"
        + "\n"
        + "Ingrese su opción:"));

        while (opción == 1 || opción == 2 || opción == 3 || opción > 4) {

            // Opción 1

            if (opción == 1){

                int i = 0;
                int numero1 = 4;
                String lista1 = "";
                int pares1 = 0;
                int impares1 = 0;
                while( i < 6) {

                    numero1 += 1;
                    lista1 += numero1 + "" + "\n";
                    if (numero1 % 2 == 0) {
                        pares1 += 1;
                    } else {
                        impares1 += 1;
                    }

                    i++;

                }

                JOptionPane.showMessageDialog(null, "Los número enteros son:\n"
                        + "\n"
                        + lista1
                        + "\n"
                        + "La cantidad de pares es: " + pares1 + " y la cantidad de impares es: " + impares1);

                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al menú, " +
                            "seleccione una opción:\n"
                            + "\n"
                            + "1) Ejercicios con While\n"
                            + "2) Ejercicios con Do While\n"
                            + "3) Ejercicios con For\n"
                            + "4) Salir\n"
                            + "\n"
                            + "Ingrese su opción:"));



            // Opción 2

            } else if (opción == 2){

                int i = 0;
                int numero1 = 4;
                String lista1 = "";
                int pares1 = 0;
                int impares1 = 0;
                do {

                    numero1 += 1;
                    lista1 += numero1 + "" + "\n";
                    if (numero1 % 2 == 0) {
                        pares1 += 1;
                    } else {
                        impares1 += 1;
                    }

                    i++;

                }while (i < 6);

                JOptionPane.showMessageDialog(null, "Los número enteros son:\n"
                        + "\n"
                        + lista1
                        + "\n"
                        + "La cantidad de pares es: " + pares1 + " y la cantidad de impares es: " + impares1);

                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al menú, " +
                        "seleccione una opción:\n"
                        +"\n"
                        + "1) Ejercicios con While\n"
                        + "2) Ejercicios con Do While\n"
                        + "3) Ejercicios con For\n"
                        + "4) Salir\n"
                        + "\n"
                        + "Ingrese su opción:"));

            // Opción 3

            }else if (opción == 3){

                int numero1 = 4;
                String lista1 = "";
                int pares1 = 0;
                int impares1 = 0;
                for (int i = 0; i < 6; i++) {

                    numero1 += 1;
                    lista1 += numero1 + "" + "\n";
                    if (numero1 % 2 == 0) {
                        pares1 += 1;
                    } else {
                        impares1 += 1;
                    }
                }

                JOptionPane.showMessageDialog(null, "Los número enteros son:\n"
                        + "\n"
                        + lista1
                        + "\n"
                        + "La cantidad de pares es: " + pares1 + " y la cantidad de impares es: " + impares1);

                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al menú, " +
                        "seleccione una opción:\n"
                        +"\n"
                        + "1) Ejercicios con While\n"
                        + "2) Ejercicios con Do While\n"
                        + "3) Ejercicios con For\n"
                        + "4) Salir\n"
                        + "\n"
                        + "Ingrese su opción:"));

            // Opción 5 o más

            }else if (opción > 4){


                JOptionPane.showMessageDialog(null, "Opción inválida, por favor intente de nuevo");
                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al menú, " +
                        "seleccione una opción:\n"
                        +"\n"
                        + "1) Ejercicios con While\n"
                        + "2) Ejercicios con Do While\n"
                        + "3) Ejercicios con For\n"
                        + "4) Salir\n"
                        + "\n"
                        + "Ingrese su opción:"));

            // Opción 4

            }else {

            JOptionPane.showMessageDialog(null, "Usted ha salido del sistema");
            }


        }
    }
}

package librerias;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int j = 1;
        int suma = 0;
        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Digite la Opción: \n" +
                    "a) Ejercicio con While.\n" +
                    "b) Ejercicio con Do While.\n" +
                    "c) Ejercicio con For.\n" +
                    "d) Salir"));
            if (option == 1) {
                System.out.println("a) Ejercicio con While.");
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero N: "));
                while (j<=n){System.out.println(j);
                    suma = suma + j;
                    j = j+1;}
                System.out.println(suma);
                suma = 0;
                j = 1;

            } else if (option == 2) {
                System.out.println("b) Ejercicio con Do While.");
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero N: "));
                do {
                    System.out.println(j);
                    suma = suma + j;
                    j = j+1;
                }
                while (j<=n);
                System.out.println(suma);
                suma = 0;
                j = 1;

            } else if (option == 3) {
                System.out.println("c) Ejercicio con For.");
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero N: "));
                for (j = 0; j <= n; j++){
                    System.out.println(j);
                    suma = suma + j;
                }
                System.out.println(suma);
                suma = 0;
                j = 1;
            }
            else if (option == 4){
                option= option+1;}
        }
        while (option <= 4);


    }
}

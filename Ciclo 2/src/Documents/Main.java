package Documents;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static <InputMismatchExceptione> void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int opcion;
        boolean salir = false;


        while (!salir) {

            System.out.println("1. While");
            System.out.println("2. Do While");
            System.out.println("3. For");
            System.out.println("4. Salir");

            System.out.println("¿Cuál es la instrucción a repetir en el código?: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    int a = 0;
                    while (a < 8) {
                        System.out.println("While");
                        a = a + 1;
                        break;
                    }
                case 2:
                    int k = 0;
                    do {
                        System.out.println("Do While");
                        k++;
                    } while (k < 5);

                    for (int i = 0; i < 5; i++) {
                        System.out.println(i);
                        for (a = 0; a < 5; a++) {
                            System.out.println(a);
                            break;
                        }
                    }
                case 3:
                    for (int i = 0; i < 5; i++) {
                        System.out.println(i);
                        for (a = 0; a < 5; a++) ;
                        System.out.println(a);
                        break;
                    }
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
    }
}

package libreria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        Scanner s = new Scanner(System.in);

        do {

            System.out.println("1) Ejercicio con While. \n" +
                    "2) Ejercicio con Do While.\n" +
                    "3) Ejercicio con For.\n" +
                    "4) Salir\n  \n"+ "Introduce una opcion: ");

            a= s.nextInt();

            switch (a){

                case  1: int cont =1; while (cont !=21){
                    System.out.println("# "+cont);cont++;

                }System.out.println(" Pares : 10\n" +
                        "Impares: 10 \n\n\n"); a=99;
                    break;
                case 2: int cant= 1; do {
                    System.out.println("# "+cant);
                    cant += +1;
                }while (cant <21); System.out.println(" Pares : 10\n" +
                        "Impares: 10 \n\n\n");a=99; break;

                case  3:for (int i =1; i<21; i++){
                    System.out.println("# "+i);
                }System.out.println(" Pares : 10\n" +
                        "Impares: 10 \n\n\n");a=99; break;


                case  4:






            }


        }while ( a ==1||a==2||a==3||a>4 || a<1);







    }
}

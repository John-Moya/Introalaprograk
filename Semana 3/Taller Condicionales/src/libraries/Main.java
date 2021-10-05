package libraries;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int edad = 21;
        if (edad > 17) System.out.println ("Es mayor de edad");

        //
        int a = 5;
        int b = 3;
        if (a > b) System. out.println ("El número mayor es A");
        if (a != b) System.out.println ("Los números son diferentes");
        if (a == b) System.out.println ("Los números son iguales");
        if (a * 2 == a + 7) System.out.println("Los números son 5 y 3");
        if ((a - 1)/2 == a / 2) System.out.println("El número en A es IMPAR");

        //
        if (edad < 18) System.out.println ("Bl egtudlante en adoleacente y menor de edad");
        else
            if (edad < 40)
                System.out.println("El estudiante es un adulto joven");
        else
            if (edad<65)
                System.out.println("Dl estudiante es adulto");
            else
                System.out.println("El estudlante es un adulto mayor");

        //

        switch (edad) {
            case 18:
                System.out.println("Diestudiante tiene 18 años");
                break;
            case 15:
                System. out.println ("El estudiante tiene 15 años");
                break;
            default:
                System.out.println("No tiene 15 o 18");}
    }
}

package libraries;

public class Main {

    public static void main(String[] args) {

        int edad = 21;
        if (edad > 17) System.out.println("Es mayor de edad");

        int a = 5;
        int b = 3;
        if (a > b) System.out.println("El número mayor es A");
        if (a != b) System.out.println("Los números son diferentes");
        if (a == b) System.out.println("Los números son iguales");
        if (a * 2 == a + 7) System.out.println("Los npumeros son 5 y 3");
        if ((a - 1) / 2 == a / 2) System.out.println("El número en A es IMPAR");


        if (a > b) {
            System.out.println("El número mayor es A");
            System.out.println("El número menor es B");
        }

        if (edad < 18) System.out.println("El ususario es menor de edad");
        if (edad >= 18) System.out.println("El usuario es mayor de edad");

        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        if (edad < 18) {
            System.out.println("El estudiante es adolescente y menor de edad");
        } else {
            if (edad < 40) {
                System.out.println("El estudiante es un adulto joven");
            } else {
                if (edad < 65) {
                    System.out.println("El estudiante es adulto");
                } else {
                    System.out.println(" El estudiante es un adulto mayor");
                }
            }
        }

        if (edad < 18) {
            System.out.println("El estudiante es adolescente y menor de edad");
        } else if (edad < 40) {
            System.out.println("El estudiante es un adulto joven");
        } else if (edad < 65) {
            System.out.println("El estudiante es adulto");
        } else {
            System.out.println("El estudiante es un adulto mayor");
        }

        int introduccion = 80;
        int calculo = 80;
        int prograbasica = 80;
        int matematicas = 80;
        if (introduccion >= 70) {
            if (calculo >= 70) {
                if (prograbasica >= 70) {
                    if (matematicas >= 70) {
                        System.out.println("Felicidades !");
                    }
                }
            }
        }

        if (introduccion >= 70 && calculo >= 70 && prograbasica >= 70 && matematicas >= 70) {
            System.out.println("Felicidad !");
        }
        if (introduccion < 70 || calculo < 70 || prograbasica < 70 || matematicas < 70) {
            System.out.println("No te puedo felicitar, al menos perdiste una materia");
        }
        if (!(introduccion >= 70 && calculo >= 70 && prograbasica >= 70 && matematicas >= 70)) {
            System.out.println("No te puedo felicitar, al menos perdiste una materia");
        }

        switch (edad) {
            case 18:
                System.out.println("El estduiante tiene 18 años");
                break;
            case 15:
                System.out.println("El estudiante tiene 15 años");
            default:
                System.out.println("No tiene 15 0 18");
        }
    }
}

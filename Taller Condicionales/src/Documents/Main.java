package Documents;

public class Main<a> {

    public static void main(String[] args) {
        int introduccion = 86;
        int calculo = 90;
        int prograbasica = 100;
        int matematica = 76;

        int edad = 21;
        if (edad > 17) System.out.println("Es mayor de edad");
        //  if (condición) sentencia;

        int a = 5;
        int b = 3;
        if (a > b) System.out.println("El numero mayor es A");
        if (a != b) System.out.println("Los numero son diferentes");
        if (a == b) System.out.println("Los numero son iguales");
        if (a * 2 == a + 7) System.out.println("Los numeros son 5 y 3");
        if ((a - 1) / 2 == a / 2) System.out.println("El numero en A es impar");

        int c = 5;
        int d = 3;
        if (c > d) {
            System.out.println("El numero mayor es A");
            System.out.println("El numero mayor es B");


            if (edad < 18) System.out.println("El usuario es menor de edad");
            if (edad >= 18) System.out.println("El usuario es menor de edad");

            if (edad >= 18) {
                System.out.println("El usuario es mayor de edad");
            } else {
                System.out.println("El usuario es menor de edad");

            // if anidadas
                if (edad < 18) {
                    System.out.println("El estudiante es adolecente y menor de edad");
                } else {
                    if (edad < 40) {
                        System.out.println("El estudiante es un adulto joven");
                    } else {
                        if (edad > 65) {
                            System.out.println("El estudiante es un adulto mayor");

                            //IF AND ELSE
                            if (edad < 18) {
                                System.out.println("El estudiante es adolescente y menor de edad");
                            } else if (edad < 40) {
                                System.out.println("El estudiante es un adulto joven");
                            } else if (edad > 65) {
                                System.out.println("El estudiante es un adulto");
                            } else {
                                System.out.println("El estudiante es un adulto mayor");
                            }
                        }
                    }
                }
            }
        }
        if (introduccion >= 70) {
            if (calculo >= 70) {
                if (prograbasica >= 70) {
                    if (matematica >= 70) {
                        System.out.println("Felicidades");
                    }
                }
            }
            // Y
            if (introduccion >= 70 && prograbasica >= 70 && matematica >= 70) {
                System.out.println("Felicidad");
                // OR
                if (introduccion < 70 || calculo < 70 || prograbasica < 70 || matematica < 70) {
                    System.out.println("No te puedo felicitar, al menos perdiste una materia");
                }
            }
        }
        switch (edad) {
            case 18:
                System.out.println("El estudiante tiene 18 años");
                break;
            case 15:
                System.out.println("El estudiante tiene 15 años");
                break;
            default:
                System.out.println("No tiene 15 o 18");
        }
    }
}

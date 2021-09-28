package Library;

public class Main {

    public static void main(String[] args) {
	// FOR

       /* for (int i= 0; i <= 2; i++){    // 2 cant de veces y i++ que el valor de i se incremente en c/ciclo
            System.out.println("Hola estoy siendo ejecutado desde un for");
        }

        //for Sout que se imprima 8 veces
        for (int i =0; i <= 7; i++){
            System.out.println("ejecutar prueba 8 veces");
        }

        //decrementar
        for (int i= 3; i > 0; i--) {    // 2 cant de veces y i++ que el valor de i se incremente en c/ciclo
            System.out.println("Hola estoy siendo ejecutado desde un for");
        }

        //WHILE
        int j =0;
        while (j <5){
            System.out.println("while");
            j = j + 1;
        }

        //while 6 veces
        int i = 0;
        while (i <6){
            System.out.println("prueba while 6 veces");
            i = i + 1;
        }

        //DO WHILE  es para correrlo muchas veces y detenerlo con una condicion
        int k = 0;
        do{
            System.out.println("do while");
            k++;
        }while (k<5); //condicion es q corra solo 5 veces

        for (int i=0;i<5; i++){  //hacer un for dentro de otro for
            System.out.println(i); // imprime 0 y luego 1
            for (int j = 0; j <5; j++) {
                System.out.println(j);  //// imprime 0 y luego 2

            }
        }*/

        //Ejercicio 02
        //imprimir un rectangulo de 10 simbolos en 5 lineas, pero solo
        //puede imprimir una @ a la vez
        int i = 0;
        int j =0;
        while (i <5) {
            while (j < 10) {
                System.out.print("@");
                j++;
            }
            System.out.println("@");
            j=0;
            i++;
        }
    }
}

package Library;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// ARREGLO de 4 cosas (string, int, double, float, boolean, **solo de 1
        //["a","b","c","d"]
        //  0   1   2   3   -> 4 tipo string
        //[25,26,27,28]

        //Arreglos multidimensionales=
        //[ [ 25, 26] , [ 27, 28] ]
        //   0[]         1[]
        //0[0]= 25, 0[1]= 26, 1[0]= 27, 1[1]= 28

        /*int[] losNumeros= new int[4]; //el aerreglo va ser de 4 espacios
        //tipo primitivo es Int
        //indice 0
        //posiciones 4
        //[ , , , ]
        losNumeros[0]= 8;
        losNumeros[1]= 10;
        losNumeros[2]= 12;
        losNumeros[3]= 14;

        System.out.println(losNumeros[3]);
        System.out.println();

        //for -> arreglo debe ir con for
       for (int i= 0; i <losNumeros.length; i++){ //en vez de i< 4, se pone losNumeros.length = longitud (out of bounds)
            System.out.println(losNumeros[i]); //imprima los num[i]= 0 -> 8
            // 8 + 1 = 1 -> losNumeros[i]= 1 -> 10 (indice = valor)
        }

        //arreglo de string de 6 posiciones imprimir con for
        String[] posicion= new String[6];
        posicion[0]= "A";
        posicion[1]= "B";
        posicion[2]= "C";
        posicion[3]= "D";
        posicion[4]= "E";
        posicion[5]= "F";
        for (int i= 0; i< posicion.length; i++){
            System.out.println(posicion[i]);
        }
        //Scope Globales locales
        //Scope Global Local
        //int numero=95; Global
        //funcion if  numero= 73
        int numero= 98;
        int j= 0;
        System.out.println(numero);
        while(j> 2){
            numero= 85;
            System.out.println(numero);
        }

        int [][] numerosCuadrados= new int[2][2]; // 2 indices y 2 posiciones
        //[ [35, 36] , [40, 50] ]
        numerosCuadrados[0][0]= 35;
        numerosCuadrados[0][1]= 36;
        numerosCuadrados[1][0]= 40;
        numerosCuadrados[1][1]= 50;
        for (int i= 0; i< numerosCuadrados.length; i++){
            for (int j= 0; j< numerosCuadrados.length; i++){
                System.out.println(numerosCuadrados[i][j]);
            }
        }
        int[] rellenar= new int[3];
        for (int i=0; i< rellenar.length; i++){
            rellenar[i]= Integer.parseInt(JOptionPane.showInputDialog( null, "Ingrese el numero"));
        }
        for (int i=0; i< rellenar.length; i++){
            JOptionPane.showMessageDialog(null, rellenar[i]);
        }

        //Arreglo pedir longitud en JOptionPane y for para rellenar y for para leer, int

        int longitud= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud del arreglo"));
        int[] elArreglo= new int[longitud];
        int numeroPorBuscar= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero por buscar"));

        for (int i=0; i< elArreglo.length; i++) {
            elArreglo[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su num"));
        }
        for (int i = 0; i < elArreglo.length; i++) {
            JOptionPane.showMessageDialog(null, elArreglo[i]);
        }
        for (int i = 0; i < elArreglo.length; i++) {
            if (elArreglo[i]== numeroPorBuscar){
                System.out.println("el numero se encuentra en la posicion: " + elArreglo[i] + " y es: " + numeroPorBuscar);
            }

        }*/

        //TAREA CAMBIAR PRECIO DE LAS CASAS

        Casa[] lasCasas= new Casa[2]; //llamamos a la clase casa

        for (int i = 0; i < lasCasas.length; i++) {
            lasCasas[i]= new Casa("2500","300");
            System.out.println( "Casa "+(i+1)+ " ->Precio: " + lasCasas[i].getPrecio() + " metros: " + lasCasas[i].getMetros());

            lasCasas[i].setPrecio((i+1)+"3000");
            lasCasas[i].setMetros((i+1)+"400");
            System.out.println("nuevo precio: " + lasCasas[i].getPrecio() + " y nueva cantidad de metros: " + lasCasas[i].getMetros());
            System.out.println();
        }
    }

}

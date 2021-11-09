package data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        // Arreglo de 4 cosas: [ , , ]
        //Java arreglos tipo String Int Double Float Boolen
        //["a","b","c","d"]
        //  0   1   2   3 > String

        //Multidimensional: [ [ , ] , [ , ] ]
        // [ [1 , 4] , [2 , 8] ]


        /*//Asignación manual
        int [] losNumeros = new int[4];
        // Primitivo Int
        // Indice 0
        // Posiciones 4
        losNumeros[0] = 8;
        losNumeros [1] = 10;
        losNumeros [2] = 12;
        losNumeros [3] = 14;
        System.out.println(losNumeros[3]);

        //Con ciclos
        for (int i = 0; i < losNumeros.length; i++){
            System.out.println(losNumeros[i]);
        }*/

        //PRÁCTICA = una dimensión
        /*String [] letras = new String[6];
        letras [0] = "a";
        letras [1] = "b";
        letras [2] = "c";
        letras [3] = "d";
        letras [4] = "e";
        letras [5] = "f";

        for (int i= 0; i< letras.length; i++){
            System.out.println(letras[i]);
        }*/

        //PRÁCTICA = Multidemensional
        /*int [][] numerosCuadrados= new int [2][2];
        // [ [ , ], [ , ] ]
        numerosCuadrados[0][0]= 35;
        numerosCuadrados[0][1]= 36;
        numerosCuadrados[1][0]= 37;
        numerosCuadrados[1][0]= 38;
        for ( int i = 0; i < numerosCuadrados.length; i++){
            //System.out.println(numerosCuadrados[i]);
            //Imprime el nombre dentro de la memoria
            for (int j = 0; j < numerosCuadrados.length; i++ ){
                System.out.println(numerosCuadrados[i][j]);
                //Imprime los valores
            }
        }*/

        //Pedir al usuario
        /*int [] rellenar = new int [3];
        for (int i = 0; i < rellenar.length; i++){
            rellenar[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Ingrese número"));
        }
        for (int i = 0; i < rellenar.length; i++){
            JOptionPane.showMessageDialog(null, rellenar[i]);
        }*/

        //EJEMPLO 1
        /*int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud " +
                "del arreglo"));

        int[] arr = new int[longitud];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Ingrese número " + (i+1)));
        }
        for (int i = 0; i < arr.length; i++) {
            JOptionPane.showMessageDialog(null, arr[i]);
            System.out.println(arr[i]);
        }*/

        //CREAR ARREGLO DESDE UNA CLASE
        //Se llama la clase "Casa"
        /*Casa [] lascasas = new Casa[2];
        lascasas[0].setPrecio("3000");
        lascasas[0].setMetros("450");
        lascasas[1].setPrecio("4000");
        lascasas[1].setMetros("850");
        for (int i = 0; i < lascasas.length; i++) {
            lascasas[i] = new Casa("3000","450");
            System.out.println(lascasas[i].getPrecio() + lascasas[i].getMetros());
        }*/

        //CLASES ATRIBUTOS METODOS
        //Relaciones de Datos sentido
        //Automovil-Mecanico
        //Mecanico-Automovil

        //Objeto -> Operaciones -> clases
        //Justificación

        //Ejemplo:
        //Caso de negocio: Panadería laRosa Mediana -> Grande
        // Panadero Vendero Productos
        //Panadero -> Crea productos
        //Vendedor -> Vende los productos
        //Panadería ->
    }
}
package lab;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        //int
      /*  int[] losNumeros = new int[4];
        losNumeros[0] = 8;
        losNumeros[1] = 10;
        losNumeros[2] = 12;
        losNumeros[3] = 14;
        // for
        for (int i = 0; i < losNumeros.length; i++){
            System.out.println(losNumeros[i]);

        }
        System.out.println("\n");

        //String
        String[] lasLetras = new String[6];
        lasLetras[0] ="a";
        lasLetras[1] ="b";
        lasLetras[2] ="c";
        lasLetras[3] ="d";
        lasLetras[4] ="e";
        lasLetras[5] ="f";
        for(int i = 0; i < lasLetras.length; i++){
            System.out.println(lasLetras[i]);
        }

        int[][] numerosCuadrados = new int [2][2];
        numerosCuadrados[0][0] = 35;
        numerosCuadrados[0][1] = 36;
        numerosCuadrados[1][0] = 40;
        numerosCuadrados[1][1] = 50;
        for(int i = 0; i < numerosCuadrados.length; i++){
            for(int j = 0; j < numerosCuadrados.length; j++){
                System.out.println(numerosCuadrados[i][j]);
            }

            }

        // Arreglo pedir longitud en JOptionPane
        // For para rellenar Leer // int
        int longi = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud"));
        int[] arreglo = new int [longi];

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero"));

        }
        for(int i = 0; i < arreglo.length; i++){
            JOptionPane.showMessageDialog(null, arreglo[i]);
        }*/
        Casa[] lasCasas = new Casa[2];
        for (int i = 0; i < lasCasas.length; i++){
            lasCasas[i] = new Casa("2500","300");
            System.out.println(lasCasas[i].getPrecio() + lasCasas[i].getMetros());
        }



        }
    }


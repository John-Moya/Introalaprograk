package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] losNumeros = new int[4];
        // Tipo de Primitivo Int
        // Indice 0
        // Posiciones 4
        // [ , , , ]
        losNumeros[0] = 8;
        losNumeros[1] = 10;
        losNumeros[2] = 12;
        losNumeros[3] = 14;

        // for
        for (int i = 0; i < losNumeros.length; i++) {
            System.out.println(losNumeros[i]);

        }


        String[] arregloxd = new String[6];

        arregloxd[0] = "Hola";
        arregloxd[1] = "Como";
        arregloxd[2] = "estas";
        arregloxd[3] = "me";
        arregloxd[4] = "llamo";
        arregloxd[5] = "Tonnexy";

        for (int i = 0; i < arregloxd.length; i++) {
            System.out.println(arregloxd[i]);

        }


        int longg = Integer.parseInt(JOptionPane.showInputDialog("---Ingrese una Longitud---"));
        int[] lonf = new int[longg];



        for (int i=0;i<lonf.length; i++){

            lonf[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para el campo Numero "+ (i+1)));

    }
        for (int i = 0; i < lonf.length; i++) {

            JOptionPane.showMessageDialog(null,lonf[i] );

        }

}
}

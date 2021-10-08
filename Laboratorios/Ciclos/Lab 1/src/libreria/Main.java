package libreria;

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    public static void main(String[] args) {

        int numero = Integer.parseInt (showInputDialog("Ingrese un numero... "));

        String resultado = "";

        int residuo;

        while (numero >0 ){
            residuo = numero%2;
            resultado = residuo + resultado;
            numero = (numero - residuo) / 2;


        }

        System.out.println(resultado);

        Scanner tec = new Scanner(System.in);

        String palabra = resultado;

        String invert = "";




        for (int contador = palabra.length() -1; contador >= 0; contador --) {

                    invert += palabra.charAt(contador);
        }
        System.out.println(invert);

        int re = Integer.parseInt(resultado);
        int in = Integer.parseInt(invert);

        if (re == in){
            JOptionPane.showMessageDialog(null,"Es polindromo en su forma binaria");
        }else {
            JOptionPane.showMessageDialog(null,"No es polindromo en su forma binaria");

        }

        

    }
}

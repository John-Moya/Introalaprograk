package libreria;

import javax.swing.*;

package com.estudiante.palindromobinario;

public class PalindromoBinario {

    public static void main(String[] args) {
        int elNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if (EsPalindromo(convertirBinario(elNumero))){
            JOptionPane.showMessageDialog(null, "Es palindromo en su forma binaria");
        }else {
            JOptionPane.showMessageDialog(null, "No es palindromo en su forma binaria");
        }
    }
}

private static String convertirBinario(int valor){
        String resultado= "";
        int residuo;
        while (valor > 0) {
            residuo = valor % 2;
            resultado = residuo + resultado;
            valor = (valor - residuo) / 2;
        }

        return resultado;
    }
    private static boolean EsPalindromo(String valor){
        String resultado = "";
        for (int i = 0; i < valor.length(); i++){
            resultado = valor.substring(1,1+1) + resultado;
            )
            System.out.println(valor);
            System.out.println(resultado);
            return resultado.equals(valor);
        }

        return true;
    }
}


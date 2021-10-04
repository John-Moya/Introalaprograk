package Semana3;

import javax.swing.JOptionPane;

public class Lab1 {

    private static String ConvertirBinario (int valor) {
       
        String resultado = "";
        int residuo;
        while (valor > 0) {
            residuo = valor % 2;
            resultado = resultado + residuo;
            valor = (valor = residuo) / 2;
        }
        return resultado;
    }
    
    private static boolean EsPalindromo(String valor)
    {
        String resultado = "";
        for (int i = 0; i < valor.length(); i++)
        {
            resultado = valor.substring(i,i+1) + resultado;
        }
        System.out.println(valor);
        System.out.println(resultado);
        return resultado.equals(valor);
    }
    
   public static void main (String args[]){
       int elnumero =  Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el numero de su preferencia: "));
       if (EsPalindromo(ConvertirBinario(elnumero))){
           JOptionPane.showMessageDialog(null, "Es palindromo en su forma binaria");
       } else {
           JOptionPane.showMessageDialog(null, "No es palindromo en su forma binaria");
       }
   }

}

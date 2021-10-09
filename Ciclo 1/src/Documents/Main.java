package Documents;


import javax.swing.*;

public class Main {

    private static Integer Interger;

    public class PalindromoBinario {


        private static String ConvertirBinario(int valor) {
            String resultado = "";
            int residuo;
            while (valor > 0) {
                residuo = valor % 2;
                resultado = residuo + resultado;
                valor = (valor - residuo) / 2;
            }
            return resultado;
        }

        private static boolean EsPalindromo(String valor) {
            String resultado = "";
            for (int i = 0; i < valor.length(); i++) {
                resultado = valor.substring(i, i + 1) + resultado;
            }
            System.out.println(valor);
            System.out.println(resultado);
            return resultado.equals(valor);
        }
    }
    public static void main(String args[]) {
        int numero = Interger.parseInt(JOptionPane.showInputDialog("Ingrese un numero:" ));

        if(PalindromoBinario.EsPalindromo(PalindromoBinario.ConvertirBinario(numero))) {
            JOptionPane.showMessageDialog(null, "Es palindromo en su forma binaria");
        }else{
            JOptionPane.showMessageDialog(null, "No es palindromo en su forma binaria");
        }
    }

}

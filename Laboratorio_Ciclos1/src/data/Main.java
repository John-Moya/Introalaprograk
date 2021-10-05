package data;
import javax.swing.JOptionPane;
public class Main {

    //
    private static String ConvertirBinario (int numero){
        String resultado ="";
        int residuo;
        while (numero > 0){
            residuo = numero % 2;
            resultado = residuo + resultado;
            numero = (numero - residuo) / 2;
        }
        return resultado;
    }

    //
    private static String ConverOctal (int numero){
        String resultado ="";
        int residuo;
        while (numero > 7){
            residuo = numero % 8;
            resultado = residuo + resultado;
            numero = (numero - residuo) / 8;
        }
        return resultado;
    }

    //
    private static String ConverHexadecimal (int numero){
        String resultado ="";
        int residuo;
        while (numero > 15){
            residuo = numero % 16;
            resultado = residuo + resultado;
            numero = (numero - residuo) /16;
        }
        return resultado;
    }

    //
    private static boolean EsPalindromo (String valor){
        String resultado = "";
        for (int i = 0; i < valor.length(); i++){
            resultado = valor.substring(i, i+1) + resultado;
        }
        System.out.println(valor);
        System.out.println(resultado);
        return resultado.equals(valor);
    }

    //
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (EsPalindromo(ConvertirBinario(numero))) {
            JOptionPane.showMessageDialog(null, "Es palíndromo en su forma binaria");
        } else{
            JOptionPane.showMessageDialog(null, "No es palíndromo en su forma binaria");
        }

        if (EsPalindromo(ConverOctal(numero))) {
            JOptionPane.showMessageDialog(null, "Es palíndromo en su forma octal");
        }else{
            JOptionPane.showMessageDialog(null, "No es palíndromo en su forma octal");
        }

        if (EsPalindromo(ConverHexadecimal(numero))){
            JOptionPane.showMessageDialog(null, "Es palíndromo en su forma hexadecimal");
        }else{
            JOptionPane.showMessageDialog(null, "No es palíndromo en su forma hexadecimal");
        }
    }
}

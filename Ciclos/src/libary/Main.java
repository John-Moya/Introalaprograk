package libary;
import javax.swing.JOptionPane;
public class Main {
    private static String ConvertirBinario(int numero){
        String binario="";
        while (numero>0){
            binario= String.valueOf(numero%2)+binario;
            numero= Math.round(numero/2);

        }
        return binario;

    }
    private static boolean Espalindromo(String valor){
        String resultado="";
        for(int i =0; i<valor.length(); i++){
            resultado= valor.substring(i,i+1)+resultado;
        }
        System.out.println(valor);
        System.out.println(resultado);
        return resultado.equals(valor);
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingres un número decimal"));
        if(Espalindromo(ConvertirBinario(numero))){
            JOptionPane.showMessageDialog(null,"Es un palíndromo en su forma binaria");
        }else{
            JOptionPane.showMessageDialog(null,"No es un palíndromo en su forma binaria");
        }



    }

}

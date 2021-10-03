package libary;
import javax.swing.JOptionPane;

public class Alternativo {
    private static String ConvertirBinario(int numero){
        String binario="";
        while (numero>0){
            binario= String.valueOf(numero%2)+binario;
            numero= Math.round(numero/2);

        }
        return binario;

    }
    private  static String ConvertirOctal(int numero){
        String octal="";
        while (numero>7){
            octal= String.valueOf(numero%8)+octal;
            numero= Math.round(numero/8);

        }
        if(numero<=7){
            octal= String.valueOf(numero)+octal;
        }
        return octal;
    }
    private static String ConvertirHexa(int numero){
        String hexa="";
        while (numero>15){
            switch (numero%16){
                case 10:
                    hexa= "A"+hexa;
                    break;
                case 11:
                    hexa= "B"+hexa;
                    break;
                case 12:
                    hexa= "C"+hexa;
                    break;
                case 13:
                    hexa= "D"+hexa;
                    break;
                case 14:
                    hexa= "E"+hexa;
                    break;
                case 15:
                    hexa= "F"+hexa;
                    break;
                default:
                    hexa= String.valueOf(numero%16)+hexa;
                    break;
            }
            numero= Math.round(numero/16);

        }
        if(numero<=15){
            switch (numero){
                case 10:
                    hexa = "A"+hexa;
                    break;
                case 11:
                    hexa = "B"+hexa;
                    break;
                case 12:
                    hexa = "C"+hexa;
                    break;
                case 13:
                    hexa = "D"+hexa;
                    break;
                case 14:
                    hexa = "E"+hexa;
                    break;
                case 15:
                    hexa = "F"+hexa;
                    break;
                default:
                    hexa = String.valueOf(numero)+hexa;
            }
        }
        return hexa;

    }
    private static boolean Espalindromo(String valor){
        String resultado="";
        for(int i =0; i<valor.length(); i++){
            resultado= valor.substring(i,i+1)+resultado;
        }
        if(resultado.equals(valor)){
            System.out.println(valor);
            System.out.println(resultado);
        }
        return resultado.equals(valor);
    }

    public static void main(String[] args) {
        int cont=0;
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero en base decimal"));
        if(Espalindromo(ConvertirBinario(numero))){
            JOptionPane.showMessageDialog(null,"En base binaria es un palindromo");
            cont++;
        }
        if(Espalindromo(ConvertirOctal(numero))){
            JOptionPane.showMessageDialog(null,"En base octal es un palindromo");
            cont++;
        }
        if(Espalindromo(ConvertirHexa(numero))){
            JOptionPane.showMessageDialog(null,"En base hexadecimal es un palindromo");
            cont++;
        }
        if(cont==0){
            JOptionPane.showMessageDialog(null,"En ninguna de las bases es un palindromo");
        }

    }
}

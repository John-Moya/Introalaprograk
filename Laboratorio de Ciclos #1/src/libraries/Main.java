package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Captura del número

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero"));

        // Número a su forma binaria

        int residuo;
        String Binario = "";
        int numerobinario = numero;
        while (numerobinario > 0){
            residuo = numerobinario % 2;
            if (residuo == 0){
                Binario += "0";
            }else{
                Binario += "1";
            }
            numerobinario = (numerobinario - residuo) / 2;
        }

        JOptionPane.showMessageDialog(null,"Forma Binaria: "+ Binario);

        // Verificación de numero palindromo binario

        String binarioreverso = "";
        int indice = Binario.length() - 1;
        for (int i = 0; i < Binario.length(); i++){
            binarioreverso += Binario.charAt(indice--);
        }

        if (binarioreverso.equals(Binario)){
            JOptionPane.showMessageDialog(null,"El número es palindromo en su forma binaria");
        }else {
            JOptionPane.showMessageDialog(null, "El número no es palindromo en su forma binaria");
        }

        // Número a su forma hexadecimal

        int residuo2 = 0;
        String Hexadecimal = "";
        int numerohexadecimal = numero;
        while ((numerohexadecimal / 16) > 0){
            residuo2 = numerohexadecimal - ((numerohexadecimal / 16) * 16);
            if (residuo2 == 10){
                Hexadecimal += "A";
            } else if (residuo2 == 11){
                Hexadecimal += "B";
            }else if (residuo2 == 12){
                Hexadecimal += "C";
            }else if (residuo2 == 13){
                Hexadecimal += "D";
            }else if (residuo2 == 14){
                Hexadecimal += "E";
            }else if (residuo2 == 15){
                Hexadecimal += "F";
            }else{
                Hexadecimal += residuo2 + "";
            }
            numerohexadecimal = numerohexadecimal / 16;
        }

        residuo2 = numerohexadecimal - ((numerohexadecimal / 16) * 16);
        if (residuo2 == 10){
            Hexadecimal += "A";
        } else if (residuo2 == 11){
            Hexadecimal += "B";
        }else if (residuo2 == 12){
            Hexadecimal += "C";
        }else if (residuo2 == 13){
            Hexadecimal += "D";
        }else if (residuo2 == 14){
            Hexadecimal += "E";
        }else if (residuo2 == 15){
            Hexadecimal += "F";
        }else{
            Hexadecimal += residuo2 + "";
        }

        JOptionPane.showMessageDialog(null, "Forma Hexadecimal: "+ Hexadecimal);

        // Verificación de numero palindromo hexadecimal

        String hexadecimalreverso= "";
        int indice2 = Hexadecimal.length() - 1;
        for (int i = 0; i < Hexadecimal.length(); i++){
            hexadecimalreverso += Hexadecimal.charAt(indice2--);
        }

        if (hexadecimalreverso.equals(Hexadecimal)){
            JOptionPane.showMessageDialog(null,"El número es palindromo en su forma Hexadecimal");
        }else {
            JOptionPane.showMessageDialog(null, "El número no es palindromo en su forma Hexadecimal");
        }

        // Número a su forma octal

        int residuo3 = 0;
        String Octal = "";
        int numerooctal = numero;
        while ((numerooctal / 8) > 0){
            residuo3 = numerooctal - ((numerooctal / 8) * 8);
            Octal += residuo3 + "";
            numerooctal = numerooctal / 8;
        }

        residuo3 = numerooctal - ((numerooctal / 8) * 8);
        Octal += residuo3 + "";

        JOptionPane.showMessageDialog(null, "Forma Octal: "+ Octal);

        // Verificación de numero palindromo octal

        String octalreverso= "";
        int indice3 = Octal.length() - 1;
        for (int i = 0; i < Octal.length(); i++){
            octalreverso += Octal.charAt(indice3--);
        }

        if (octalreverso.equals(Octal)){
            JOptionPane.showMessageDialog(null,"El número es palindromo en su forma Octal");
        }else {
            JOptionPane.showMessageDialog(null, "El número no es palindromo en su forma Octal");
        }

    }
}

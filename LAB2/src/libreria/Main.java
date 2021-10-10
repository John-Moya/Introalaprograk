package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// menu
        int opcion = 1;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opcion deseada \n"+"1) Ejercicio con while \n"+"2)Ejercicio con do while\n"+"3)Ejercicio con for\n"+"0) Salir"));

//While
        if (opcion == 1){
            int i = 1;
            int par = 0;
            int impar = 0;
            int N;
            N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            while (i <= N) {
                System.out.println(i);
                i++;
                if (i % 2 == 1) {
                    par++;
                } else {
                    impar++;
                }
            }
            JOptionPane.showMessageDialog(null,"Cantidad de numeros impares es: " + impar +"\nCantidad de numeros pares es: " + par);

            //DO WHILE
        }else if (opcion == 2) {
            int i = 1;
            int par = 0;
            int impar = 0;
            int N;
            N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            do {
                System.out.println(i);
                i++;
                if (i % 2 == 1) {
                    par++;
                } else {
                    impar++;
                }
            } while (i <= N);
            JOptionPane.showMessageDialog(null,"Cantidad de numeros impares es: " + impar +"\nCantidad de numeros pares es: " + par);

            //FOR
        }else if (opcion == 3) {
            int par = 0;
            int impar = 0;
            int N;
            N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
                if (i % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            JOptionPane.showMessageDialog(null,"Cantidad de numeros impares es: " + impar+"\nCantidad de numeros pares es: " + par);


//Slir
        }else if (opcion == 0){
            JOptionPane.showMessageDialog(null,"Saliste del menu, muchas gracias :D");

//Numero incorrecto
        }else{
            JOptionPane.showMessageDialog(null,"Numero no valido, ingrese un numero valido por favor");
        }






        }while (opcion>=1);

    }
}

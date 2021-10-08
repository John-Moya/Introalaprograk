package data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        int op = 1;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Programa Estructuras de Control Repetitivas," +" Eliga la forma de estructura:" +"\n 1-While " + "\n 2-Do While" + "\n 3-For" + "\n 4-Salir"));
            if (opcion == 1) {
                int i = 1;
                int N;
                int par = 0;
                int impar = 0;
                N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
                while (i <= N) {
                    System.out.println(i);
                    i = i + 1;

                    if ( i % 2 ==1){
                        par++;
                    }else{
                        impar++;
                    }
                }
                System.out.println("Pares: "+par);
                System.out.println("Impares: "+impar);


            } else if (opcion == 2) {
                int i = 1;
                int N;
                int par = 0;
                int impar = 0;
                N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
                do {
                    System.out.println(i);
                    i =i + 1;
                    if ( i % 2 ==1){
                        par++;
                    }else{
                        impar++;
                    }
                } while (i < N+1);
                System.out.println("Pares: "+par);
                System.out.println("Impares: "+impar);


            } else if (opcion == 3) {
                int N;
                int par = 0;
                int impar = 0;
                N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
                for (int i = 1; i < N+1; i++) {
                    System.out.println(i);
                    if ( i % 2 ==1){
                        par++;
                    }else{
                        impar++;
                    }
                }
                System.out.println("Pares: "+par);
                System.out.println("Impares: "+impar);
            }
            System.out.println();
            if (opcion == 4) {
                System.out.println("---Ha salido del programa---");
                break;
            }
        } while (op<=1);

    }
}

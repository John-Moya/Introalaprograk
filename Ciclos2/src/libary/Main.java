package libary;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner miscaner = new Scanner(System.in);
        int ciclo = 0;
        do{
            System.out.println("*********");
            System.out.println("Bienvenido al menu");
            System.out.println("a) Ejercicio con While");
            System.out.println("b) Ejercicio con Do While");
            System.out.println("c) Ejercicio con For");
            System.out.println("d) Salir");
            System.out.println("Selecione una opccion: ");
            String opccion = miscaner.nextLine();
            System.out.println("*********");
            if(opccion.equals("a")){
                int pares = 0;
                int inpares = 0;
                String lista ="";
                System.out.println("Ingrese la cantidad de números que va a querer revisar: ");
                String cantidadCiclo= miscaner.nextLine();
                int cantidad=Integer.parseInt(cantidadCiclo);
                while (cantidad>0){
                    System.out.println("Ingrese un número entero: ");
                    String numero = miscaner.nextLine();
                    int num=Integer.parseInt(numero);
                    if(cantidad==Integer.parseInt(cantidadCiclo)){
                        lista = lista+numero;
                    }else{
                        lista = lista+","+numero;
                    }
                    if(num%2==0){
                        pares++;
                    }else{
                        inpares++;
                    }
                    cantidad--;
                }
                System.out.println("*********");
                System.out.println("Lista de números: ");
                System.out.println(lista);
                System.out.println("Números pares: "+pares);
                System.out.println("Números inpares: "+inpares);

            }else if(opccion.equals("b")){
                int pares = 0;
                int inpares = 0;
                String lista ="";
                System.out.println("Ingrese la cantidad de números que va a querer revisar: ");
                String cantidadCiclo = miscaner.nextLine();
                int cantidad=Integer.parseInt(cantidadCiclo);
                do{
                    System.out.println("Ingrese un número entero: ");
                    String numero = miscaner.nextLine();
                    int num=Integer.parseInt(numero);
                    if(cantidad==Integer.parseInt(cantidadCiclo)){
                        lista = lista+numero;
                    }else{
                        lista = lista+","+numero;
                    }
                    if(num%2==0){
                        pares++;
                    }else{
                        inpares++;
                    }
                    cantidad--;
                }while (cantidad>0);
                System.out.println("*********");
                System.out.println("Lista de números: ");
                System.out.println(lista);
                System.out.println("Números pares: "+pares);
                System.out.println("Números inpares: "+inpares);

            }else if(opccion.equals("c")){
                int pares = 0;
                int inpares = 0;
                String lista ="";
                System.out.println("Ingrese la cantidad de números que va a querer revisar: ");
                String cantidadCiclo = miscaner.nextLine();
                int cantidad=Integer.parseInt(cantidadCiclo);

                for(int i=cantidad;i>=1;i--){
                    System.out.println("Ingrese un número entero: ");
                    String numero = miscaner.nextLine();
                    int num=Integer.parseInt(numero);
                    if(i==cantidad){
                        lista = lista+numero;
                    }else{
                        lista = lista+","+numero;
                    }
                    if(num%2==0){
                        pares++;
                    }else{
                        inpares++;
                    }
                }
                System.out.println("*********");
                System.out.println("Lista de números: ");
                System.out.println(lista);
                System.out.println("Números pares: "+pares);
                System.out.println("Números inpares: "+inpares);
            }else if(opccion.equals("d")){
                ciclo++;
                System.out.println("¡Gracias por usar el sistema!");
            }else {
                System.out.println("¡Opccion no valida!");
            }
        }while(ciclo==0);
    }
}


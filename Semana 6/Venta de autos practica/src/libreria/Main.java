package libreria;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////

        //BANDEJA DE INFORMACION










        ////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("");
	System.out.println("Bienvenido");
        System.out.println("");
        System.out.println("");
        System.out.println("Menu");

        Scanner read= new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1-Venta de automoviles");
            System.out.println("2-Informacion del vendedor");
            System.out.println("3-Atributos de los automoviles e Informacion de los vendedores(Despliegue de informacion)");

            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            opcion= read.nextInt();

        }while (opcion<1||opcion >3);

        switch (opcion){

            case 1:
                System.out.println("");
                System.out.println("    ###Venta de automoviles###");

                Automoviles Suzuki = new Automoviles("100 caballos de fuerza",2020,"4 pasageros","10 millones");
                Automoviles Toyota = new Automoviles("120 caballos de fuerza",2020,"2 pasageros","15 millones");
                Automoviles McLaren = new Automoviles("1000 caballos de fuerza",2020,"1 pasagero","100 millones");
                //////////////////////////////////////////////////

                System.out.println("Suzuki"+"\n");
                Suzuki.print();
                System.out.println("\n");

                //////////////////////////////////////////////////

                System.out.println("Toyota"+"\n");
                Toyota.print();
                System.out.println("\n");

                //////////////////////////////////////////////////
                System.out.println("McLaren"+"\n");
                McLaren.print();
                System.out.println("\n");

                //////////////////////////////////////////////////

                break;

            case 2:
                System.out.println("");
                System.out.println("    ###Vendedores###");

                Vendedor vendedor1 = new Vendedor("Carlos","San Jose","7am-8pm");
                Vendedor vendedor2 = new Vendedor("Luis","Cartao","6am-10pm");
                Vendedor vendedor3 = new Vendedor("Marta","San Pedro","12md-5pm");

                //////////////////////////////////////////////////

                System.out.println("Vendedor 1"+"\n");
                vendedor1.printv();
                System.out.println("\n");

                //////////////////////////////////////////////////

                System.out.println("Vendedor 2"+"\n");
                vendedor2.printv();
                System.out.println("\n");

                //////////////////////////////////////////////////
                System.out.println("Vendedor 3"+"\n");
                vendedor3.printv();
                System.out.println("\n");

                break;


            case 3:
                System.exit(0);

                break;



        }

    }
}

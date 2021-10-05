package libraries;

public class Main {

    public static void main(String[] args) {
	    for (int i = 0; i <= 2; i++){
            System.out.println("Hola estoy siendo ejecutado desde un for");
        }

        // For Sout 8 veces

        for (int i = 0; i < 8; i++){
            System.out.println("Hola estoy siendo ejecutado por un for");
            System.out.println(i + 1);
        }

        for (int i = 3; i > 0; i--){
            System.out.println("Hola estoy siendo ejecutado");
        }

        int j = 0;
        while (j < 5){
            System.out.println("While");
            j = j + 1;
        }

        // while 6 veces

        int i = 0;
        while (i < 6){
            System.out.println("Hola");
            i++;
        }

        int k = 0;
        do {
            System.out.println("Do while");
            k++;
        }while (k<5);

        for (int i = 0; i < 5; i++){
            System.out.println(i); // 0 1
            for (int j = 0; j < 5; j++){
                System.out.println(j); // 0 2
            }
        }


        String mensaje = "";
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                mensaje += "@";

            }
            System.out.println(mensaje);
            mensaje = "";
        }
    }
}

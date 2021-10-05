package libraries;

public class Main {

    public static void main(String[] args) {
	     //Ejemplo for:
        /*for (int i = 0; i < 2; i++){
            System.out.println("Hola estoy siendo ejecutado desde un for");}*/
        // for sout 8 veces
        /*for (int i = 1; i <= 8; i++){
            System.out.println("El número de la repetición es: "+i);}*/

        //Ejemplo While:
        /*int j = 0;
        while (j < 5){
        System.out.println("While");
        j = j + 1;}*/
        //While 6 veces:
        /*int j = 1;
        while (j <= 6){
            System.out.println("While número: "+j);
            j = j + 1;}*/

        //Ejemplo Do while
        /*do {System.out.println("Do While");
        k++;}
        while (k<5);}*/

        //Ejemplo For anidado
        /*for (int i = 1; i <= 5; i++) {
            System.out.println("Primer for número: "+i); // 0 1
            for (int j = 1; j <= 5; j++) {
                System.out.println("Segundo for número: "+j);}*/
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.print("@");
            }
        }
    }
}

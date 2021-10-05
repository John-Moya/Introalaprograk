package Data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Automovil Toyota = new Automovil(); // instancia de la clase Automovil (Copia)
        Toyota.ano= 1983;
        Toyota.cilindrada = 2394.00;
        Toyota.color = "gris";
        Toyota.modelo = "celica";
        Toyota.motor = "22R";
        System.out.println(Toyota.motor);
    }
}

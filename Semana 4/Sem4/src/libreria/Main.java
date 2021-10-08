package libreria;

public class Main {

    public static void main(String[] args) {
	// Doctor
        //Atributos
        // nombre
        //Caracteristicas
        //caracter
        //color de piel

        //Metodos
        //operar
        //hacer consultas
        //mantener higiene

        Automovil Toyota = new Automovil();
        Toyota.ano=1983;
        Toyota.cilindrado= 2394.00;
        Toyota.color = "Gris";
        Toyota.modelo= "Celica";
        Toyota.motor= "22r";

        Toyota.encender();
        Toyota.accelerar();
        Toyota.sonarPito();

        System.out.println(Toyota.ano);


        Automovil RayoMcQueen = new Automovil();
        RayoMcQueen.ano=1983;
        RayoMcQueen.cilindrado= 2394.00;
        RayoMcQueen.color = "Gris";
        RayoMcQueen.modelo= "goloelica";
        RayoMcQueen.motor= "22r";

        System.out.println(RayoMcQueen.modelo);







    }
}

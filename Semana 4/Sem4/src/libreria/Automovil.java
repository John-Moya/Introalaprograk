package libreria;
import  libreria.Automovil;

public class Automovil {
    //color Marca motor ano Cilindrada

    String color;
    String marca;
    String motor;
    String modelo;
    int ano;
    double cilindrado;

    //acciones Sonar Encender acelerar Metodos
    //Parametro

    public  void sonarPito(){System.out.println("Hoonk");}

    public String sonarPitoConRetorno(){return "Honk";}

    public  void  encender(){System.out.println("Ensendido y esta en minimo");}

    public void accelerar(){System.out.println("El automovil acelera");}





}

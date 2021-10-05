package Data;

public class Automovil {
    //color Marca motor ano cilindrada
    String color;
    String marca;
    String motor;
    String modelo;
    int ano;
    double cilindrada;
    public void sonarPito(){
        System.out.println("Honk");
    }
    public String sonarPitoConRetorno(){
        return "Honk";
    }
    public void encender(){
        System.out.println("Encendio y esta en minimo");
    }
    public void accelerar(){
        System.out.println("El automovil accelera");
    }
}

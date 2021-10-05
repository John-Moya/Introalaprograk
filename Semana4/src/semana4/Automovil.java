package semana4;

public class Automovil {

    String color;
    String marca;
    String motor;
    String modelo;
    int ano;
    double cilindrada;

    public void sonarPito() {
        System.out.println("Hanck");
    }

    public String sonarPitoConRetorno() {
        return "Hanck";
    }

    public void encender() {
        System.out.println("Encendido y esta en minimo");
    }

    public void accelerar() {
        System.out.println("El automovil acelera");
    }
}

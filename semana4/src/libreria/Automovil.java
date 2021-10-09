package libreria;

public class Automovil {
    //color, marca, ano, cilindrada
    String color;
    String marca;
    String motor;
    String modelo;
    int ano;
    double cilindrada;

    //Acciones Sonar Pito Encender Acelerar Metodos
    // Parametro
    public void sonarPito() {
        System.out.println("Honk");
    }

    public String sonarPitoConRetorno() {
        return "Honk";
    }

    public void encender() {
        System.out.println("Encendio y esta en minimo");
    }

    public void accelerar() {
        System.out.println("El automovil accelera");
    }
}

// Presionan Accelero 0-100
//

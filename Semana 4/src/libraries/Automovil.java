package libraries;

public class Automovil {
    // Atributos: Color, Marca, Modelo, Año, Cilindrada
    String color;
    String marca;
    String motor;
    String modelo;
    int año;
    double cilindrada;

    // Toyota 1983
    // Volkswagen 1981

    // Acciones: Sonar Pito, Encender, Acelerar // retorno String, Int... Void
    // Parametro

    public void sonarPito() {
        System.out.println("Honk");
    }

    public String sonarpitoConRetorno(){
        return "Honk";
    }

    public void encender(){
        System.out.println("Encendio y esta en minimo");
    }

    public void acelerar(){
        System.out.println("El automovil acelera");
    }
}

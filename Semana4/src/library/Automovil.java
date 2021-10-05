package library;

public class Automovil {
    String color;
    String marca;
    String motor;
    String modelo;
    int ano;
    double cilindraje;

    public void sonarPito(){
        System.out.println("La cucaracha");
    }
    public String sonarPitoConReturn(){
        return "La cucaracha";
    }
    public void encender(){
        System.out.println("Encendio y esta en el minimo");
    }
    public void acelerar(){
        System.out.println("El aoutomovil acelero");
    }
}

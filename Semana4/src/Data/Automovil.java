package Data;

public class Automovil {
    // Color Marca Motor Modelo Ano Cilindrada
    String color;
    String marca;
    String motor;
    String modelo;
    Integer ano;
    double cilindrada;

    // Acciones
    // Parametro
    public void SonarPito(){
        System.out.println("Honk");
    }
    public String SonarPitoConRetorno(){
        return "Honk";
    }
    public void encender(){
        System.out.println("Encendió y está en mínimo");
    }
    public void acelerar(){
        System.out.println("El automovil acelera");
    }
    // Presionan Acelero 0-100

}

package data;

public class Automovil {
    // Color, marca, motor, modelo, año, cilindrada
    String color, marca, motor, modelo;
    Integer año;
    //Precisión para almacenar; Float 32, Double 64
    double cilindrada;
    //Atributos lo más aproximados a la realidad
    //Metodos son acciones

    // Toyota 1983, Volkswagen 1981
    //Acciones sonar pito, encender, acelerar// metodos

    public void SonarPito(){
        System.out.println("Honk");
    }
    public String sonarPitoconRetorno(){
        return "Honk";
    }
    public void encernder(){
        System.out.println("Encendido y esta en mínimo");
    }
    public void acelerar(){
        System.out.println("El automovil acelera");
    }

    //Presionan el Acelerador 0-100
    //
}

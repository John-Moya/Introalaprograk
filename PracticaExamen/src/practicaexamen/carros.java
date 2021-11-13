package practicaexamen;
public class carros {
    String color;
    String marca;
    String motor;
    
     public void encender() {
        System.out.println("El carro se enciende");
    }

    public String sonarPitoConRetorno() {
        return "Hanck";
    }

    public void apagar() {
        System.out.println("El carro se apaga");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
}

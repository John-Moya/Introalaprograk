package libreria;

public class Automoviles {
    ///////////Atributos////////////
    private String Motor;
    private String Puertas;
    private String Pasajeros;

    public Automoviles(String motor, String puertas, String pasajeros) {
        Motor = motor;
        Puertas = puertas;
        Pasajeros = pasajeros;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public String getPuertas() {
        return Puertas;
    }

    public void setPuertas(String puertas) {
        Puertas = puertas;
    }

    public String getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        Pasajeros = pasajeros;
    }
}

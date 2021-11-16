package libraries;

public class Automoviles {

    private String motor;
    private String puertas;
    private String pasajeros;
    public Mecanico elMecanico;

    public Automoviles(String motor, String puertas, String pasajeros) {
        this.motor = motor;
        this.puertas = puertas;
        this.pasajeros = pasajeros;
        this.elMecanico = new Mecanico("", "", 0);
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }
}

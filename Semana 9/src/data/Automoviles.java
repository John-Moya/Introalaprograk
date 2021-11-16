package data;

public class Automoviles {
    private String Motor,Puertas,Pasajeros;
    public Mecanico elMecanico;


    public Automoviles(String motor, String puertas, String pasajeros) {
        this.Motor = motor;
        this.Puertas = puertas;
        this.Pasajeros = pasajeros;
        this.elMecanico = new Mecanico("","","");
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

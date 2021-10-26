package libreria;

public class Automovil {

    public  static String clase = "Liviana";

    private String motor;
    private String cilindrada;
    private int ano;

    public Automovil(String motor, String cilindrada, int ano) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.ano = ano;


    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

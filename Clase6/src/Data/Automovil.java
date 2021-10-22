package Data;

public class Automovil {
    public static String clase = "Liviano";
    private String motor;
    private String cilindrada;
    private int ano;
    public Rtv riteve;

    public Automovil(String motor, String cilindrada, int ano) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.ano = ano;
        this.riteve = new Rtv("24","julio","ninguna");
    }

    public Automovil() {
    }

    public Automovil(String motor, String cilindrada) {
        this.motor = motor;
        this.cilindrada = cilindrada;
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

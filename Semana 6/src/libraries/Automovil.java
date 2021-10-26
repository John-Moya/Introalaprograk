package libraries;

public class Automovil {

    public static String clase = "Liviana";
    // Valores del objeto que no cambian
    private String motor;
    private String cilindrada;
    private String ano;
    public Rtv riteve;
    //public Nombre de la Clase -> Instancia

    // Encapsulación Valores Private Public

    public Automovil(String motor, String cilindrada, String ano) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.ano = ano;
        this.riteve = new Rtv("25", "julio", "ninguna");
        // this.instancia
    }

    public Automovil(){

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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

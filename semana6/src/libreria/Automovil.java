package libreria;


public class Automovil {

    public static String clase = "Liviano";

    private String motor;
    private String cilidrada;
    private String ano;
    public Rtv riteve;

    public Automovil(String motor, String cilidrada, String ano) {
        this.motor = motor;
        this.cilidrada = cilidrada;
        this.ano = ano;
        this.riteve = new Rtv ("24","julio","Ninguna");
    }

    public Automovil(){

    }
    public Automovil(String motor,String cilindrada) {
        this.motor = motor;
        this.cilidrada = cilindrada;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(String cilidrada) {
        this.cilidrada = cilidrada;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

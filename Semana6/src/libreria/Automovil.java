package libreria;

public class Automovil {
    public static  String clase = "Liviana";
    private String motor;
    private String cilindrada;
    private String ano;

    public Rtv riteve;

    public Automovil(String motor, String cilindrada, String ano) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.ano = ano;
        this.riteve = new Rtv("24","julio","ninguna");
    }

    public Automovil (){

    }

    public Automovil(String motor,String cilindrada){
        this.motor = motor;
        this.cilindrada = cilindrada;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        if (motor == "2500cc"){
            System.out.println("Motor de Alto consumo");
        }
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

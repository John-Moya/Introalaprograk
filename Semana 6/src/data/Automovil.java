package data;

public class Automovil {
    public static String clase = "Liviana"; //  Atributo estatico
    private String motor, cilindrada, ano;
    //atributo Riteve
    public Riteve riteve;

    //Encapsulación de valores-atributos private, los constructures, setters y getters en public

    public Automovil(String motor, String cilindrada, String ano) {
        if (motor == "9cyl"){
            System.out.println("Motor de alto consumo");
        }
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.ano = ano;
        this.riteve = new Riteve("24", "agosto", "ninguna");
        //this."instancia"
    }

    public Automovil(){

    }

    public Automovil(String motor, String cilindrada){
        this.motor = motor;
        this.cilindrada= cilindrada;
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

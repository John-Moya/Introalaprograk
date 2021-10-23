package Library;

public class Automovil {
    public static String clase= "Liviano";// atributo estatico (valores del objeto q no cambian)
    private String motor;
    private String cilindrada;
    private String ano;
    public Rtv riteve; // atributo de la clase Rtv pone un nombre (hacer una copia)


    //Encapsulacion valores poner los atributos 'Private'

    public Automovil(String motor, String cilindrada, String ano) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.ano = ano;
        this.riteve= new Rtv("25","julio", "ninguna");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
       if (motor == "2500cc"){
           System.out.println("Motor de alto consumo");
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
    /// multiples constructores
    public Automovil (){ ///Abrir un constructor nuevo

    }
    public Automovil (String motor, String cilindrada){ //abrir solo un constructor especifico

    }

}

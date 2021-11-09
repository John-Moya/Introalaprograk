package libreria;

public class Camion1 {
   private String placa;
   private String marca;
   private String modelo;
   private double peso;

    public Camion1(String placa, String marca, String modelo, double peso) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }

    public void marca(){
        System.out.println("su marca" +marca);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

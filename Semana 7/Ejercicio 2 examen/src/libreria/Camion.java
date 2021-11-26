package libreria;

public class Camion {
    ////////Atributos///////
    private String placa;
    private String marca;
    private String modelo;
    private String pesoquepuedellevar;

    public Camion(String placa, String marca, String modelo, String pesoquepuedellevar) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.pesoquepuedellevar = pesoquepuedellevar;
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

    public String getPesoquepuedellevar() {
        return pesoquepuedellevar;
    }

    public void setPesoquepuedellevar(String pesoquepuedellevar) {
        this.pesoquepuedellevar = pesoquepuedellevar;
    }
}

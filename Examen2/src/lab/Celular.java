package lab;

public class Celular {
    private String marca;
    private String costo;
    private String modelo;
    Reparador[] elrepa;

    public Celular(String marca, String costo, String modelo, Reparador[] elrepa) {
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
        this.elrepa = elrepa;
    }

    public Celular(String marca, String costo, String modelo) {
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

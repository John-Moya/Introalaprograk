package libraries;

public class Bebida {

    // Atributos

    String tamano;
    String tipo;
    String bebida;

    // Constructor

    public Bebida(String tamano, String tipo, String bebida) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.bebida = bebida;
    }

    // Getters y Setters

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
}

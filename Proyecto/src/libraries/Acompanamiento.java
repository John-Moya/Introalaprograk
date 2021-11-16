package libraries;

public class Acompanamiento {

    // Atributos

    String tamano;
    String tipo;

    // Constructor

    public Acompanamiento(String tamano, String tipo) {
        this.tamano = tamano;
        this.tipo = tipo;
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
}

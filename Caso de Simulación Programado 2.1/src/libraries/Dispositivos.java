package libraries;

public class Dispositivos {

    // Atribuitos

    private String equipo;
    private String marca;
    private int costo;
    private String modelo;
    public Reparador elReparador;

    // Constructor

    public Dispositivos(String equipo, String marca, int costo, String modelo) {
        this.equipo = equipo;
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
        this.elReparador = new Reparador("", "");
    }

    // Getters y Setters

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

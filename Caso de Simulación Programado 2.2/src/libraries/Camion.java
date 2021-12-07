package libraries;

public class Camion {

    // Atributos

    private int numeroUnidad;
    private String peso;
    private int cantidadPasajeros;
    private String ruta;
    public Conductor elConductor;

    // Constructor


    public Camion(int numeroUnidad, String peso, int cantidadPasajeros, String ruta) {
        this.numeroUnidad = numeroUnidad;
        this.peso = peso;
        this.cantidadPasajeros = cantidadPasajeros;
        this.ruta = ruta;
        this.elConductor = new Conductor("", "", 0, 0);
    }

    // Getters y Setters


    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}

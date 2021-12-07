package Data;

public class Camion {
    private int numeroUnidad;
    private float pesoMax;
    private String ruta;
    private int cantidadPasajeros;
    public Conductor[] conductores = new Conductor[2];

    public Camion(int numeroUnidad, float pesoMax, String ruta, int cantidadPasajeros) {
        this.numeroUnidad = numeroUnidad;
        this.pesoMax = pesoMax;
        this.ruta = ruta;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public float getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}

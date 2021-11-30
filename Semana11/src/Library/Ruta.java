package Library;

public class Ruta {
    private String salida;
    private String paradas;
    private String llegada;

    public Ruta(String salida, String paradas, String llegada) {
        this.salida = salida;
        this.paradas = paradas;
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getParadas() {
        return paradas;
    }

    public void setParadas(String paradas) {
        this.paradas = paradas;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }
}

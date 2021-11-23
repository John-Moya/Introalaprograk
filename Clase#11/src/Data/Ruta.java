package Data;

public class Ruta {
    private int CantidadParadas;
    private  String puntoPartida;
    private String puntoLlegada;

    public Ruta(int cantidadParadas, String puntoPartida, String puntoLlegada) {
        this.CantidadParadas = cantidadParadas;
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;
    }

    public int getCantidadParadas() {
        return CantidadParadas;
    }

    public void setCantidadParadas(int cantidadParadas) {
        CantidadParadas = cantidadParadas;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(String puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }
}

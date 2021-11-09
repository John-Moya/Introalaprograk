package libraries;

public class Envios {

    private String Destino;
    private String tipoPaquete;
    private String distanciaKilometros;
    private String nombreMensajero;

    public Envios(String destino, String tipoPaquete, String distanciaKilometros, String nombreMensajero) {
        Destino = destino;
        this.tipoPaquete = tipoPaquete;
        this.distanciaKilometros = distanciaKilometros;
        this.nombreMensajero = nombreMensajero;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public String getDistanciaKilometros() {
        return distanciaKilometros;
    }

    public void setDistanciaKilometros(String distanciaKilometros) {
        this.distanciaKilometros = distanciaKilometros;
    }

    public String getNombreMensajero() {
        return nombreMensajero;
    }

    public void setNombreMensajero(String nombreMensajero) {
        this.nombreMensajero = nombreMensajero;
    }
}

package libreria;

public class Paquete {

    ////////Atributos///////
    private String almacen;
    private String tipoDedaquete;
    private String distanciaKm;
    private String nombreDelDensajero;

    public Paquete(String almacen, String tipoDedaquete, String distanciaKm, String nombreDelDensajero) {
        this.almacen = almacen;
        this.tipoDedaquete = tipoDedaquete;
        this.distanciaKm = distanciaKm;
        this.nombreDelDensajero = nombreDelDensajero;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getTipoDedaquete() {
        return tipoDedaquete;
    }

    public void setTipoDedaquete(String tipoDedaquete) {
        this.tipoDedaquete = tipoDedaquete;
    }

    public String getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(String distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getNombreDelDensajero() {
        return nombreDelDensajero;
    }

    public void setNombreDelDensajero(String nombreDelDensajero) {
        this.nombreDelDensajero = nombreDelDensajero;
    }
}

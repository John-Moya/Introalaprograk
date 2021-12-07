package Data;

public class Dispositivo {
    private String marca;
    private float costoReparacion;
    private String modelo;
    private int cedulaDueno;
    private String reparacion;

    public Dispositivo(String marca, float costoReparacion, String modelo, int cedulaDueno, String reparacion) {
        this.marca = marca;
        this.costoReparacion = costoReparacion;
        this.modelo = modelo;
        this.cedulaDueno = cedulaDueno;
        this.reparacion = reparacion;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    public int getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(int cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCostoReparacion() {
        return costoReparacion;
    }

    public void setCostoReparacion(float costoReparacion) {
        this.costoReparacion = costoReparacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

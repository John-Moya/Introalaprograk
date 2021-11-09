package lab;

public class Muebles {
    private String locacion;
    private String tipo;
    private String asientos;

    public Muebles(String locacion, String tipo, String asientos) {
        this.locacion = locacion;
        this.tipo = tipo;
        this.asientos = asientos;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
}

package data;

public class Muebles {
    private String locación,tipo,asientos;

    public Muebles(String locación, String tipo, String asientos) {
        this.locación = locación;
        this.tipo = tipo;
        this.asientos = asientos;
    }

    public String getLocación() {
        return locación;
    }

    public void setLocación(String locación) {
        this.locación = locación;
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

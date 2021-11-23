package lab;

public class Ruta {
    private String ubicacion;
    private String hora;

    public Ruta(String ubicacion, String hora) {
        this.ubicacion = ubicacion;
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

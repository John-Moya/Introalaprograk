package libraries;

public class Ruta {

    private String Ubicacion;
    private String horario;

    public Ruta(String ubicacion, String horario) {
        this.Ubicacion = ubicacion;
        this.horario = horario;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

package libraries;

public class Mecanico {

    private String nombre;
    private String horario;

    public Mecanico(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

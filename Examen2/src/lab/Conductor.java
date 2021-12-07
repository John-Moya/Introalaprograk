package lab;

public class Conductor {
    private String nombre;
    private String horario;
    Camion[] losCamiones;

    public Conductor(String nombre, String horario, Camion[] losCamiones) {
        this.nombre = nombre;
        this.horario = horario;
        this.losCamiones = losCamiones;
    }

    public Conductor(String nombre, String horario) {
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

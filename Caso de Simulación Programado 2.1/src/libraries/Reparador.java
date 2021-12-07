package libraries;

public class Reparador {

    // Atributos

    private String nombre;
    private String horario;

    // Constructor


    public Reparador(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
    }

    // Getters y Setters


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

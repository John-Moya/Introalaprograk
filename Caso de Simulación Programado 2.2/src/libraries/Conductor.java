package libraries;

public class Conductor {

    // Atributos

    private String nombre;
    private String horario;
    private int cedula;
    private int telefono;

    // Constructor


    public Conductor(String nombre, String horario, int cedula, int telefono) {
        this.nombre = nombre;
        this.horario = horario;
        this.cedula = cedula;
        this.telefono = telefono;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

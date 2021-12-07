package Data;

public class Conductor {
    private String nombre;
    private int cedula;
    private int telefono;
    private String horario;

    public Conductor(String nombre, int cedula, int telefono, String horario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

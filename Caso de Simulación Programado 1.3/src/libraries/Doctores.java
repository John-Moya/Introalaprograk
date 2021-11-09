package libraries;

public class Doctores {

    private String nombre;
    private String especialidad;
    private int numeroMedico;

    public Doctores(String nombre, String especialidad, int numeroMedico) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroMedico = numeroMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String specialidad) {
        this.especialidad = specialidad;
    }

    public int getNumeroMedico() {
        return numeroMedico;
    }

    public void setNumeroMedico(int numeroMedico) {
        this.numeroMedico = numeroMedico;
    }
}

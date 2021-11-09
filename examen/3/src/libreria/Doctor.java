package libreria;

public class Doctor {
    private String nombre;
    private String especialidad;
    private double numeroMedico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getNumeroMedico() {
        return numeroMedico;
    }

    public void setNumeroMedico(double numeroMedico) {
        this.numeroMedico = numeroMedico;
    }

    public Doctor(String nombre, String especialidad, double numeroMedico) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroMedico = numeroMedico;

    }
}

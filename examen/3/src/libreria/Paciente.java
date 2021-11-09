package libreria;

public class Paciente {
    private String nombre;
    private double cedula;
    private String estadia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }

    public Paciente(String nombre, double cedula, String estadia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estadia = estadia;


    }
}

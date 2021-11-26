package libreria;

public class Pacientes {
    ////////Atributos///////
    private String nombre;
    private String cedula;
    private String estadia;
    public Medico doctor;

    public Pacientes(String nombre, String cedula, String estadia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estadia = estadia;
        this.doctor = new Medico("", "", "");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }
}

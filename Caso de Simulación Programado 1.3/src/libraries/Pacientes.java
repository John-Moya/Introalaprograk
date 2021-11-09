package libraries;

public class Pacientes {

    private String nombre;
    private int cedula;
    private String estadia;
    public Doctores doctor1;
    public Doctores doctor2;

    public Pacientes(String nombre, int cedula, String estadia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estadia = estadia;
        this.doctor1 = new Doctores("", "", 0);
        this.doctor2 = new Doctores("", "", 0);
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

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }
}

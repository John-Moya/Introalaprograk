package libraries;

public class Cliente {

    private String Nombre;
    private int Cedula;
    Libreria[] losLibros;

    public Cliente(String nombre, int cedula, Libreria[] losLibros) {
        Nombre = nombre;
        Cedula = cedula;
        this.losLibros = losLibros;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }
}

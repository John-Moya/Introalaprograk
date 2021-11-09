package libraries;

public class Empleados {

    private String nombre;
    private int cedula;
    private int horasMax;

    public Empleados(String nombre, int cedula, int horasMax) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horasMax = horasMax;
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

    public int getHorasMax() {
        return horasMax;
    }

    public void setHorasMax(int horasMax) {
        this.horasMax = horasMax;
    }
}

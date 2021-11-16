package libraries;

public class Cliente {

    private String nombre;
    private int cedula;
    public Productos productos;
    public Tiquete tiquete;

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.productos = new Productos("", 0, 0);
        this.tiquete = new Tiquete("", "", 0, "");
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
}

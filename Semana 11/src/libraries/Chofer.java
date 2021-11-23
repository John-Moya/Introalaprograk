package libraries;

public class Chofer {

    private String nombre;
    private int edad;
    public Ruta ruta;

    public Chofer(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ruta = new Ruta("" ,"");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

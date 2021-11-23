package lab;

public class Chofer {
    private String nombre;
    Bus[] losBuses;

    public Chofer(String nombre, Bus[] losBuses) {
        this.nombre = nombre;
        this.losBuses = losBuses;
    }

    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

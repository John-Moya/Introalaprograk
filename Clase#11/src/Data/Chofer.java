package Data;

public class Chofer {
    public Ruta rutaActual;
    public Bus elBus;
    private String nombre;

    public Chofer(Ruta laRuta, Bus elBus, String nombre) {
        this.rutaActual = new Ruta(0,"","");
        this.elBus = new Bus(0,0,"");
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Chofer() {
    }
}

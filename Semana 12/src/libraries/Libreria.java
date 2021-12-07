package libraries;

public class Libreria {

    private String Libro;
    private int Cantidad;
    public Costo elCosto;


    public Libreria(String libro, int cantidad) {
        Libro = libro;
        Cantidad = cantidad;
        this.elCosto = new Costo(0, 0, 0);
    }

    public String getLibro() {
        return Libro;
    }

    public void setLibro(String libro) {
        Libro = libro;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}

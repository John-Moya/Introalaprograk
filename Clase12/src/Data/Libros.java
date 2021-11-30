package Data;

public class Libros {
    private String nombre;
    private int codigo;
    private int precio;
    public  Costo costos;

    public Libros(String nombre, int codigo, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.costos = new Costo("");
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

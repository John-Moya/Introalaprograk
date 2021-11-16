package libraries;

public class Productos {

    private String tipo;
    private int precio;
    private int cantidad;

    public Productos(String tipo, int precio, int cantidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}

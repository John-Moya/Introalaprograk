package Library;

public class Productos {
    private String tipo;
    private String precio;
    private String cantidad;

    public Productos(String tipo, String precio, String cantidad) {
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}

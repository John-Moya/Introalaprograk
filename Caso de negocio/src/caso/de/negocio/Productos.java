package caso.de.negocio;

public class Productos {

    String Tipo;
    String Precio;
    String Cantidad;

    public Productos(String Tipo, String Precio, String Cantidad) {
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

}

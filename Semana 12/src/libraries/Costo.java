package libraries;

public class Costo {

    private int Precio;
    private int Descuento;
    private int PrecioFinal;

    public Costo(int precio, int descuento, int precioFinal) {
        Precio = precio;
        Descuento = descuento;
        PrecioFinal = precioFinal;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int descuento) {
        Descuento = descuento;
    }

    public int getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        PrecioFinal = precioFinal;
    }
}

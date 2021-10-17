package library;

public class Venta {
    String producto;
    double precio;
    int cantidad;
    String vendedor;
    String fechaVenta;

    public Venta(String producto, double precio, int cantidad, String vendedor, String fechaVenta) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.vendedor = vendedor;
        this.fechaVenta = fechaVenta;
    }
}

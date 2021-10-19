package libraries;

public class Venta {
    // Carros
    //Medicinas
    // Constructor
    // 2 copias

    String Marca;
    String Color;
    int precio;

    public Venta(String marca, String color, int precio) {
        Marca = marca;
        Color = color;
        this.precio = precio;
    }

    String medicamento;
    int cantidad;
    int costo;

    public Venta(String medicamento, int cantidad, int costo) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.costo = costo;
    }
}

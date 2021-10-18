package data;

public class Taller {
    //Taller de motos
    //Constructor
    // 2 copias
    String reparación, repuestos;
    int cantidad;

    public Taller(String reparación, String repuestos, int cantidad) {
        this.reparación = reparación;
        this.repuestos = repuestos;
        this.cantidad = cantidad;
    }

    public Taller(String reparación, String repuestos) {
        this.reparación = reparación;
        this.repuestos = repuestos;
    }
}

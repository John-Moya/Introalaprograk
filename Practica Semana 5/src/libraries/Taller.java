package libraries;

public class Taller {
    //Taller de Motos
    // Taller de Camiones
    // constructor
    // 2 copias

    String llantas;
    String cantidad;
    String Material;

    public Taller(String llantas, String cantidad, String material) {
        this.llantas = llantas;
        this.cantidad = cantidad;
        Material = material;
    }

    public Taller(String llantas, String cantidad) {
        this.llantas = llantas;
        this.cantidad = cantidad;
    }
}

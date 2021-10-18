package data;

public class Venta {
    //Venta de celulares
    //Constructor
    //2 copias
    String producto, horario, marcas;
    public Venta(String producto, String marcas, String horario) {
        this.producto = producto;
        this.horario = horario;
        this.marcas = marcas;
    }

    public Venta(String producto, String horario) {
        this.producto = producto;
        this.horario = horario;
    }
}

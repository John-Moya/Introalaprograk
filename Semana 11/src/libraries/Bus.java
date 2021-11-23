package libraries;

public class Bus {

    private int CantidadPasajeros;
    private String Litros;
    public Ruta ruta;
    public Chofer chofer;

    public Bus(int cantidadPasajeros, String litros) {
        this.CantidadPasajeros = cantidadPasajeros;
        this.Litros = litros;
        this.ruta = new Ruta("", "");
        this.chofer = new Chofer("", 0);
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        CantidadPasajeros = cantidadPasajeros;
    }

    public String getLitros() {
        return Litros;
    }

    public void setLitros(String litros) {
        Litros = litros;
    }
}

package Data;

public class Bus {
    private int cantidadPasajeros;
    private int litros;
    private String placa;
    public Ruta lRuta;

    public Bus(int cantidadPasajeros, int litros, String placa) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.litros = litros;
        this.placa = placa;
        this.lRuta = new Ruta(0,"","");
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

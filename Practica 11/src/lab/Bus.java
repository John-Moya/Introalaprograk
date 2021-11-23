package lab;

public class Bus {
    private String pasajeros;
    private String litros;
    public Ruta laRuta;
    public Chofer elChofer;

    public Bus(String pasajeros, String litros) {
        this.pasajeros = pasajeros;
        this.litros = litros;
        this.laRuta = new Ruta("","");
        this.elChofer = new Chofer(" ");
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }
}

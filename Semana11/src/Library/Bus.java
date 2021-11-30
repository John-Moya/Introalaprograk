package Library;

public class Bus {
    private String cantPasajeros;
    private String ruta;
    private String litros;
    public Ruta laRuta;


    public Bus(String cantPasajeros, String rura, String litros) {
        this.cantPasajeros = cantPasajeros;
        this.ruta = rura;
        this.litros = litros;
        this.laRuta= new Ruta("","","");


    }

    public String getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(String cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getRura() {
        return ruta;
    }

    public void setRura(String rura) {
        this.ruta = rura;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }
}

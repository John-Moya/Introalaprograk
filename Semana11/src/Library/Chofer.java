package Library;

public class Chofer {
    private String bus;
    private String ruta; // es otro objeto
    public Bus elBus;
    Bus [] losBuses;


    public Chofer(String bus, String ruta) {
        this.bus = bus;
        this.ruta = ruta;
        this.elBus= new Bus("","","");


    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}

package semana.pkg11main;

public class Chofer {

    private String NumChofe;
    private String Bus;
    private String Ruta;

    public Chofer(String NumChofe, String Bus, String Ruta) {
        this.NumChofe = NumChofe;
        this.Bus = Bus;
        this.Ruta = Ruta;
    }


    public Chofer() {
        
    }

    public String getNumChofe() {
        return NumChofe;
    }

    public void setNumChofe(String NumChofe) {
        this.NumChofe = NumChofe;
    }

    public String getBus() {
        return Bus;
    }

    public void setBus(String Bus) {
        this.Bus = Bus;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
    
}

    
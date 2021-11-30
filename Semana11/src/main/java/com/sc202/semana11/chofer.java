
package com.sc202.semana11;

public class chofer {
    
   private String numChofer;
   private String bus;
   private String ruta;

    public chofer(String numChofer, String bus, String ruta) {
        this.numChofer = numChofer;
        this.bus = bus;
        this.ruta = ruta;
    }

    public String getNumChofer() {
        return numChofer;
    }

    public void setNumChofer(String numChofer) {
        this.numChofer = numChofer;
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

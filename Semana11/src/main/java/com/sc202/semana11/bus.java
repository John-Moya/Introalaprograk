
package com.sc202.semana11;

public class bus {
   private String cantidad;
   private String litros;
   private String ruta;
  public chofer Elchofer;

    public bus(chofer Elchofer) {
        this.Elchofer = Elchofer;
    }

    public chofer getElchofer() {
        return Elchofer;
    }

    public void setElchofer(chofer Elchofer) {
        this.Elchofer = Elchofer;
    }
  

    public bus(String cantidad, String litros, String ruta) {
        this.cantidad = cantidad;
        this.litros = litros;
        this.ruta = ruta;
    }

  
 
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    }



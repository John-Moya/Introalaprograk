package com.sc202.principal;

public class tiquete {
    String sala;
    String asiento;
    String precio;
    String tipo;

    public tiquete(String sala, String asiento, String precio, String tipo) {
        this.sala = sala;
        this.asiento = asiento;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}

   

package com.sc202.semana12;

public class libros {
    
    String nombre;
    String genero;
    public clientes losclientes;
    public costos Costos;

    public libros(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
}

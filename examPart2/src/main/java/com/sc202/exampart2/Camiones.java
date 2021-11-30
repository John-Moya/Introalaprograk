
package com.sc202.exampart2;


    public class Camiones {
    
   private String placa;
   private String marca;
   private String modelo;
   private String peso;

    public Camiones(String placa, String marca, String modelo, String peso) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }
   
   

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}


package data;

public class Salsas {
    public static String ingrediente;
    public static String comdimentos;
    public static String paladar;
    private  String tamano, tipo, gramos;

    public Salsas(String tamano, String tipo, String gramos) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.gramos = gramos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGramos() {
        return gramos;
    }

    public void setGramos(String gramos) {
        this.gramos = gramos;
    }

    //metodos
    public void sabor(){
        System.out.println("Dar sabor a las comidas");
    }

    public void tonalidades(){
        System.out.println("Diversas tonalides dependiendo del sabor");
    }

    public void acompañar(){System.out.println("Comer con papas");}
}

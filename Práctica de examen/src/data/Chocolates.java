package data;

public class Chocolates {
    public static String ingrediente;
    public static String aroma;
    public static String paladar;
    private  String tamano, tipo, gramos;
    public Galletas galletas;

    public Chocolates(String tamano, String tipo, String gramos) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.gramos = gramos;
        this.galletas = new Galletas("Club", 1000, 4);
    }

    //gettters y setters
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
    public void energia(){
        System.out.println("Da energia");
    }

    public void tonalidades(){
        System.out.println("Presenta de¿iversas tonalides");
    }

    public void sabor(){
        System.out.println("Amargo");
    }
}

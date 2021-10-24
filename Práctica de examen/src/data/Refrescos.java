package data;

public class Refrescos {
    public static String gas;
    public static String refrescante;
    public static String paladar;
    private  String tamano, tipo, litros;

    public Refrescos(String tamano, String tipo, String litros) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.litros = litros;
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

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    //metodos
    public void energia(){
        System.out.println("Da energia");
    }

    public void tonalidades(){
        System.out.println("Color rojo");
    }

    public void sabor(){
        System.out.println("Dulce");
    }
}

package libraries;

public class Computadora {

    public static String pantalla = "15.6";
    public static String Marca = "Dell";
    public static String Modelo = "Inspiron 15 5000";
    String Color;
    String Disco;
    String RAM;

    public Computadora(String color, String disco, String RAM) {
        Color = color;
        Disco = disco;
        this.RAM = RAM;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getDisco() {
        return Disco;
    }

    public void setDisco(String disco) {
        Disco = disco;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void encender(){
        System.out.println("La computadora ha encendido");
    }

    public void abrirArchivos(){
        System.out.println("Se han abierto los archivos");
    }

    public void apagar(){
        System.out.println("La computadora se ha apagado");
    }
}

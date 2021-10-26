package libraries;

public class Cuarto {

    String tamaño;
    int cantidadCamas;
    String color;

    public Cuarto(String tamaño, int cantidadCamas, String color) {
        this.tamaño = tamaño;
        this.cantidadCamas = cantidadCamas;
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void encenderLuces(){
        System.out.println("Se han encendido las luces");
    }

    public void abrirpuerta(){
        System.out.println("La puerta se ha abierto");
    }

    public void cerrarpuerta(){
        System.out.println("La puerta se ha cerrado");
    }
}

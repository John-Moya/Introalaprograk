package libraries;

public class Casa {

    public static  String ubicacion = "San José";
    public static String tamano = "100m";
    public static String material = "Cemento";
    public Cuarto cuarto1;
    String color;
    String materialPuertas;
    int cantidadVentanas;

    public Casa(String color, String materialPuertas, int cantidadVentanas) {
        this.color = color;
        this.materialPuertas = materialPuertas;
        this.cantidadVentanas = cantidadVentanas;
        this.cuarto1 = new Cuarto("5m", 2, "azul");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterialPuertas() {
        return materialPuertas;
    }

    public void setMaterialPuertas(String materialPuertas) {
        this.materialPuertas = materialPuertas;
    }

    public int getCantidadVentanas() {
        return cantidadVentanas;
    }

    public void setCantidadVentanas(int cantidadVentanas) {
        this.cantidadVentanas = cantidadVentanas;
    }

    public void encenderLuces(){
        System.out.println("Las luces se han encendido");
    }

    public void abrirPorton(){
        System.out.println("El portón se ha abierto");
    }

    public void cerrarPorton(){
        System.out.println("El portón se ha cerrado");
    }
}

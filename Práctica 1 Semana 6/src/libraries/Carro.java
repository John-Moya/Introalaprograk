package libraries;

public class Carro {

    public static String Marca = "Nissan";
    public static String clase = "Deportivo";
    public static String modelo = "GTR";
    String color;
    String materialAsientos;
    int precio;

    public Carro(String color, String materialAsientos, int precio) {
        this.color = color;
        this.materialAsientos = materialAsientos;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

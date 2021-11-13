package practicaexamen;
public class telefonos {
    String marca;
    int precio;
    String color;
    
    public void Ejecuta() {
        System.out.println("El telefono inicia");
    }

    public void llama() {
        System.out.println("El telefono realiza y recive llamadas");
    }

    public void Cierra() {
        System.out.println("El telefono se apaga");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

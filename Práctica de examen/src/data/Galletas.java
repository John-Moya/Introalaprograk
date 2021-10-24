package data;

public class Galletas {
    private String marca;
    private int precio, cantidad;

    public Galletas(String marca, int precio, int cantidad) {
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodos
    public void alimentar(){}
    public void dieta (){}
}

package data;

public class Casa {
    String precio, metros;

    public Casa(String precio, String metros) {
        this.precio = precio;
        this.metros = metros;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMetros() {
        return metros;
    }

    public void setMetros(String metros) {
        this.metros = metros;
    }
}

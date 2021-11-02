package Data;

public class Casa {
    private int precio;
    private int metros;

    public Casa(int precio, int metros) {
        this.precio = precio;
        this.metros = metros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
}

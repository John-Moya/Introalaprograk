package Library;

public class Tiquetes {
    private String sala;
    private String asiento;
    private String precio;
    private String tipo;
    public Productos losProductos;

    public Tiquetes(String sala, String asiento, String precio, String tipo) {
        this.sala = sala;
        this.asiento = asiento;
        this.precio = precio;
        this.tipo = tipo;
        this.losProductos= new Productos("","","");
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

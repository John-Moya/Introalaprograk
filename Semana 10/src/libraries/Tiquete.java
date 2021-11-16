package libraries;

public class Tiquete {

    private String Sala;
    private String Asiento;
    private int Precio;
    private String Tipo;

    public Tiquete(String sala, String asiento, int precio, String tipo) {
        Sala = sala;
        Asiento = asiento;
        Precio = precio;
        Tipo = tipo;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String sala) {
        Sala = sala;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String asiento) {
        Asiento = asiento;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}

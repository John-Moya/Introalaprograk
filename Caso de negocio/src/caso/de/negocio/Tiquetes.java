package caso.de.negocio;

public class Tiquetes {

    String Sala;
    String Asiento;
    String Precio;
    String Tipo;

    public Tiquetes(String Sala, String Asiento, String Precio, String Tipo) {
        this.Sala = Sala;
        this.Asiento = Asiento;
        this.Precio = Precio;
        this.Tipo = Tipo;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String Asiento) {
        this.Asiento = Asiento;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    

}

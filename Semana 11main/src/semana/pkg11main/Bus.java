package semana.pkg11main;

public class Bus {

    String Cantbus;
    String Litros;
    String Ruta;

    public Bus() {
    }

    public Bus(String Cantbus, String Litros, String Ruta) {
        this.Cantbus = Cantbus;
        this.Litros = Litros;
        this.Ruta = Ruta;
    }

    public String getCantbus() {
        return Cantbus;
    }

    public void setCantbus(String Cantbus) {
        this.Cantbus = Cantbus;
    }

    public String getLitros() {
        return Litros;
    }

    public void setLitros(String Litros) {
        this.Litros = Litros;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

}

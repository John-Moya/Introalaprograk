package semana.pkg11;
public class Bus {
    String Cantbus;
    String Litros;
    String Ruta;
public Chofer chofe;

    public Bus(String Cantbus, String Litros, String Ruta, Chofer chofe) {
        this.Cantbus = Cantbus;
        this.Litros = Litros;
        this.Ruta = Ruta;
        this.chofe = chofe;
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

    public Chofer getChofe() {
        return chofe;
    }

    public void setChofe(Chofer chofe) {
        this.chofe = chofe;
    }
   
}

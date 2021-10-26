package libreria;

public class Rtv {
    private String fecha;
    private String mes;
    private String Faltas;

    public Rtv(String fecha, String mes, String faltas) {
        this.fecha = fecha;
        this.mes = mes;
        Faltas = faltas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getFaltas() {
        return Faltas;
    }

    public void setFaltas(String faltas) {
        Faltas = faltas;
    }
}

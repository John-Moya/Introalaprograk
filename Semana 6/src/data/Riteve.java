package data;

public class Riteve {
    private String fecha, mes, faltas;

    public Riteve(String fecha, String mes, String faltas) {
        this.fecha = fecha;
        this.mes = mes;
        this.faltas = faltas;
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
        return faltas;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }
}

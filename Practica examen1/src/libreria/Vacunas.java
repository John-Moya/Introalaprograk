package libreria;

public class Vacunas {
    //Atributos
    String fecha;
    String cantidad;
    String falta;

    //Metodos
    public void inyectar(){System.out.println("Inyectan la vacuna");}
    public void fecha(){System.out.println("Se revisa la fecha de vacunacion");}
    public void cantidad(){System.out.println("Se revisa la cantidad de vacunas");}

    //Constructor
    public Vacunas(String fecha, String cantidad, String falta) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.falta = falta;
    }
    //getter y setter


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }
}

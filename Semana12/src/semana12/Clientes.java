package semana12;

public class Clientes {

    private String nombres;
    private String Identificacion;
    private String telefono;
    

    public Clientes(String nombres, String Identificacion, String telefono) {
        this.nombres = nombres;
        this.Identificacion = Identificacion;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

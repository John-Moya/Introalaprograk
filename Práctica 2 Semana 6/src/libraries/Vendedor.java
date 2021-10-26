package libraries;

public class Vendedor {

    String Nombre;
    String Sucursal;
    String horario;

    public Vendedor() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String sucursal) {
        Sucursal = sucursal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

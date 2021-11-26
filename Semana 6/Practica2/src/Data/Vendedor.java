package Data;

public class Vendedor {
    private String nombre;
    private String sucursal;
    private String horario;

    public Vendedor(String nombre, String sucursal, String horario) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

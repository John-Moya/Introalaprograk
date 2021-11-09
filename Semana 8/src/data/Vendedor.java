package data;

public class Vendedor {
    String nombre, horario, comision;

    public Vendedor(String nombre, String horario, String comision) {
        this.nombre = nombre;
        this.horario = horario;
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }
}

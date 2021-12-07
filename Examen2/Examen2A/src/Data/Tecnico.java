package Data;

public class Tecnico {
    private String nombre;
    private String horario;
    private int codigo;

    public Tecnico(String nombre, String horario, int codigo) {
        this.nombre = nombre;
        this.horario = horario;
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

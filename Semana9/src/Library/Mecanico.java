package Library;

public class Mecanico {
    private String especialidad;
    private String horario;
    private String codigo;

    public Mecanico(String especialidad, String horario, String codigo) {
        this.especialidad = especialidad;
        this.horario = horario;
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

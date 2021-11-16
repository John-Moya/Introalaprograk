package data;

public class Mecanico {
    private String especialidaes,horario;
    private String codigo;

    public Mecanico(String especialidaes, String horario, String codigo) {
        this.especialidaes = especialidaes;
        this.horario = horario;
        this.codigo = codigo;
    }

    public String getEspecialidaes() {
        return especialidaes;
    }

    public void setEspecialidaes(String especialidaes) {
        this.especialidaes = especialidaes;
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


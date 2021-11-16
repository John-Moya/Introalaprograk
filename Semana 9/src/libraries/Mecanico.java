package libraries;

public class Mecanico {

    private String Especialidad;
    private String Horario;
    private int Codigo;

    public Mecanico(String especialidad, String horario, int codigo) {
        Especialidad = especialidad;
        Horario = horario;
        Codigo = codigo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
}

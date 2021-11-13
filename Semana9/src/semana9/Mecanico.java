package semana9;
public class Mecanico {
    String Horario;
    String Especialidad;
    String Codigo;

    public Mecanico(String Horario, String Especialidad, String Codigo) {
        this.Horario = Horario;
        this.Especialidad = Especialidad;
        this.Codigo = Codigo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
    
    
}

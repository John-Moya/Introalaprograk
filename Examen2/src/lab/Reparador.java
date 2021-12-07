package lab;

public class Reparador {
    private String nombre;
    private String horario;
    public Celular elcelular;

    public Reparador(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
        this.elcelular = new Celular("","","");
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
}

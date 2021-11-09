package lab;

public class Mecanico {
    private String esp;
    private String horario;
    private String cod;

    public Mecanico(String esp, String horario, String cod) {
        this.esp = esp;
        this.horario = horario;
        this.cod = cod;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}

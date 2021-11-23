package libraries;

public class Paciente {

    private String nombre;
    private String cedula;
    private String horario;
    private String tel;
    public Doctor elDoctor;
    Doctor[] losDoctores;

    public Paciente(String nombre, String cedula, String horario, String tel,  Doctor[] losDoctores) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horario = horario;
        this.tel = tel;
        this.elDoctor = new Doctor("", "", "");
        this.losDoctores = losDoctores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

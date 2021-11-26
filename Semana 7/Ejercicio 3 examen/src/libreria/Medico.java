package libreria;

public class Medico {
    ////////Atributos///////
    private String nombre;
    private String especialidad;
    private String numerodemedico;


    public Medico(String nombre, String especialidad, String numerodemedico) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numerodemedico = numerodemedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumerodemedico() {
        return numerodemedico;
    }

    public void setNumerodemedico(String numerodemedico) {
        this.numerodemedico = numerodemedico;
    }
}

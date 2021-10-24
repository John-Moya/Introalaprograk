package data;

public class Paciente {
    private String nombre, apellido;
    public int numeroDePaciencia;

    public Paciente(String nombre, String apellido, int numeroDePaciencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDePaciencia = numeroDePaciencia;
    }

    //GETTERS-SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDePaciencia() {
        return numeroDePaciencia;
    }

    public void setNumeroDePaciencia(int numeroDePaciencia) {
        this.numeroDePaciencia = numeroDePaciencia;
    }

    //METODOS
    public void info(){System.out.println("Dar información médica");}
    public void instrucciones(){System.out.println("Seguir recomendaciones del doctor@");}
    public void medicamentos(){System.out.println("Tomarse medicamentos");}
}

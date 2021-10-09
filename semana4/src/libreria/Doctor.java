package libreria;

public class Doctor {
    //Atributos
    String nombre;
    String apellido;
    String diasLaborales;
    int horasDia;
    float salarioSemanal;
    //Metodos
    public void atenderPacientes() {
        System.out.println("El doctor atiende al paciente");
    }
    public void operar() {
        System.out.println("El doctor opera al paciente");
    }
    public void ordenarMedicamentos() {
        System.out.println("El doctor ordena los medicamentos");
    }
}

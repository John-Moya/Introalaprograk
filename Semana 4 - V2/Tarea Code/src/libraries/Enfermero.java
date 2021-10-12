package libraries;

public class Enfermero {
    int id_enfermero;
    String color_uniforme;
    String hospital;
    String nombre;
    public String Vacunar () {
        return  ("Vacunado");}
    public void Asistir_medico () {
        System.out.println("Asiste al médico");}
    public void Cuidar_paciente () {
        System.out.println ("¿Cómo te sientes?");}
}

package libreria;

public class Main {

    public static void main(String[] args) {
	Paciente paciente1 = new Paciente("kael",5064,"D2");
        System.out.println("Paciente de nomnbre" +paciente1.getNombre());
        System.out.println("De cedula: "+paciente1.getCedula());
        System.out.println("Tiempo de estadia: " +paciente1.getEstadia());

        System.out.println("Atendido por el doctor: ");

        Doctor doctorP1 = new Doctor("Cristian","Cirujano",7777);
        System.out.println("Doctor de nombre" +doctorP1.getNombre());
        System.out.println("Su especialidad" +doctorP1.getEspecialidad());
        System.out.println("Su codigo de docrto" +doctorP1.getNumeroMedico());


////////////////////////////////////////////////////////////

        Paciente paciente2 = new Paciente("beto",6054,"D5");
        System.out.println("Paciente de nomnbre" +paciente1.getNombre());
        System.out.println("De cedula: "+paciente1.getCedula());
        System.out.println("Tiempo de estadia: " +paciente1.getEstadia());

        System.out.println("Atendido por el doctor: ");

        Doctor doctorP2 = new Doctor("Cristian","Cirujano",7777);
        System.out.println("Doctor de nombre" +doctorP1.getNombre());
        System.out.println("Su especialidad" +doctorP1.getEspecialidad());
        System.out.println("Su codigo de doctor" +doctorP1.getNumeroMedico());
    }

}

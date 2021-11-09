package libraries;

public class Main {

    public static void main(String[] args) {

        // Clases Pacientes

        Pacientes paciente1 = new Pacientes("Luis Fernández", 112658907, "L-V de 10 a 5");
        paciente1.doctor1.setNombre("Dr. Pablo Murillo");
        paciente1.doctor1.setEspecialidad("Cardiologo");
        paciente1.doctor1.setNumeroMedico(2345);

        Pacientes paciente2 = new Pacientes("María Guerra", 115679800, "K-J de 2 a 9");
        paciente2.doctor2.setNombre("Dr. Mario Rojas");
        paciente2.doctor2.setEspecialidad("Dermatologo");
        paciente2.doctor2.setNumeroMedico(5678);

        // Impresión de ambos pacientes

        System.out.println("Los datos del primer paciente son:\n");
        System.out.println("Nombre: " + paciente1.getNombre());
        System.out.println("Cédula: " + paciente1.getCedula());
        System.out.println("Estadía: " + paciente1.getEstadia() + "\n");

        System.out.println("Y lo atendió el siguiente doctor:\n");
        System.out.println("Nombre: " + paciente1.doctor1.getNombre());
        System.out.println("Especialidad: " + paciente1.doctor1.getEspecialidad());
        System.out.println("Número de médico: " + paciente1.doctor1.getNumeroMedico() + "\n");

        System.out.println("Los datos del segundo paciente son:\n");
        System.out.println("Nombre: " + paciente2.getNombre());
        System.out.println("Cédula: " + paciente2.getCedula());
        System.out.println("Estadía: " + paciente2.getEstadia() + "\n");

        System.out.println("Y la atendió el siguiente doctor:\n");
        System.out.println("Nombre: " + paciente2.doctor2.getNombre());
        System.out.println("Especialidad: " + paciente2.doctor2.getEspecialidad());
        System.out.println("Número de médico: " + paciente2.doctor2.getNumeroMedico() + "\n");

    }
}

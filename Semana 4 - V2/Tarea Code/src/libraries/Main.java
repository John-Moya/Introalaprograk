package libraries;


public class Main {

    public static void main(String[] args) {
	// 
        Medico informacion = new Medico();
        // Instancia del médico
        informacion.nombre = "Isaac";
        informacion.id_medico = 1;
        informacion.especialidad = "General";
        informacion.hospital = "Calderon";
        System.out.println(informacion);
        String InfoMedico = "\nNombre: "+informacion.nombre+"\nID: "+informacion.id_medico+"\nEspecialidad: "+informacion.especialidad+"\nHospital: "+informacion.hospital;
        System.out.println(InfoMedico);
        informacion.Curar_enfermedades();
        informacion.Operar();
        informacion.Suturar();

        Paciente detalles = new Paciente();
        // Instancia del paciente
        detalles.edad = 18;
        detalles.genero = "Masculino";
        detalles.id_paciente = 117890100;
        detalles.nombre = "Juan";
        String detallespaciente = "\nNombre: "+detalles.nombre+"\nEdad: "+detalles.edad+"\nID: "+ detalles.id_paciente+"\nGenero: "+detalles.genero;
        System.out.println(detalles);
        System.out.println(detallespaciente);
        System.out.println(detalles.Enfermar());
        detalles.Ir_Hospital();
        detalles.Ser_atendido();


        Enfermero propediades = new Enfermero();
        propediades.id_enfermero = 1;
        propediades.color_uniforme = "Rojo";
        propediades.hospital = "Calderon";
        propediades.nombre = "Alicia";
        String detallesenfermero = "\nNombre: "+propediades.nombre+"\nColor de Uniforme: "+propediades.color_uniforme+"\nID: "+ propediades.id_enfermero+"\nGenero: "+ propediades.hospital;
        System.out.println(propediades);
        System.out.println(propediades.Vacunar());
        propediades.Asistir_medico();
        propediades.Cuidar_paciente();

    }
}

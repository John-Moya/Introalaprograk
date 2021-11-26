package libreria;

public class Main {

    public static void main(String[] args) {

        Pacientes paciente1= new Pacientes("Tony","118680803","4 dias");
        Pacientes paciente2= new Pacientes("Jerry","168600404","20 dias");



        paciente1.doctor.setNombre("Don Ignacio");
        paciente1.doctor.setEspecialidad("Cirujano");
        paciente1.doctor.setNumerodemedico("23908723");

        paciente2.doctor.setNombre("Dona Xinia");
        paciente2.doctor.setEspecialidad("Ortodoncia");
        paciente2.doctor.setNumerodemedico("12938923");


        System.out.println("");
        System.out.println("");
        System.out.println("Pacientes Hospital Metropolitano");
        System.out.println("");
        System.out.println("");
        System.out.println("Paciente 1");
        System.out.println("");
        System.out.println("Nombre: "+ paciente1.getNombre());
        System.out.println("Cedula: "+ paciente1.getCedula());
        System.out.println("Estadia: "+ paciente1.getEstadia());
        System.out.println("Doctor que le atiende: "+ paciente1.doctor.getNombre());
        System.out.println("Especialidad: "+ paciente1.doctor.getEspecialidad());
        System.out.println("Numero de Medico: "+ paciente1.doctor.getNumerodemedico());

        System.out.println("");
        System.out.println("");
        System.out.println("Paciente 2");
        System.out.println("");
        System.out.println("Nombre: "+ paciente2.getNombre());
        System.out.println("Cedula: "+ paciente2.getCedula());
        System.out.println("Estadia: "+ paciente2.getEstadia());
        System.out.println("Doctor que le atiende: "+ paciente2.doctor.getNombre());
        System.out.println("Especialidad: "+ paciente2.doctor.getEspecialidad());
        System.out.println("Numero de Medico: "+ paciente2.doctor.getNumerodemedico());









    }
}

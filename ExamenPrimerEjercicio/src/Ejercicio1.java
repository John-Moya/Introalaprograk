public class Ejercicio1 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.nombre = "Julio";
        doctor.numero = 1432;
        doctor.especialidad = "Neurosirujano";
        
        Paciente paciente1 = new Paciente();
        paciente1.nombre = "Raul";
        paciente1.estadia = 3;
        paciente1.cedula = 123743458;
        
        Paciente paciente2 = new Paciente();
        paciente2.nombre = "Elias";
        paciente2.estadia = 6;
        paciente2.cedula = 626743858;
        
        
        
        System.out.println("El nombre es "+paciente1.nombre +", la cedula es: "+ paciente1.cedula +", el paciente estuvo: " + paciente1.estadia+ " dias");
        System.out.println("El nombre es "+paciente2.nombre +", la cedula es: "+ paciente2.cedula +", el paciente estuvo: " + paciente2.estadia+ " dias");
        System.out.println("El nombre es "+doctor.nombre +", la especialidad es: "+ doctor.especialidad +" el numero de doctor es "+ doctor.numero);
        
    }
    
    
}

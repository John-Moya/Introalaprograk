package com.sc202.parte3exam;

public class Main {
    public static void main (String [] args){
    Doctor doctor = new Doctor();
    doctor.nombre = "Kevin";
    doctor.numero = 123345;
    doctor.especialidad = "Medico particular";
    
    paciente paciente01 =  new paciente();
    paciente01.nombre = "Manuel";
            paciente01.estadia = 3;
            paciente01.cedula = 1845421;
            
     paciente paciente02 =  new paciente();
    paciente02.nombre = "Estiven";
            paciente02.estadia = 10;
            paciente02.cedula = 30321154;
    
    
            System.out.println("El doctor es" + doctor.nombre + "y su numero es" + doctor.numero + "y su especialidad es" + doctor.especialidad);
            System.out.println("Nombre del paciente es" + paciente01.nombre + "cedula" + paciente01.cedula + "y sus dias de estadia" + paciente01.estadia);
            System.out.println("Nombre del paciente es" + paciente02.nombre + "cedula" + paciente02.cedula + "y sus dias de estadia" + paciente02.estadia);
    }
}

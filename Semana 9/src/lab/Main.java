package lab;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        /*Casa[] residencial = new Casa[2];
        for (int i = 0; i< residencial.length; i++){
            residencial[i] = new Casa("","");
            residencial[i].setMetros(JOptionPane.showInputDialog(null,"Ingrese los metros de la casa"));
            residencial[i].setHabitaciones(JOptionPane.showInputDialog(null, "Ingrese las Habitaciones"));
            residencial[i].losMuebles.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Mueble"));
            residencial[i].losMuebles.setAsientos(JOptionPane.showInputDialog("Ingrese asientos"));
            residencial[i].losMuebles.setLocacion(JOptionPane.showInputDialog("Ingrese la Locacion"));
        }

        for (int i = 0; i < residencial.length; i++){
            System.out.println(residencial[i].getMetros() + " " + residencial[i].getHabitaciones() + " Los muebles son " + residencial[i].losMuebles.getTipo() + " " + residencial[i].losMuebles.getLocacion());

        }*/

        // Automoviles // Motor Puertas Pasajeros // For JOptionPane // Imprimirlo Sout
        // Automoviles -> Mecanico -> Especialidad, Horario, Codigo 4 digitos

        Automoviles[] carros = new Automoviles[2];
        for (int i = 0; i < carros.length; i++){
            carros[i] = new Automoviles("","","");
            carros[i].setMotor(JOptionPane.showInputDialog(null,"Ingrese el motor"));
            carros[i].setPuertas(JOptionPane.showInputDialog(null,"Ingrese las puertas"));
            carros[i].setPasajeros(JOptionPane.showInputDialog(null,"Ingrese la cantidad de pasajeros"));
            carros[i].elmec.setEsp(JOptionPane.showInputDialog(null, "Ingrese especialidad"));
            carros[i].elmec.setHorario(JOptionPane.showInputDialog(null, "Ingrese horario"));
            carros[i].elmec.setCod(JOptionPane.showInputDialog(null,"Ingrese codigo"));
        }
        for (int i = 0; i < carros.length; i++){
            System.out.println(carros[i].getMotor()+" "+carros[i].getPuertas()+" "+carros[i].getPasajeros()+" El mecanico: "+carros[i].elmec.getEsp()+" "+carros[i].elmec.getHorario()+" "+carros[i].elmec.getCod());
        }

        }
}

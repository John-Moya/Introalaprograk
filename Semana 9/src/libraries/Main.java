package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Accesorios[] extras = new Accesorios[3];
        extras[0].setNombre("Zacate Artificial");
        extras[1].setNombre("Marmol");
        extras[2].setNombre("Parilla");

        Mueble elMueble = new Mueble("", "", "");
        elMueble.limpio("Sillon", "Limpio");

        Casa[] residencial = new Casa[3];
        for (int i = 0; i < residencial.length; i++){

            residencial[i] = new Casa("", "");
            residencial[i].setMetros(JOptionPane.showInputDialog(null, "Ingrese los metros"));
            residencial[i].setHabitaciones(JOptionPane.showInputDialog(null, "Ingrese las habitaciones"));
            residencial[i].losMuebles.setTipo(JOptionPane.showInputDialog("Ingrese el tipo de mueble"));
            residencial[i].losMuebles.setAsientos(JOptionPane.showInputDialog("4"));
            residencial[i].losMuebles.setLocacion(JOptionPane.showInputDialog("Ingrese la locación"));

        }

        for (int i = 0; i < residencial.length; i++){
            System.out.println(residencial[i].getMetros() + " " + residencial[i].getHabitaciones() + "Los muebles son " +
                    residencial[i].losMuebles.getTipo() + " " + residencial[i].losMuebles.getLocacion());
        }

        // Automoviles // Motor Puertas Pasajeros // For JOptionPane // Imprimirlo Sout

        Automoviles[] carros = new Automoviles[3];
        for (int i = 0; i < carros.length; i++){

            carros[i] = new Automoviles("", "", "");
            carros[i].setMotor(JOptionPane.showInputDialog(null, "Ingrese el motor del automóvil"));
            carros[i].setPasajeros(JOptionPane.showInputDialog(null, "Ingrese los pasajeros del automóvil"));
            carros[i].setPuertas(JOptionPane.showInputDialog(null, "Ingrese las puertas del automóvil"));
            carros[i].elMecanico.setEspecialidad(JOptionPane.showInputDialog(null, "Ingrese la especialidad"));
            carros[i].elMecanico.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario"));
            carros[i].elMecanico.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la código")));
        }

        for (int i = 0; i < carros.length; i++){
            System.out.println(carros[i].getMotor() + " " + carros[i].getPasajeros() + " " + carros[i].getPuertas()
                + " " + carros[i].elMecanico.getEspecialidad() + " " + carros[i].elMecanico.getHorario() + " " + carros[i].elMecanico.getCodigo());
        }

        // Automoviles -> Mecánico: Especialidad, Horario, Código 4 dígitos


    }
}

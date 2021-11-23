package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Mecanico[] lsMecanicos = new Mecanico[2];
        for (int i = 0; i < lsMecanicos.length; i++){
            System.out.println();
        }

        Automovil elCarro = new Automovil("Toyota", "1996");

        Doctor[] losDoctores = new Doctor[2];
        for (int i = 0; i < losDoctores.length; i++){
            losDoctores[i].setNombre(JOptionPane.showInputDialog( null, "Ingrese el nombre del doctor"));
            losDoctores[i].setEspecialidad(JOptionPane.showInputDialog(null, "Ingrese la especialidad"));
        }
        // Bus  Cantidad Pasajeros // Ruta // Litros // Chofer // Bus // Ruta


        Bus elbus = new Bus(30, "20L");

        elbus.ruta.setUbicacion(JOptionPane.showInputDialog(null, "Ingrese la ubicación de la ruta del bus"));
        elbus.ruta.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario de la ruta del bus"));

        elbus.chofer.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del chofer"));
        elbus.chofer.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del chofer")));
        elbus.chofer.ruta.setUbicacion(JOptionPane.showInputDialog(null, "Ingrese la ubicación de la ruta del chofer"));
        elbus.chofer.ruta.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario de la ruta del chofer"));

        System.out.println("Datos del bus:");
        System.out.println("Cantidad de pasajeros: " + elbus.getCantidadPasajeros());
        System.out.println("Litros de gasolina: " + elbus.getLitros());
        System.out.println("Ubicación de la ruta: " + elbus.ruta.getUbicacion());
        System.out.println("Horario de la ruta: " + elbus.ruta.getHorario());
        System.out.println();

        System.out.println("Datos del chofer:");
        System.out.println("Nombre: " + elbus.chofer.getNombre());
        System.out.println("Edad: " + elbus.chofer.getEdad());
        System.out.println("Ubicación de la ruta: " + elbus.chofer.ruta.getUbicacion());
        System.out.println("Horario de la ruta: " + elbus.chofer.ruta.getHorario());
    }
}

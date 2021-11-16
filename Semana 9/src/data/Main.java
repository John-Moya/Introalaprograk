package data;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        Accesorios[] extras = new Accesorios[3];
        extras[0].setNombre("Zacate artificial");
        extras[1].setNombre("Sofá");
        extras[2].setNombre("Palmeras");

        Casa[] residencial = new Casa[2];
        for (int i = 0; i< residencial.length; i++){
            //Inicializar la instancia
            residencial[i] = new Casa("","", "","");
            residencial[i].setMetros(JOptionPane.showInputDialog(null,
                    "Ingrese los metros de la casa"));
            residencial[i].setHabitaciones(JOptionPane.showInputDialog(null,
                    "Ingrese las habitaciones"));
            residencial[i].losMuebles.setTipo(JOptionPane.showInputDialog(null,
                    "Ingrese el tipo del mueble"));
            residencial[i].losMuebles.setAsientos(JOptionPane.showInputDialog(null,
                    "4"));
            residencial[i].losMuebles.setLocación(JOptionPane.showInputDialog(null,
                    "Ingrese locación"));
        }
        for (int i = 0; i < residencial.length; i++){
            System.out.println(residencial[i].getMetros() + " " +
            residencial[i].getHabitaciones() + "Los muebles son" +
                    residencial[i].losMuebles.getTipo() + " " +
                    residencial[i].losMuebles.getAsientos() + " " +
                    residencial[i].losMuebles.getLocación());

            System.out.println(residencial[i].Accesorios.getlosAcccesorios());
        }


        // Automoviles // Motor Puertas Pasajeros
        // For JOptionPane // Imprimirlo Sout
        /*Automoviles[] carros = new Automoviles[2];
        for (int i = 0; i < carros.length; i++) {
            //Inicializar instancia
            carros[i] = new Automoviles("","","");
            carros[i].setMotor(JOptionPane.showInputDialog(null,
                    "Ingrese el motor " + (i+1)));
            carros[i].setPasajeros(JOptionPane.showInputDialog(null,
                    "Ingrese el número de pasajeros " + (i+1)));
            carros[i].setPuertas(JOptionPane.showInputDialog(null,
                    "Ingrese el número de puertas " + (i+1)));
            // Automoviles -> Mecanico // Especialidad, Horario // Codigo 4 digitos
            carros[i].elMecanico.setEspecialidaes(JOptionPane.showInputDialog(null,
                    "Ingrese la especialidad"));
            carros[i].elMecanico.setHorario(JOptionPane.showInputDialog(null,
                    "Ingrese horario"));
            carros[i].elMecanico.setCodigo(JOptionPane.showInputDialog(null,
                    "Ingrese código de cuatro digitos"));
        }
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].getPasajeros() + " " +
                    carros[i].getPuertas() + " " + carros[i].getMotor()
                    + "El mecanico: " + carros[i].elMecanico.getEspecialidaes()
                    + " " +carros[i].elMecanico.getHorario() + " " + carros[i].elMecanico.getCodigo());
        }*/

    }
}
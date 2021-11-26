package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Casa[] residencial = new  Casa[2];
        for (int i = 0; i<residencial.length;i++){

            residencial[i] = new  Casa("","");


            residencial[i].setMetros(JOptionPane.showInputDialog(null,"Ingrese los metros de la casa"));

            residencial[i].setHabitaciones(JOptionPane.showInputDialog(null,"Ingrese las Habitaciones de la casa"));

            residencial[i].losMueblos.setTipo(JOptionPane.showInputDialog(null,"Ingrese el tipo de muebles"));

            residencial[i].losMueblos.setAcientos(JOptionPane.showInputDialog(null,"Ingrese cantidad de asiendos"));

            residencial[i].losMueblos.setLocacion(JOptionPane.showInputDialog(null,"Ingrese locacion"));
        }
        for (int i = 0; i<residencial.length;i++){
            System.out.println(residencial[i].getMetros()+" "+residencial[i].getHabitaciones());
        }
    }
}

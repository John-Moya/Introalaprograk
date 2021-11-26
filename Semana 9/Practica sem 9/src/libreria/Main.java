package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Automoviles[] residencial = new  Automoviles[3];
        for (int i = 0; i<residencial.length;i++){

            residencial[i] = new Automoviles("","","");


            residencial[i].setMotor(JOptionPane.showInputDialog(null,"Ingrese Tipo de motor"));

            residencial[i].setPuertas(JOptionPane.showInputDialog(null,"Ingrese la cantidad de puertas"));

            residencial[i].setPasajeros(JOptionPane.showInputDialog(null,"Ingrese la cantidad maxima de pasajeros"));

        }
        for (int i = 0; i<residencial.length;i++){
            System.out.println(residencial[i].getMotor()+" "+residencial[i].getPuertas()+" "+residencial[i].getPasajeros());


        }
    }
}

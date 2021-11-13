package semana9;

import javax.swing.JOptionPane;

public class Semana9 {

    public static void main(String[] args) {
        Automoviles[] auto = new Automoviles[3];
        Mecanico[] meca = new Mecanico[1];

        for (int i = 0; i < auto.length; i++) {
            auto[i] = new Automoviles("4", "5", "1600");
            auto[i].setPuertas(JOptionPane.showInputDialog(null, "Ingrese la cantidad de puertas"));
            auto[i].setPasajeros(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pasajeros"));
            auto[i].setMotor(JOptionPane.showInputDialog(null, "Ingrese el motor del auto"));
        }
        for (int i = 0; i < auto.length; i++) {
            System.out.println("Motor:" + auto[i].getMotor() + " Puertas: " + auto[i].getPuertas() + " Pasajeros: " + auto[i].getPuertas());
        }
        for (int i = 0; i < meca.length; i++) {
            meca[i] = new Mecanico("8h diarias", "Motores", "8454");
            meca[i].setCodigo(JOptionPane.showInputDialog(null, "Ingrese el codigo de mecanico"));
            meca[i].setEspecialidad(JOptionPane.showInputDialog(null, "Ingrese la especialidad del mecanico"));
            meca[i].setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario del mecanico"));
        }
        for (int i = 0; i < meca.length; i++) {
            System.out.println("Horario:" + meca[i].getHorario() + ", Especialidad: " + meca[i].getEspecialidad() + ", Codigo: " + meca[i].getCodigo());

        }
    }

}

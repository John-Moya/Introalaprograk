package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido a Celulares S.A!");

        Dispositivos[] losDispositivos = new Dispositivos[2];

        for (int i = 0; i < losDispositivos.length; i++){
            losDispositivos[i] = new Dispositivos("", "", 0, "");
            JOptionPane.showMessageDialog(null, "Dispositivo " + (i + 1));
            losDispositivos[i].setEquipo(JOptionPane.showInputDialog(null, "Ingrese el equipo que se está reparando:"));
            losDispositivos[i].setMarca(JOptionPane.showInputDialog(null, "Ingrese la marca del dispositivo:"));
            losDispositivos[i].setModelo(JOptionPane.showInputDialog(null,"Ingrese el modelo del dispositivo:"));
            losDispositivos[i].setCosto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo de la reparación:")));
            losDispositivos[i].elReparador.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona que lo repara:"));
            losDispositivos[i].elReparador.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario de la persona:"));
        }

        for (int i = 0; i < losDispositivos.length; i++){
            JOptionPane.showMessageDialog(null, "Datos del dispositivo " + (i + 1) + "\n"
                    + "Equipo: " + losDispositivos[i].getEquipo() + "\n"
                    + "Marca: " + losDispositivos[i].getMarca() + "\n"
                    + "Modelo: " + losDispositivos[i].getModelo() + "\n"
                    + "Costo: " + losDispositivos[i].getCosto() + "₡\n"
                    + "Nombre del reparador : " + losDispositivos[i].elReparador.getNombre() + "\n"
                    + "Horario del reparador: " + losDispositivos[i].elReparador.getHorario());
        }
    }
}

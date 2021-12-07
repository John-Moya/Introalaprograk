package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de camiones"));
        Camion[] camiones = new Camion[cantidad];
        String conductor1 = "";
        String conductor2 = "";
        for (int i = 0; i < camiones.length; i++) {
            camiones[i] = new Camion(0000,0000,"",0);
            camiones[i].setNumeroUnidad(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de la unidad")));
            camiones[i].setPesoMax(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el peso máximo que soporta el camion(kg)")));
            camiones[i].setCantidadPasajeros(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de pasajeros")));
            camiones[i].setRuta(JOptionPane.showInputDialog(null,"Ingrese la ruta"));
            for (int j = 0; j < 2; j++) {
                camiones[i].conductores[j] = new Conductor("",0000,0000,"");
                camiones[i].conductores[j].setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del conductor "+(j+1)));
                camiones[i].conductores[j].setCedula(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cedula del conductor "+(j+1))));
                camiones[i].conductores[j].setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el teléfono del conductor "+(j+1))));
                camiones[i].conductores[j].setHorario(JOptionPane.showInputDialog(null,"Ingres el horario del Conductor "+(j+1)));

                if(j==0){
                    conductor1 = "\nNombre Conductor 1: "+camiones[i].conductores[j].getNombre()+"\nCedula: "+camiones[i].conductores[j].getCedula()+"\nTeléfono: "+
                            camiones[i].conductores[j].getTelefono()+"\nHorario: "+camiones[i].conductores[j].getHorario();
                }else {
                    conductor2 = "\nNombre Conductor 2: "+camiones[i].conductores[j].getNombre()+"\nCedula: "+camiones[i].conductores[j].getCedula()+"\nTeléfono: "+
                            camiones[i].conductores[j].getTelefono()+"\nHorario: "+camiones[i].conductores[j].getHorario();
                }


            }

        }

        for (int x = 0; x < camiones.length; x++) {
           JOptionPane.showMessageDialog(null,"Número de la unidad: "+camiones[x].getNumeroUnidad()+"\nPeso máximo: "+camiones[x].getPesoMax()+"kg"+
                   "\nCantidad de pasajeros: "+camiones[x].getCantidadPasajeros()+"\nRuta: "+camiones[x].getRuta()+conductor1+conductor2);

        }

    }
}

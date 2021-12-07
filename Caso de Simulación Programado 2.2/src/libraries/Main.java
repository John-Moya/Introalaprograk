package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido a Securitas S.A.");

        Camion[] losCamiones = new Camion[2];

        for (int i = 0; i < losCamiones.length; i++){
            losCamiones[i] = new Camion(0, "", 0, "");
            JOptionPane.showMessageDialog(null, "Camion " + (i + 1));
            losCamiones[i].setNumeroUnidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de unidad:")));
            losCamiones[i].setPeso(JOptionPane.showInputDialog(null, "Ingrese el peso que puede cargar:"));
            losCamiones[i].setCantidadPasajeros(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pasajeros que puede llevar:")));
            losCamiones[i].setRuta(JOptionPane.showInputDialog(null, "Ingrese la ruta del camión:"));
            losCamiones[i].elConductor.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor:"));
            losCamiones[i].elConductor.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario del conductor:"));
            losCamiones[i].elConductor.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cédula del conductor:")));
            losCamiones[i].elConductor.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número telefónico del conductor:")));
        }

        for (int i = 0; i < losCamiones.length; i++){
            JOptionPane.showMessageDialog(null, "Datos del camión " + (i + 1) + "\n"
                        + "Número de la Unidad: " + losCamiones[i].getNumeroUnidad() + "\n"
                        + "Peso que puede cargar: " + losCamiones[i].getPeso() + "\n"
                        + "Cantidad de pasajeros: " + losCamiones[i].getCantidadPasajeros() + "\n"
                        + "Ruta: " + losCamiones[i].getRuta() + "\n"
                        + "Nombre del conductor: " + losCamiones[i].elConductor.getNombre() + "\n"
                        + "Horario del conductor: " + losCamiones[i].elConductor.getHorario() + "\n"
                        + "Cédula del conductor: " + losCamiones[i].elConductor.getCedula() + "\n"
                        + "Teléfono del conductor: " + losCamiones[i].getRuta());
        }
    }
}

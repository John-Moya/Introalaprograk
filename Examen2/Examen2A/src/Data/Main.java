package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int cantidadOrdenes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de ordenes"));
        Orden[] ordenes = new Orden[cantidadOrdenes];
        for (int i = 0; i < ordenes.length; i++) {
            ordenes[i] = new Orden();
            ordenes[i].elDispositivo = new Dispositivo("",00,"",00000,"");
            ordenes[i].elTecnico = new Tecnico("","",0000);

            ordenes[i].elTecnico.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del técnico"));
            ordenes[i].elTecnico.setHorario(JOptionPane.showInputDialog(null,"Ingrese el horario del técnico"));
            ordenes[i].elTecnico.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del técnico")));

            ordenes[i].elDispositivo.setMarca(JOptionPane.showInputDialog(null,"Ingrese la marca del dispositivo"));
            ordenes[i].elDispositivo.setModelo(JOptionPane.showInputDialog(null,"Ingrese el modelo del dispositivo"));
            ordenes[i].elDispositivo.setCedulaDueno(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cedula del dueño")));
            ordenes[i].elDispositivo.setReparacion(JOptionPane.showInputDialog(null,"Ingrese el tipo de reparación"));
            ordenes[i].elDispositivo.setCostoReparacion(Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el costo de reparación")));


        }
        for (int j = 0; j < ordenes.length; j++) {
            JOptionPane.showMessageDialog(null, "Nombre del técnico: "+ordenes[j].elTecnico.getNombre()+"\nCodigo del técnico: "+ordenes[j].elTecnico.getCodigo()+
                    "\nHorario del técnico: "+ordenes[j].elTecnico.getHorario()+"\nCedula del dueño: "+ordenes[j].elDispositivo.getCedulaDueno()+"\nMarca del dispositivo: "+
                    ordenes[j].elDispositivo.getMarca()+"\nModelo: "+ordenes[j].elDispositivo.getModelo()+"\nReparación: "+ordenes[j].elDispositivo.getReparacion()+"\nCosto: "+ordenes[j].elDispositivo.getCostoReparacion());
        }

    }
}

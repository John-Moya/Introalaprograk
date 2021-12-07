package lab;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //////Reparador de Telefonos Ejercicio 1//////////

        Reparador[] elrepa = new Reparador [2];
    for (int i=0; i < elrepa.length; i++){
        elrepa[i] = new Reparador("","");
        elrepa[i].setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del reparador"));
        elrepa[i].setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario del reparador"));
        elrepa[i].elcelular.setMarca(JOptionPane.showInputDialog(null, "Ingrese la marca del celular"));
        elrepa[i].elcelular.setCosto(JOptionPane.showInputDialog(null, "Ingrese cuanto va costar reparar el celular"));
        elrepa[i].elcelular.setModelo(JOptionPane.showInputDialog(null, "Ingrese el modelo del celular"));
    }
    for (int i=0; i < elrepa.length; i++){
        System.out.println(elrepa[i].getNombre() + " " + elrepa[i].getHorario() + " " + elrepa[i].elcelular.getMarca() + " " + elrepa[i].elcelular.getCosto() + " " + elrepa[i].elcelular.getModelo());
    }
        ///////////Camiones Ejercicio 2///////////
    Camion[] losCamiones = new Camion[2];
    for (int i=0; i< losCamiones.length; i++){
        losCamiones[i] = new Camion("","","");
        losCamiones[i].setNumero(JOptionPane.showInputDialog(null, "Ingrese el numero de unidad del camion"));
        losCamiones[i].setPeso(JOptionPane.showInputDialog(null, "Ingrese el peso que puede llevar el camion"));
        losCamiones[i].setPasajeros(JOptionPane.showInputDialog(null, "Ingrese el numero de pasajeros que puede llevar el camion"));
        losCamiones[i].elcondu.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor"));
        losCamiones[i].elcondu.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario del conductor"));
        losCamiones[i].laruta.setDireccion(JOptionPane.showInputDialog(null, "Ingrese la ruta que va llevar el camion"));
    }
        for (int i=0; i< losCamiones.length; i++){
            System.out.println(losCamiones[i].getNumero()+" "+losCamiones[i].getPeso()+" "+losCamiones[i].getPasajeros()+" "+losCamiones[i].elcondu.getNombre()+" "+losCamiones[i].elcondu.getHorario()+" "+losCamiones[i].laruta.getDireccion());
        }
        //////////////////Biblioteca Ejercicio 3/////////////////////////
    Biblioteca[] labiblio = new Biblioteca[2];
    for (int i=0; i< labiblio.length; i++){
        labiblio[i] = new Biblioteca("","","","");
        labiblio[i].setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del libro"));
        labiblio[i].setPaginas(JOptionPane.showInputDialog(null, "Ingrese la cantidad de paginas"));
        labiblio[i].setTomos(JOptionPane.showInputDialog(null, "Ingrese los tomos"));
        labiblio[i].setAlmacenamiento(JOptionPane.showInputDialog(null, "Ingrese donde se almaceno este libro"));
    }
    for (int i=0; i< labiblio.length; i++){
        System.out.println(labiblio[i].getNombre()+" "+labiblio[i].getPaginas()+" "+labiblio[i].getTomos()+" "+labiblio[i].getAlmacenamiento());
    }

        }
}

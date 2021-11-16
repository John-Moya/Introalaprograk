package Library;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// venta de tiquetes de un cine, vender tiquete y vender productos de la confiteria

        Tiquetes[] usuario= new Tiquetes[2];
        System.out.println("---CINE GOLDEN---");
        JOptionPane.showMessageDialog(null, "-----BIENVENIDO A CINE GOLDEN-----");
        System.out.println("-----TIQUETES-----\n SALA VIP:\n ADULTO: 6000 colones y NIÑO: 5000 colones\n SALA ONE:\n ADULTO: 4500 colones y NIÑO: 3500 colones\n SALA 3D:\n ADULTO: 4000 colones y NIÑO: 3000 colones");
        System.out.println("---PRODUCTOS--- \n PALOMITAS: 2500 colones\n NACHOS: 3200 colones\n HOTDOG: 2000 colones");
        System.out.println();

        for (int i = 0; i < usuario.length; i++) {
            usuario[i]=new Tiquetes("","","","");
            usuario[i].setSala(JOptionPane.showInputDialog(null, "Ingrese la Sala"));
            usuario[i].setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de tiquete"));
            usuario[i].setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio del tiquete"));
            usuario[i].setAsiento(JOptionPane.showInputDialog(null, "Ingrese el numero de asiento"));
            usuario[i].losProductos.setTipo(JOptionPane.showInputDialog(null, "Acontinuacion ingrese el producto:"));
            usuario[i].losProductos.setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
            usuario[i].losProductos.setCantidad(JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto:"));
        }
        for (int i = 0; i < usuario.length; i++) {
            System.out.println("Tiquete del Usuario= "+(i+1));
            System.out.println("Sala: "+usuario[i].getSala() +", Asiento: "+ usuario[i].getAsiento()+", Precio del Tiquete :"+usuario[i].getPrecio()+" colones, Tipo de Tiquete: "+ usuario[i].getTipo());
            System.out.println("Tipo de producto: "+usuario[i].losProductos.getTipo()+", precio de producto: "+usuario[i].losProductos.getPrecio()+" colones, cantidad: "+usuario[i].losProductos.getCantidad());
            System.out.println();
        }

    }
}

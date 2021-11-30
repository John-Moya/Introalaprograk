package com.sc202.principal;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        productos[] producto = new productos[2];
        tiquete[] tiquetes = new tiquete[2];

        for (int i = 0; i < producto.length; i++) {

            producto[i] = new productos("Bebidas", "1000", "1");
            producto[i].setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de producto: "));
            producto[i].setCantidad(JOptionPane.showInputDialog(null, "Ingrese la cantidad que va a llevar: "));
            producto[i].setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio del producto: "));

        }
        for (int i = 0; i < producto.length; i++) {

            System.out.println("El producto elegido es" + producto[i].getTipo() + "la cantidad que va a llevar es " + producto[i].getCantidad() + "y el precio final es" + producto[i].getPrecio());
        }
        for (int i = 0; i < tiquetes.length; i++) {
        tiquetes[i] = new tiquete("Bebidas", "1000", "1", "50");
        tiquetes[i].setAsiento(JOptionPane.showInputDialog(null, "Ingrese el asiento: "));
        tiquetes[i].setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio del asiento: "));
        tiquetes[i].setSala(JOptionPane.showInputDialog(null, "Ingrese la sala del cine: "));
        tiquetes[i].setTipo(JOptionPane.showInputDialog(null, "Ingrese si es 2D, 3D o 5D: "));
        
     
        }
    }
}

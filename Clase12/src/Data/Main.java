package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ventas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de ventas"));
        Libreria[] santaMarta = new Libreria[ventas];
        for (int i = 0; i < santaMarta.length; i++) {
            santaMarta[i] = new Libreria();
            santaMarta[i].cliente.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente"));
            santaMarta[i].cliente.setFactura(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo de la factura")));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad  de Libros vendidos"));
            santaMarta[i].libro = new Libros[cantidad];
            for (int x = 0; x < cantidad; x++) {
                santaMarta[i].libro[x] = new Libros("",000,0000);
                santaMarta[i].libro[x].setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del Libro"));
                santaMarta[i].libro[x].setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del Libro")));
                santaMarta[i].libro[x].setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del Libro")));
                if(x==0){
                    santaMarta[i].libro[x].costos.setTipoCliente(JOptionPane.showInputDialog(null,"Ingrese el tipo de Cliente"));
                }

            }


        }
        for (int j = 0; j < santaMarta.length; j++) {
            double precioFinal=0;
            String nomLibros = "";
            for (int z = 0; z < santaMarta[j].libro.length; z++) {
                precioFinal = precioFinal+santaMarta[j].libro[z].costos.descuento(santaMarta[j].libro[z].costos.getTipoCliente(),santaMarta[j].libro[z].getPrecio());
                nomLibros = nomLibros+"\n"+santaMarta[j].libro[z].getNombre()+" "+String.valueOf(santaMarta[j].libro[z].getPrecio());

            }
            JOptionPane.showMessageDialog(null,"Nombre del cliente: "+santaMarta[j].cliente.getNombre()+
                    "\nCodigo de factura: "+santaMarta[j].cliente.getFactura()+nomLibros+"\nMonto total: "+precioFinal);


        }
    }
}

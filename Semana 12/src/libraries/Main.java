package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String Nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        int Cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cédula"));

        int CantidadLibros = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos libros diferentes" +
                " va a ordenar?"));

        Libreria[] losLibros = new Libreria[CantidadLibros];
        Cliente elCliente = new Cliente(Nombre, Cedula, losLibros);

        for (int i = 0; i < losLibros.length; i++){
            losLibros[i] = new Libreria("", 0);
            losLibros[i].setLibro(JOptionPane.showInputDialog(null, "Ingrese el título del libro"));
            losLibros[i].setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad deseada")));
            losLibros[i].elCosto.setPrecio(10000 * losLibros[i].getCantidad());
            if (losLibros[i].getCantidad() == 2){
                losLibros[i].elCosto.setDescuento(10000);
            }
            losLibros[i].elCosto.setPrecioFinal(losLibros[i].elCosto.getPrecio() - losLibros[i].elCosto.getDescuento());
        }
        

        System.out.println("Datos del ciente:");
        System.out.println("Nombre: " + elCliente.getNombre());
        System.out.println("Cédula: " + elCliente.getCedula());
        System.out.println();
        for (int i = 0; i < losLibros.length; i++){
            System.out.println("Libro " + (i + 1));
            System.out.println("Libro: " + losLibros[i].getLibro());
            System.out.println("Cantidad: " + losLibros[i].getCantidad());
            System.out.println("Precio: " + losLibros[i].elCosto.getPrecio() + "₡");
            System.out.println("Descuento: " + losLibros[i].elCosto.getDescuento() + "₡");
            System.out.println("Precio Final: " + losLibros[i].elCosto.getPrecioFinal() + "₡");
            System.out.println();
        }
    }
}

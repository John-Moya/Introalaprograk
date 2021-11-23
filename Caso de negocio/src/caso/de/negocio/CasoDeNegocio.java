package caso.de.negocio;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class CasoDeNegocio {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Vienvenido a Cinepolis");
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Productos que desea llevar: "));
        int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Tiquetes que desea llevar: "));
        Productos[] produc = new Productos[x];
        Tiquetes[] tiquet = new Tiquetes[j];

        for (int i = 0; i < produc.length; i++) {
            produc[i] = new Productos("Bebidas", "1000", "1");
            produc[i].setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de producto: "));
            produc[i].setCantidad(JOptionPane.showInputDialog(null, "Ingrese la cantidad que va a llevar: "));
            produc[i].setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio del producto: "));
            
        }
        for (int i = 0; i < produc.length; i++) {
            System.out.println("Producto:" + produc[i].getTipo()+ " Cantidad: " + produc[i].getCantidad() + " Pasajeros: " + produc[i].getPrecio());
        }
        for (int i = 0; i < tiquet.length; i++) {
            tiquet[i] = new Tiquetes("8h diarias", "Motores", "8454","hola");
            tiquet[i].setSala(JOptionPane.showInputDialog(null, "Ingrese el numero de sala: "));
            tiquet[i].setAsiento(JOptionPane.showInputDialog(null, "Ingrese el asiento deseado: "));
            tiquet[i].setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de pelicula: "));
            tiquet[i].setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio del tiquet"));
            
        }
        for (int i = 0; i < tiquet.length; i++) {
            System.out.println("Sala :" + tiquet[i].getSala()+ ", asiento: " + tiquet[i].getAsiento()+ ", tipo: " + tiquet[i].getTipo()+", precio: " + tiquet[i].getPrecio());

        }
    }

}

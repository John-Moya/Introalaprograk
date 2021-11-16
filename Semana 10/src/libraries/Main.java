package libraries;

import javax.swing.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("", 0);
        JOptionPane.showMessageDialog(null, "Bienvenido cleinte número 1!");
        cliente1.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre"));
        cliente1.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula")));
        cliente1.productos.setTipo(JOptionPane.showInputDialog(null, "¿Que producto desea?"));
        cliente1.productos.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite la cantidad")));
        if (Objects.equals(cliente1.productos.getTipo(), "Palomitas")){
            cliente1.productos.setPrecio(5000 * cliente1.productos.getCantidad());
        } else if (Objects.equals(cliente1.productos.getTipo(), "Bebida")){
            cliente1.productos.setPrecio(2500 * cliente1.productos.getCantidad());
        }else if (Objects.equals(cliente1.productos.getTipo(), "Dulce")) {
            cliente1.productos.setPrecio(1000 * cliente1.productos.getCantidad());
        }
        cliente1.tiquete.setSala("Sala 2");
        cliente1.tiquete.setAsiento(JOptionPane.showInputDialog(null, "¿Que asiento desea?"));
        cliente1.tiquete.setPrecio(3300);
        cliente1.tiquete.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo del tiquete"));

        Cliente cliente2 = new Cliente("Ricardo", 112732928);
        JOptionPane.showMessageDialog(null, "Bienvenido cleinte número 2!");
        cliente2.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre"));
        cliente2.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula")));
        cliente2.productos.setTipo(JOptionPane.showInputDialog(null, "¿Que producto desea?"));
            cliente2.productos.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite la cantidad")));
            if (Objects.equals(cliente2.productos.getTipo(), "Palomitas")){
                cliente2.productos.setPrecio(5000 * cliente2.productos.getCantidad());
            } else if (Objects.equals(cliente2.productos.getTipo(), "Bebida")){
                cliente2.productos.setPrecio(2500 * cliente2.productos.getCantidad());
            }else if (Objects.equals(cliente2.productos.getTipo(), "Dulce")) {
                cliente2.productos.setPrecio(1000 * cliente2.productos.getCantidad());
            }
        cliente2.tiquete.setSala("Sala 7");
        cliente2.tiquete.setAsiento(JOptionPane.showInputDialog(null, "¿Que asiento desea?"));
        cliente2.tiquete.setPrecio(3300);
        cliente2.tiquete.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo del tiquete"));


        JOptionPane.showMessageDialog(null, "Los datos del primer cliente son los siguientes:\n" +
                "Nombre: " + cliente1.getNombre() + "\n" +
                "Cédula: " + cliente1.getCedula() + "\n" +
                "Producto: " + cliente1.productos.getTipo() + "\n" +
                "Precio Producto: " + cliente1.productos.getPrecio() + "\n" +
                "Cantidad Producto: " + cliente1.productos.getCantidad() + "\n" +
                "Sala: " + cliente1.tiquete.getSala() + "\n" +
                "Asiento: " + cliente1.tiquete.getAsiento() + "\n" +
                "Precio Tiquete: " + cliente1.tiquete.getPrecio() + "\n" +
                "Tipo Tiquete: " + cliente1.tiquete.getTipo());

        JOptionPane.showMessageDialog(null, "Los datos del segundo cliente son los siguientes:\n" +
                "Nombre: " + cliente2.getNombre() + "\n" +
                "Cédula: " + cliente2.getCedula() + "\n" +
                "Producto: " + cliente2.productos.getTipo() + "\n" +
                "Precio Producto: " + cliente2.productos.getPrecio() + "\n" +
                "Cantidad Producto: " + cliente2.productos.getCantidad() + "\n" +
                "Sala: " + cliente2.tiquete.getSala() + "\n" +
                "Asiento: " + cliente2.tiquete.getAsiento() + "\n" +
                "Precio Tiquete: " + cliente2.tiquete.getPrecio() + "\n" +
                "Tipo Tiquete: " + cliente2.tiquete.getTipo());
    }
}

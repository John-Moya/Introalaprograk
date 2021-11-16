package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {


        // Definicón de precios

        int PrecioHamburguesa = 0;
        int PrecioBebida = 0;
        int PrecioAcompanamiento = 0;
        double Descuento = 0;

        // Menú Principal

        JOptionPane.showMessageDialog(null, "¡Bienvenido a Hamburguesas S.A!");

        String nombre = JOptionPane.showInputDialog(null, "Porfavor ingrese su nombre:");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese su cédula:"));
        Cliente cliente = new Cliente(nombre, cedula);

        Menu menu = new Menu();

        menu.setOpcion(menu.menuPrincipal());

        while (menu.getOpcion() == 1 || menu.getOpcion() == 2 || menu.getOpcion() == 3 || menu.getOpcion() == 4 ||
                menu.getOpcion() > 5) {

            // Opcion 1 (Ordenar una hamburguesa)

            if (menu.getOpcion() == 1) {

                cliente.Hamburguesa.setTamano(JOptionPane.showInputDialog("Ingrese el tamaño de su hamburguesa:"));
                cliente.Hamburguesa.ingredientes[0] = JOptionPane.showInputDialog(null, "Ingrese el tipo de pan:");
                cliente.Hamburguesa.ingredientes[1] = JOptionPane.showInputDialog(null, "Ingrese la proteina:");
                cliente.Hamburguesa.ingredientes[2] = JOptionPane.showInputDialog(null, "Ingrese los vegetales:");
                cliente.Hamburguesa.ingredientes[3] = JOptionPane.showInputDialog(null, "Ingrese la salsa:");
                cliente.Hamburguesa.ingredientes[4] = JOptionPane.showInputDialog(null, "Ingrese el tipo de queso:");
                cliente.Hamburguesa.ingredientes[5] = JOptionPane.showInputDialog(null, "Ingrese el adicional:");
                cliente.Hamburguesa.ingredientes[6] = JOptionPane.showInputDialog(null, "Ingrese el tipo de condimentos:");

                PrecioHamburguesa += 4500;

                JOptionPane.showMessageDialog(null, "¡Su hamburguesa se ha creado con éxito!");

                menu.setOpcion(menu.menuPrincipal());

            }

            // Opción 2 (Ordenar una bebida)

            if (menu.getOpcion() == 2) {

                cliente.Bebida.setTamano(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la bebida:"));
                cliente.Bebida.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de la bebida:"));
                cliente.Bebida.setBebida(JOptionPane.showInputDialog(null, "Ingrese la bebida:"));

                PrecioBebida += 1000;

                JOptionPane.showMessageDialog(null, "Se ha seleccionado la bebida con éxito");

                menu.setOpcion(menu.menuPrincipal());

            }

            // Opcion 3 (Ordenar un acompañamiento)

            if (menu.getOpcion() == 3) {

                cliente.Acompanamiento.setTamano(JOptionPane.showInputDialog(null, "Ingrese el tamaño de los acompañamientos:"));
                cliente.Acompanamiento.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de acompañaiento:"));

                PrecioAcompanamiento += 750;

                JOptionPane.showMessageDialog(null, "Se ha seleccionado el acompañamiento con éxito");

                menu.setOpcion(menu.menuPrincipal());

            }

            // Opción 4 (Consultar factura)

            if (menu.getOpcion() == 4) {

                double PrecioTotal = PrecioHamburguesa + PrecioBebida + PrecioAcompanamiento;

                if (PrecioHamburguesa != 0 && PrecioBebida != 0 && PrecioAcompanamiento != 0) {

                    Descuento = PrecioTotal * 0.15;
                }

                PrecioTotal = PrecioTotal - Descuento;

                JOptionPane.showMessageDialog(null, "Los datos de la fáctura son:\n" +
                        "Nombre: " + cliente.getNombre() + "\n" +
                        "Cedula: " + cliente.getCedula() + "\n" +
                        "Precio de la hamburguesa: " + PrecioHamburguesa + "₡\n" +
                        "Precio de la bebida: " + PrecioBebida + "₡\n" +
                        "Precio del acompañamiento: " + PrecioAcompanamiento + "₡\n" +
                        "Descuento: " + Descuento + "₡\n" +
                        "Precio total por pagar: " + PrecioTotal + "₡");


                menu.setOpcion(menu.menuPrincipal());

            }

            // Opción mayor de 5 (Opción inválida)

            if (menu.getOpcion() > 5) {

                JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente");

                menu.setOpcion(menu.menuPrincipal());

            }

            // Opción 5 (Salir)

            if (menu.getOpcion() == 5) {

                JOptionPane.showMessageDialog(null, "¡Gracias por su visita!");
            }
        }
    }
}

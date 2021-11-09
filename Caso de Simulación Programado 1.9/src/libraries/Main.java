package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Clases envios

        Envios envio1 = new Envios("San José", "Grande", "10000km", "Gerardo López");

        Envios envio2 = new Envios("Cartago", "Pequeño", "500000km", "Santiago Redondo");

        // Impresión Envios

        JOptionPane.showMessageDialog(null, "Los datos del primer envío son:\n"
                + "Destino: " + envio1.getDestino() + "\n"
                + "Tipo de paquete: " + envio1.getTipoPaquete() + "\n"
                + "Distancia en kilometros: " + envio1.getDistanciaKilometros() + "\n"
                + "Nombre del mensajero " + envio1.getNombreMensajero());

        JOptionPane.showMessageDialog(null, "Los datos del segundo envío son:\n"
                + "Destino: " + envio2.getDestino() + "\n"
                + "Tipo de paquete: " + envio2.getTipoPaquete() + "\n"
                + "Distancia en kilometros: " + envio2.getDistanciaKilometros() + "\n"
                + "Nombre del mensajero " + envio2.getNombreMensajero());
    }
}

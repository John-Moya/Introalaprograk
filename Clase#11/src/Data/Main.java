package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chofer[] losChoferes = new Chofer[2];
        for (int i = 0; i < losChoferes.length; i++) {
            losChoferes[i] = new Chofer();
            losChoferes[i].elBus = new Bus(0,0,"");
            losChoferes[i].rutaActual = new Ruta(0,"","");
            losChoferes[i].setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del chofer"));
            String partida = JOptionPane.showInputDialog(null,"Ingrese el punto de partida de la rura");
            String llegada = JOptionPane.showInputDialog(null,"Ingrese el punto de llegada de la rura");
            losChoferes[i].rutaActual.setPuntoPartida(partida);
            losChoferes[i].elBus.lRuta.setPuntoPartida(partida);
            losChoferes[i].rutaActual.setPuntoLlegada(llegada);
            losChoferes[i].elBus.lRuta.setPuntoLlegada(llegada);
            int paradas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paradas de la rura"));
            losChoferes[i].rutaActual.setCantidadParadas(paradas);
            losChoferes[i].elBus.lRuta.setCantidadParadas(paradas);
            losChoferes[i].elBus.setCantidadPasajeros(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la canidad maxima de pasajeros del bus")));
            losChoferes[i].elBus.setLitros(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de litros maximos del tanque del bus")));
            losChoferes[i].elBus.setPlaca(JOptionPane.showInputDialog(null,"Ingrese la placa del bus"));

        }
        for (int j = 0; j < losChoferes.length; j++) {
            System.out.println("Nombre del chofer: "+losChoferes[j].getNombre());
            System.out.println("Punto de partida de la ruta: "+losChoferes[j].rutaActual.getPuntoPartida());
            System.out.println("Punto de llegada de la ruta: "+losChoferes[j].rutaActual.getPuntoLlegada());
            System.out.println("Cantidad de paradas: "+losChoferes[j].rutaActual.getCantidadParadas());
            System.out.println("Cantidad maxima de pasajeros del bus: "+losChoferes[j].elBus.getCantidadPasajeros());
            System.out.println("La cantida de litros del tanque del bus: "+losChoferes[j].elBus.getLitros());
            System.out.println("La placa del bus es: "+losChoferes[j].elBus.getPlaca());
            System.out.println("");

        }
    }
}

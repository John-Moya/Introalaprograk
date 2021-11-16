package libraries;

import javax.swing.*;

public class Menu {

    private int opcion;

    public Menu() {
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int menuPrincipal(){

        return Integer.parseInt(JOptionPane.showInputDialog(null, """
                Bienvenido al restaurante Hamburguesas S.A
                Eliga una opción del siguiente menú:\s
                1: Ordenar una hamburguesa\s
                2: Ordenar una bebida\s
                3: Ordenar un acompañamiento\s
                4: Consultar la factura\s
                5: Salir\s
                Introduzca su opción:"""));
    }
}

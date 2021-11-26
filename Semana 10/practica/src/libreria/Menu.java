package libreria;

import javax.swing.*;

public class Menu {

    ////////Atributos////////
    private int opcion;

    ////////Metodos////////
    public void ejecutarmenu() {
        mostrarmenu();
    }



    private void mostrarmenu() {
        opcion = 100;

        JOptionPane.showMessageDialog(null,"***  CINE TONNEXY5  ***" );


            opcion = Integer.parseInt(JOptionPane.showInputDialog("***   Menu  ***\n\n"+"Elije una opcion...\n"
            +"1.Comprar Tiquete\n2.Comprar producto en Confiteria\n3.Lista de Clientes y sus compras\n4.Salir... "));
            while (opcion < 0 || opcion > 4) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion invalidad...\n\n1.Comprar Tiquete\n2.Comprar producto en Confiteria\n3.Lista de Clientes y sus compras\n4.Salir... "));

                switch (opcion) {
                    case 4:
                        JOptionPane.showMessageDialog(null,"+----------------------------------------------------+\n|                   Cerrando...                           |\n|                  Hasta la Pronto!                    |\n+----------------------------------------------------+");

                        break;
                    case 1:
                        // Comprar Tiquete

                        Tiquete tiquete = new Tiquete();
                        tiquete.tiquetes();
                        break;
                    case 2:
                        // Historial

                        Historial historial = new Historial("","","");

                        historial.menuHistoria();

                        break;
            }
        }
    }


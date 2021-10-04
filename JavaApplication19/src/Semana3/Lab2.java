package Semana3;

import javax.swing.JOptionPane;

public class Lab2 {

    public static void main(String args[]) {
        int opcion;
        do {
            int i = 1;
            int suma = 0;
            double dato = 0;
            int par = 0;
            int inpar = 0;
            int cal = 0;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " ----------------Menu---------------- \n Por Favor ingrese una opcion del menu \n 1.Ejercicion con While \n 2.Ejercicion con Do While \n 3.Ejercicion con For \n 4.Salir "));
            switch (opcion) {

                case 1:
                    i = 1;
                    suma = 0;
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, " Por favor ingrese el numero de veces que desea ingresar datos: "));
                    par = 0;
                    inpar = 0;
                    while (i <= dato) {

                        cal = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de los datos: "));
                        suma = suma + cal;

                        i = i + 1;

                        int cero = (cal % 2);
                        if (cero == 0) {
                            par = par + 1;
                        } else {
                            inpar = inpar + 1;
                        }
                        JOptionPane.showMessageDialog(null, " El valor de datos pares es: " + par + " mientas el valor de los datos impares es: " + inpar);
                        JOptionPane.showMessageDialog(null, " La suma de sus datos ingresados es: " + suma);
                    }

                case 2:
                    do {
                        i = 1;
                        suma = 0;
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null, " Por favor ingrese el numero de veces que desea ingresar datos: "));
                        par = 0;
                        inpar = 0;
                    } while (i <= dato);
                     {

                        cal = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de los datos: "));
                        suma = suma + cal;

                        i = i + 1;

                        int cero = (cal % 2);
                        if (cero == 0) {
                            par = par + 1;
                        } else {
                            inpar = inpar + 1;
                        }
                        JOptionPane.showMessageDialog(null, " El valor de datos pares es: " + par + " mientas el valor de los datos impares es: " + inpar);
                        JOptionPane.showMessageDialog(null, " La suma de sus datos ingresados es: " + suma);
                    }

                case 3:
                    i = 1;
                    suma = 0;
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, " Por favor ingrese el numero de veces que desea ingresar datos: "));
                    par = 0;
                    inpar = 0;
                    for (i <= dato )
                     {

                        cal = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de los datos: "));
                        suma = suma + cal;

                        int cero = (cal % 2);
                        if (cero == 0) {
                            par = par + 1;
                        } else {
                            inpar = inpar + 1;
                        }
                        JOptionPane.showMessageDialog(null, " El valor de datos pares es: " + par + " mientas el valor de los datos impares es: " + inpar);
                        JOptionPane.showMessageDialog(null, " La suma de sus datos ingresados es: " + suma);
                    }
            }

        } while (opcion == 4);

    }
}

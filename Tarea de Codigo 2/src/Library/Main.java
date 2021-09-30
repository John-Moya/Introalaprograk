package Library;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas laboradas por semana"));
        int precioHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto por hora"));
        int años = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años laborados en la empresa"));
        int salarioBruto = horas * precioHora;
        int salBono = 0, salDol = 0;
        int reba10 = 0, dolar1 = 0, reba15 = 0, dolar2 = 0;
        if (años >= 10) {
            int bono = (salarioBruto * 20) / 100;
            salBono = salarioBruto + bono;
            salDol = salBono / 619;
            JOptionPane.showMessageDialog(null, " Su Salario Bruto + bono 20% por " + años + " años laborados es: " + salBono + " colones y en dolares es: $" + salDol);
            System.out.println("salario bruto: " + salarioBruto + " mas bono 20%: " + salBono + " colones y en dolares: $" + salDol);
        } else if (salDol >= 1000) {
            int rebajo = (salBono * 10) / 100;
            reba10 = salBono - rebajo;
            dolar1 = reba10 / 619;
            JOptionPane.showMessageDialog(null, " se le aplica un rebajo del 10% su Salario Bruto final es de: " + reba10 + " colones y en dolares es: $" + dolar1);
            System.out.println("se le aplica un rebajo del 10%, su salario bruto es : " + reba10 + " colones y en dolares es: $" + dolar1);
        } else if (salDol >= 2000) {
            int rebajo2 = (salBono * 15) / 100;
            reba15 = salBono - rebajo2;
            dolar2 = reba15 / 619;
            JOptionPane.showMessageDialog(null, " se le aplica un rebajo del 15%, su Salario Bruto final es de: " + reba15 + " colones y en dolares es: $" + dolar2);
            System.out.println("se le aplica un rebajo del 15%, su salario bruto es : " + reba15 + " colones y en dolares: $" + dolar2);
        } else {
            JOptionPane.showMessageDialog(null, "Su Salario Bruto es: " + salarioBruto + " colones y en dolares es: $" + salarioBruto / 690+ " no tiene bono ni deducciones");
            System.out.println("Su Salario Bruto es: " + salarioBruto + " colones y en dolares es: $" + salarioBruto / 690+ " no tiene bono ni deducciones" );

        }
        //NO reconoce las condiciones del if en la linea 26 -> } else if (salDol >= 1000) {
        // y la linea 32 -> } else if (salDol >= 2000) {
        //puse System.out.println() para ver que estaba mal pero sale bien
    }
}

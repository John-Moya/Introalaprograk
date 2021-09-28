package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Double Salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio que se le paga por hora: "));
        int años = 0;
        años = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de años laboradada: "));
        int horas = 0;
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de horas laboradas por semana: "));
        Double SalarioBruto = horas * 4 * Salario;
        Double SalarioNeto = SalarioBruto;

        if (años >= 10) {
            SalarioNeto = (SalarioBruto + SalarioBruto / 0.20);
        } else {
            System.out.println("No hay aumento");
        }
        if (SalarioBruto > 1000) {
            SalarioNeto = (SalarioBruto + SalarioBruto * 0.10);

            if (SalarioBruto > 2000)
                SalarioNeto = (SalarioBruto + SalarioBruto * 0.15);
        }
        else {
            System.out.println("No hay deduccion");
        }
        System.out.println("El Salario Bruto es de: " + SalarioBruto + "$");
        System.out.println("El Salario Neto es de: " + SalarioNeto + "$");
        System.out.println("La cantidad de horas trabajadas es de: " + horas + "horas");
        }
    }


package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Problema Diapositiva 14

        double numero1;
        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número:"));

        double numero2;
        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número:"));

        double numero3;
        numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tercer número:"));

        double numero4;
        numero4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cuarto número:"));

        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
            JOptionPane.showMessageDialog(null, "El mayor número es: " + numero1);

        }else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            JOptionPane.showMessageDialog(null, "El mayor número es: " + numero2);

        }else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
            JOptionPane.showMessageDialog(null, "El mayor número es: " + numero3);

        }else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3) {
            JOptionPane.showMessageDialog(null, "El mayor número es: " + numero4);

        }

        // Problema Diapositiva 17

        int años;
        años = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años de antiguedad:"));

        int horas;
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas laboradas:"));

        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio pagado por hora"));

        double SalarioBruto = horas * 4 * salario;

        double SalarioNeto = SalarioBruto;

        if (años >= 10){
            SalarioNeto = SalarioBruto + SalarioBruto * 0.20;
            if (SalarioNeto > 1000 && SalarioNeto < 2000){
                SalarioNeto = SalarioNeto - SalarioNeto * 0.10;

            }else if (SalarioNeto > 2000){
                SalarioNeto = SalarioNeto - SalarioNeto * 0.15;
            }

        }

        JOptionPane.showMessageDialog(null, "El salario Neto es: "+ SalarioNeto);
    }
}

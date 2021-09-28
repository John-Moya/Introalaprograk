package Documents;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas laboradas en la semana:"));
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio por hora: "));
        double antiguedad;

        System.out.println(horas);
        System.out.println(precio);

        int salariobruto = horas * precio;
        JOptionPane.showMessageDialog(null, "El calculo de su salario con las horas laboradas y su precio es de: " + salariobruto);

        antiguedad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los años laborados: "));
        if (antiguedad >= 10) {
            double salariobruto2 = salariobruto * 1.20;
            JOptionPane.showMessageDialog(null, "Gracias por su trabajo en estos años, usted ha ganado un 20% de bono en su salario. Su salario con el bono será: " + salariobruto2);
            System.out.println(salariobruto2);
            if (salariobruto2 >= 1000) ;
            double multiplicacion = salariobruto2 * 0.1;
            double resta = salariobruto2 - multiplicacion;
            JOptionPane.showMessageDialog(null, "Se ha retirado un 10% para pago de impuestos. Su salario ahora es de: " + resta);
            if (salariobruto2 >= 2000) ;
                double multiplicar = salariobruto2 * 0.15;
                double restar = salariobruto2 - multiplicar;
                JOptionPane.showMessageDialog(null, "Se ha retirado un 15% para pago de impuestos. Su salario ahora es de: " + restar);

            }

        }

    }
    
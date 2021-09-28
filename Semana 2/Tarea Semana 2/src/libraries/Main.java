package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
//Desarrolle un ejercicio que le solicite al usuario los años de antigüedad, la cantidad de horas laboradas por semana y el precio que se le paga por hora, con estos datos debe calcular el salario bruto. Si el usuario tiene más de 10 años de trabajar para la empresa, se le dará un bono del 20% de su salario bruto, si este nuevo salario bruto es superior a $1000 debe hacerse una deducción del 10%, pero si el salario supera los $2000, esta deducción será del 15%. Muestre al usuario el salario neto final.
        String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre:");
        int semanasa = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese cuántas horas trabaja a la semana:"));
        int horapr = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese cuánto le pagan por hora:"));
        double salariobr = 0;
        salariobr = semanasa*horapr;
        int añosem = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese cuántos hace años trabaja para la empresa:"));
        if (añosem>=10){
            salariobr= salariobr+salariobr*0.20;
            if (salariobr<1000){System.out.println("Estimado "+nombre+", su salario es: $"+salariobr);}
                if (salariobr>=1000 && salariobr<2000){salariobr= salariobr-salariobr*0.10;
                System.out.println("Estimado "+nombre+", su salario es: $"+salariobr);}
                else if (salariobr>=2000){salariobr= salariobr-salariobr*0.15;
                System.out.println("Estimado "+nombre+", su salario es: $"+salariobr);}
        }
        else if (añosem<10){
            if (salariobr<1000){System.out.println("Estimado "+nombre+", su salario es: $"+salariobr);}
                if (salariobr>=1000 && salariobr<2000){salariobr= salariobr-salariobr*0.10;
                    System.out.println("Estimado "+nombre+", su salario es: $"+salariobr);}
                else if (salariobr>=2000){salariobr= salariobr-salariobr*0.15;
                    System.out.println("Estimado "+nombre+", su salario es: $"+salariobr);}
        }


    }
}

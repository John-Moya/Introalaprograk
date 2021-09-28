package libreria;

import javax.swing.JOptionPane;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {

        int años = Integer.parseInt (showInputDialog("Ingrese los años de antiguedad "));
        int labor = Integer.parseInt (showInputDialog("Ingrese cantidad de horas laboradas por semana..."));
        Double pago = Double.parseDouble(showInputDialog("Ingrese lo que se le paga(dolares) por hora..." ));


        Double salario = labor * pago;

        if (años > 10){
           Double bono = salario * 20 / 100;

           salario = salario + bono;

        }
        if (salario > 2000 ){

            Double deduc = salario * 15 /100;
            salario = salario - deduc;

        }else if (salario > 1000 ){

            Double deduc = salario * 10 /100;
            salario = salario - deduc;}

        JOptionPane.showMessageDialog(null,"Salario bruto calculado exitosamente, precione Enter para continuar....");

        JOptionPane.showMessageDialog(null,"Su Salario neto es de:  $"+ salario);





















    }




}

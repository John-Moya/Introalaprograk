import javax.swing.*;

public class Tarea2{
    public static void main(String[]args){

         /*Desarrolle un ejercicio que le solicite al usuario los años de antigüedad, 
        la cantidad de horas laboradas por semana y el precio que se le paga por hora, 
        con estos datos debe calcular el salario bruto. Si el usuario tiene más de 10 años 
        de trabajar para la empresa, se le dará un bono del 20% de su salario bruto, 
        si este nuevo salario bruto es superior a $1000 debe hacerse una deducción del 10%, 
        pero si el salario supera los $2000, esta deducción será del 15%. 
        Muestre al usuario el salario neto final.*/

        int tiempoLaboral  = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido"+"\n"+"Ingrese la cantidad de años que lleva en la empresa: "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cantidad de horas laborares: "));
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por hora: "));

        float salarioBruto = (float)(precio *horas);

        if((tiempoLaboral >= 10) && (salarioBruto < 1000)){
            float bono = (float)(salarioBruto*0.2);
            float salarioFinal = (float)(salarioBruto + bono);
            JOptionPane.showMessageDialog(null,"Salario neto:" + salarioBruto + "\n" +  "salario con bono:" + salarioFinal); 

        }else if((tiempoLaboral >= 10) && (salarioBruto >= 1000)){
            float bono = (float)(salarioBruto*0.2);
            float deduccion= (float)(salarioBruto*0.1);
            float salarioFinal = (float)(salarioBruto + bono - deduccion);
            JOptionPane.showMessageDialog(null,"Salario neto:" + salarioBruto + "\n" +  "salario con bono y deduccion:" + salarioFinal); 

        }else if((tiempoLaboral >= 10) && (salarioBruto >= 2000)){
            float bono = (float)(salarioBruto*0.2);
            float deduccion= (float)(salarioBruto*0.15);
            float salarioFinal = (float)(salarioBruto + bono - deduccion);
            JOptionPane.showMessageDialog(null,"Salario neto:" + salarioBruto + "\n" +  "salario con bono y deduccion:" + salarioFinal);

        }else if((tiempoLaboral < 10) && (salarioBruto < 1000)){
            JOptionPane.showMessageDialog(null,"Salario neto:" + salarioBruto + "\n" +  "Usted no tiene bono ni deduccion");

        }else if((tiempoLaboral < 10) && (salarioBruto <= 1000)){
            float deduccion= (float)(salarioBruto*0.1);
            float salarioFinal = (float)(salarioBruto - deduccion);
            JOptionPane.showMessageDialog(null,"Salario neto:" + salarioBruto + "\n" +  "salario con deduccion:" + salarioFinal); 

        }else if((tiempoLaboral < 10) && (salarioBruto <= 2000)){
            float deduccion= (float)(salarioBruto*0.15);
            float salarioFinal = (float)(salarioBruto - deduccion);
            JOptionPane.showMessageDialog(null,"Salario neto:" + salarioBruto + "\n" +  "salario con deduccion:" + salarioFinal);
        }

    }
}
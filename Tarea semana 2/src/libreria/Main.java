package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	/* Desarrolle un ejercicio que le solicite al usuario los años de antigüedad, la cantidad de horas laboradas por
        semana y el precio que se le paga por hora, con estos datos debe calcular el salario bruto. Si el usuario
        tiene más de 10 años de trabajar para la empresa, se le dará un bono del 20% de su salario bruto, si este
         nuevo salario bruto es superior a $1000 debe hacerse una deducción del 10%, pero si el salario supera los
         $2000, esta deducción será del 15%. Muestre al usuario el salario neto final.*/

        Integer antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años que ha trabajado para la empresa"));
        Integer semana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas laboradas por semana"));
        float pagaHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio que se le paga por hora"));
        float salarioBruto = semana*pagaHora;
        if (antiguedad>10){
            float salarioAños = salarioBruto+(salarioBruto*20/100);
            if (salarioBruto>1000 && salarioBruto<=2000) {
                float salarioNeto = salarioAños - (salarioAños * 10 / 100);
                JOptionPane.showMessageDialog(null, "Su salario neto es de: "+salarioNeto);
            }else if (salarioAños>2000){
                float salarioNeto = salarioAños - (salarioAños * 20 / 100);
                JOptionPane.showMessageDialog(null, "Su salario neto es de: "+salarioNeto);
            }else{
                JOptionPane.showMessageDialog(null, "Su salario neto es de: "+salarioAños);
            }

        }else{
            if (salarioBruto>1000 && salarioBruto<=2000) {
                float salarioNeto = salarioBruto - ( salarioBruto * 10 / 100);
                JOptionPane.showMessageDialog(null, "Su salario neto es de: "+salarioNeto);
            }else if (salarioBruto>2000){
                float salarioNeto = salarioBruto - (salarioBruto * 20 / 100);
                JOptionPane.showMessageDialog(null, "Su salario neto es de: "+salarioNeto);
            }else{
                JOptionPane.showMessageDialog(null, "Su salario neto es de: "+salarioBruto);
            }

        }

    }
}

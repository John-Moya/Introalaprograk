package semana1;

import javax.swing.JOptionPane;

public class Tarea2
{
    public static void main (String [] args)
    {
    String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
    int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su salario semanal"));

    int salarioBruto = salario * 4;

    double salarioNeto = salarioBruto * 0.934;

    double deducciones = salarioBruto - salarioNeto;


    JOptionPane.showMessageDialog(null, "Estimado trabajador "+ nombre+ " el salario de este mes se desglosa de esta manera: \n Salario bruto:  "+ salarioBruto+ "\n  Deducciones:  "+ deducciones+ "\n Salario neto:  " + salarioNeto );
}
}


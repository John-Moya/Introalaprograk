package libary;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
	String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");
    int antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cuantos años de antiguedad tiene en la empresa"));
    int horasLaborales = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su horas laborales diarias"));
    double pago = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el monto que se le paga por hora"));
    double salrioBruto = horasLaborales*pago*30;
    double bono = 0;
    double rebaja = 0;
    if(antiguedad>10){
        bono = salrioBruto*0.2;
    }
    if(salrioBruto>1000 && salrioBruto<=2000){
        rebaja = salrioBruto*0.1;
    }else if(salrioBruto>2000){
        rebaja = salrioBruto*0.15;
    }

    double salrioNeto = salrioBruto+bono-rebaja;
    JOptionPane.showMessageDialog(null,"Estimad(@) "+nombre+" a continuacion se desglosara su salario mensual"+
           "\nSalario Bruto: $"+salrioBruto+"\nBono: $"+bono+"\nRebaja: $"+rebaja+"\nSalario Neto: $"+salrioNeto);


    }
}

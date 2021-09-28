package data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        int años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antiguedad en la empresa"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas laboradas por semana"));
        int monto = Integer.parseInt(JOptionPane.showInputDialog("Monto por hora"));
        Integer salaBrutoi = horas * monto;
        Integer sala10= 0;
        if (años >= 10) {
            Integer aumento = (salaBrutoi * 20) / 100;
            sala10 = salaBrutoi + aumento;
            if (sala10 >= 1000){
                Integer dedu = (sala10 * 10) / 100;
                Integer sala1000 = sala10 - dedu;
                JOptionPane.showMessageDialog(null, "Su salario final es de: " + sala1000);
            }else if (sala10 >= 2000){
                Integer dedu= (sala10*15)/100;
                Integer sala2000= sala10-dedu;
                JOptionPane.showMessageDialog(null, "Su salario final es de: " + sala2000);
            }
        }else if (salaBrutoi >= 1000){
            Integer dedu = (salaBrutoi * 10) / 100;
            Integer sala1000 = salaBrutoi - dedu;
            JOptionPane.showMessageDialog(null, "Su salario final es de: " + sala1000);
        }else if (salaBrutoi >= 2000){
            Integer dedu= (salaBrutoi*15)/100;
            Integer sala2000= salaBrutoi-dedu;
            JOptionPane.showMessageDialog(null, "Su salario final es de: "+sala2000);
        }else{
            JOptionPane.showMessageDialog(null, "Su salario neto es de: " + salaBrutoi);
        }
    }

}


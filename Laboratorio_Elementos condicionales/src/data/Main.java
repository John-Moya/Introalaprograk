package data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        int digito = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el último dígito de su placa"));
        if (digito == 1 || digito == 2) {
            JOptionPane.showMessageDialog(null, "No puede circular los Lunes");
        } else if (digito == 3 || digito == 4) {
            JOptionPane.showMessageDialog(null, "No puede circular los Martes");
        } else if (digito == 5 || digito == 6) {
            JOptionPane.showMessageDialog(null, "No puede circular los Miercoles");
        } else if (digito == 7 || digito == 8) {
            JOptionPane.showMessageDialog(null, "No puede circular los Jueves");
        } else if (digito == 9) {
            JOptionPane.showMessageDialog(null, "No puede circular los Viernes");
        } else {
            JOptionPane.showMessageDialog(null, "Último digito de placa no identificado");
        }
        if (digito==2 || digito==4 || digito== 6 || digito==8){
            JOptionPane.showMessageDialog(null, "No puede circular los Sábados");
        }else if (digito==1 || digito==3 || digito==5 || digito==7 || digito==9){
            JOptionPane.showMessageDialog(null, "No puede circular los Domingos");
        }
    }
}


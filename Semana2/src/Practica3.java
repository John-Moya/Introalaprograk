import javax.swing.JOptionPane;

public class Practica3 {
    public static void main(String[] args)
    {
       int num;
       num = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el numero de dia"));
       if (num == 1){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Domingo\n Este dia es libre!");
       }
       if (num == 2){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Lunes\n Este dia es laboral!");
       }
       if (num == 3){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Martes\n Este dia es laboral!");
       }
       if (num == 4){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Miercoles\n Este dia es laboral!");
       }
       if (num == 5){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Jueves\n Este dia es laboral!");
       }
       if (num == 6){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Viernes\n Este dia es laboral!");
       }
       if (num == 7){
       JOptionPane.showMessageDialog(null,"El dia ingresado es Sabado\n Este dia es libre!");
       }
    }
    
}


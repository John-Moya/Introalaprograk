
import javax.swing.JOptionPane;

public class Practica2 {
    public static void main(String[] args)
    {
       int nota;
       nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese su nota"));
       if (nota > 69){
       JOptionPane.showMessageDialog(null,"Usted si aprovo");
       }
       else
       {
                JOptionPane.showMessageDialog(null,"Usted no aprovo");
       }
       
    }
    
}


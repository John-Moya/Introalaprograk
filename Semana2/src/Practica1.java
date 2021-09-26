
import javax.swing.JOptionPane;

public class Practica1 {
    public static void main(String[] args)
    {
       int edad;
       edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese su edad"));
       if (edad > 17){
       JOptionPane.showMessageDialog(null,"Usted puede votar");
       }
       else
       {
                JOptionPane.showMessageDialog(null,"Usted no puede votar");
       }
       
    }
    
}


import javax.swing.JOptionPane;


public class TrabajoExtraclase 
{
    public static void main(String[] args) 
    {
        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese los años"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese las horas lavoradas demanalmente"));
        int prehora = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de la hora trabajada"));
        
        if (antiguedad < 10)
        {
            int Salsemana = horas * prehora;
            int Salmes = Salsemana * 4;
            JOptionPane.showInternalMessageDialog(null, "El salario suyo es de: "+Salmes);
            
        }
        if (antiguedad > 10)
        {
            int Salsemana = horas * prehora;
            double Salmes = Salsemana * 4;
            Salmes = Salmes *1.20;
            if (Salmes > 1000 && Salmes < 2000)
            {
                double dedu = Salmes * 0.10; 
                double salneto = Salmes-dedu; 
                JOptionPane.showInternalMessageDialog(null, "El salario suyo es de: "+salneto);
                 
            }
            if (Salmes > 2000)
            {
                double dedu = Salmes * 0.15; 
                double salneto = Salmes-dedu;
                JOptionPane.showInternalMessageDialog(null, "El salario suyo es de: "+salneto);
                 
            }
        }
        
    }
}
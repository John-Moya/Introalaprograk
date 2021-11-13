package proyecto;

import javax.swing.JOptionPane;
import static proyecto.Descuentos.Descuento;
import static proyecto.Facturas.factura;
import static proyecto.IVAS.IVA;
import static proyecto.Menu1.MenuProduct;

public class Proyecto {
    public static void main(String[] args) {
        String nombre =  JOptionPane.showInputDialog("Por favor ingrese el nombre");
        System.out.println("Opciones a Escoger");
        System.out.println("1. Iniciar compra");
        System.out.println("2. Cierre de sistema");
        
        String lectura = JOptionPane.showInputDialog("Por favor ingrese la opcion que escoja.  ");
        int opcion = Integer.parseInt(lectura);
    
    do
        
  
        {
           lectura = JOptionPane.showInputDialog("Por favor ingrese la opcion que escoja.  ");
           opcion = Integer.parseInt(lectura);
            switch(opcion)
            {
                case 1:
                    MenuProduct();
                    Descuento();
                    IVA();
                    Factura();
                    break;
                case 2:
                    System.out.println("¡Gracias!");
                    break;
            }
        } while (opcion != 3);
}

static int demeNumero(String texto, int inferior, int superior)
    {
        int numero;
        boolean continuar = true;

        do
        {
            String lectura = JOptionPane.showInputDialog(texto);
            numero = Integer.parseInt(lectura);

            if (numero >= inferior && numero <= superior)
            {
                continuar = false;
            }
            else
            {
                JOptionPane.showMessageDialog
                    (null, "El número debe ser mayor o igual a " + inferior + " y menor o igual a " + superior);
            }

        } while (continuar == true);

        return numero;
    }

    


}

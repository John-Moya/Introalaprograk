/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

public class Factura {
Producto pro = new Producto();
private int numero;
private Producto[] productos;

 public  Producto CrearProducto(String nombre, int precioUnitario, float descuento, int cantidad)
{
Producto producto = new Producto();
producto.nombre = nombre;
producto.cantidad = cantidad;
producto.precioU = precioUnitario;
// El resto de propiedades
return producto;
}

 public void AgregarProducto(Producto producto)
{
for(int i = 0; i < numero; i++)
{
if (productos[i] == null)
{
productos[i] = producto;
}
}
}

 public float getTotal()
{
float total = 0;
for(int i = 0; i < numero; i++)
{
total += productos[i].getMontoTotal();
}
}
}
 
    
    
    
    
    
    
    
    
    /*
    public static int factura() {
        Producto Pro = new Producto();

        JOptionPane.showMessageDialog(null, "La factura de sus productos es la siguiente");
        JOptionPane.showMessageDialog(null, Pro.productoCom);
        JOptionPane.showMessageDialog(null, "Monto del Total sin descuento: " + Pro.totalsin);
        JOptionPane.showMessageDialog(null, "Monto del descuento: " + Pro.Vdes);
        JOptionPane.showMessageDialog(null, "Monto del IVA: " + Pro.VaIVA);
        JOptionPane.showMessageDialog(null, "El monto total de la factura es: " + Pro.IVAAp);

        return 0;*/

    }

}

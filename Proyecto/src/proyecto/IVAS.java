
package proyecto;

public class IVAS{
    public static int IVA(){
    Producto Pro = new Producto();
    Pro.VaIVA = Pro.total * 0.13;
    Pro.IVAAp = Pro.total * 1.13;
        return 0;
    }
}

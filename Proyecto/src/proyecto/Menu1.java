package proyecto;
import javax.swing.JOptionPane;
import static proyecto.Proyecto.demeNumero;

class Menu1 {

    public static int MenuProduct() {
        System.out.println("------||------MENU------||------");
        System.out.println("1. Martillo.............. ₡ 5000");
        System.out.println("2. Serrucho.............. ₡ 6000");
        System.out.println("3. Alicate............... ₡ 3000");
        System.out.println("4. Chindagua............. ₡ 45000");
        System.out.println("5. Soldadora............. ₡ 30000");
        System.out.println("6. 1K de clavos.......... ₡ 3000");
        System.out.println("7. Caja de herramientas.. ₡ 15000");
        System.out.println("8. Botas................. ₡ 6000");
        System.out.println("9. Fin de la compra.");

        
        Producto Pro   = new Producto();
        int opcion;
        int preciofin;
        do {
            opcion = demeNumero("Digite una opción del menú", 1, 9);
            
                        switch (opcion) {
                            
                            case 1:
                                Pro.nombre = "Martillo"; 
                                Pro.precioU = 5000;
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;
                                
                                
                            case 2:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 6000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;

                             case 3:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 3000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;

                             case 4:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 45000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;

                             case 5:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 30000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;
                        
                            case 6:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 3000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;

                            case 7:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 15000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;

                            case 8:
                                Pro.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad necesaria: "));
                                Pro.precioU = 6000;
                                preciofin = Pro.precioU * Pro.cantidad;
                                Pro.total = Pro.total + preciofin;
                                break;

                    default:
                        

                        break;
                }
            } while (opcion != 9);
    return Pro.total;
    }
}
                                
                       
    

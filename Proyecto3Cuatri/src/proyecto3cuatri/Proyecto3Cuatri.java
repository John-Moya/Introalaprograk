package proyecto3cuatri;

import javax.swing.JOptionPane;

public class Proyecto3Cuatri{
     public static void main(String[] args) throws Exception {

        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido a Ferreteria Martilloloco ");

        //Obtiene algunos datos
        
        String numeroFactura =  JOptionPane.showInputDialog("Por favor ingrese el numero de la factura");

        String fecha =  JOptionPane.showInputDialog("Por favor ingrese la fecha de compra");

        String nombre =  JOptionPane.showInputDialog("Por favor ingrese se nombre completo");

        String telefono =  JOptionPane.showInputDialog("Por favor ingrese su telefono");

        Factura nuevaFactura = new Factura(Integer.parseInt(numeroFactura), fecha);

        Producto[] productos = nuevaFactura.obtenerProductos();
        
        //Aca obtiene el inventario para que salga despues de que se digita el codigo y la cantidad
        String impresionProductos = "";
        for (int i = 0; i < productos.length; i++){
            impresionProductos += "Codigo " + String.valueOf(productos[i].obtenerId()) +" - "+  productos[i].obtenerDescripcion() +" ->"+ String.valueOf(productos[i].obtenerPrecioNeto()) + "\n";
        }

        //Pide la cantidad de lineas que va a tener la factura para hacr un ciclo
        String cantidadProductos =  JOptionPane.showInputDialog("Tipos de productos que desea ");

        int intCantidad = Integer.parseInt(cantidadProductos);

        //Si la cantidad es 0 sale del sistema
        if (intCantidad <= 0){
            JOptionPane.showMessageDialog(null, "No se agrega cantidad, hasta luego !");
            System.exit(0);
        }
        else {

            //Inicializa el arreglo de lineas de la factura
            nuevaFactura.cantidadProductosDeFactura(intCantidad);

            //Cantidad de productos agregados
            int agregados = 0;


            //Se agrega detalles hasta que los agregados alcancen la misma cantidad que se digito anteriormente
            while (agregados < intCantidad){

                JOptionPane.showMessageDialog(null, impresionProductos); 

                String idProducto =  JOptionPane.showInputDialog("Codigo del producto");
                
                //Valida que no sea vacio
                if (idProducto != ""){

                    String cantidad =  JOptionPane.showInputDialog("Cantidad del producto");

                    if (cantidad != ""){

                        int intIdProducto = Integer.parseInt(idProducto);
                        double dblCantidad = Double.parseDouble(cantidad);

                        //Obtiene el producto
                        Producto producto = nuevaFactura.obtenerProducto(intIdProducto);

                        //Saca su precio neto y lo multiplica por la cantidad
                        double totalDetalle = dblCantidad * producto.obtenerPrecioNeto();

                        //Guarda la linea de detalle en la factura
                        DetalleFactura detalle = new DetalleFactura(intIdProducto, dblCantidad, totalDetalle);

                        nuevaFactura.agregarDetalle(detalle);

                        agregados++;
                    }

                }

            }

            //Detalle de mensaje final
            String detalleFactura = "Fecha " + fecha + "\n" + "numero de factura " + numeroFactura + "\n" + "Nombre cliente " + nombre + "\n" + "Telefono " + telefono + "\n";

            DetalleFactura[] detalle = nuevaFactura.obtenerDetalle();

            //Ciclo que recorre cada linea de la factura
            for (int i = 0; i < detalle.length; i++){

                String descripcion = nuevaFactura.obtenerProducto(detalle[i].obtenerIdProducto()).obtenerDescripcion();

                detalleFactura += "Codigo " + String.valueOf(i+1) + descripcion + " - ₡" + String.valueOf(detalle[i].obtenerTotalDetalle()) + "\n";
            }

            //Extrae el total de la factura
            detalleFactura += "Total a pagar con el IVA aplicado: ₡" + String.valueOf(nuevaFactura.totalFactura());

            JOptionPane.showMessageDialog(null, detalleFactura); 

            //Mensaje fina;
            JOptionPane.showMessageDialog(null, "Gracias por su visita " + nombre + " !!!");

            System.exit(0);

        }

        
    }
}


    

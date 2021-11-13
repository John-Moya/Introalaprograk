
package proyecto3cuatri;

public class DetalleFactura {   
    private int idProducto;
    private double cantidad;
    private double totalDetalle;

    public DetalleFactura(int idProducto, double cantidad, double totalDetalle){
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.totalDetalle = totalDetalle;
    }

    public int obtenerIdProducto(){
        return this.idProducto;
    }
    public double obtenerCantidad(){
        return this.cantidad;
    }
    public double obtenerTotalDetalle(){
        return this.totalDetalle;
    }

    
}

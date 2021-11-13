package proyecto3cuatri;

public class Factura {

    private int numeroFactura;
    private String fecha;
    private DetalleFactura[] detalle;
    private Producto[] productos;
    private int indice;

    public Factura(int numeroFactura, String fecha) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.indice = 0;
        this.cargarProductos();
    }

    //Carga inicial de productos o inventario
    private void cargarProductos() {
        this.productos = new Producto[10];
        this.productos[0] = new Producto(1, "Martillo -", 3000,3390, 13);
        this.productos[1] = new Producto(2, "Serrucho -", 4000, 4520, 13);
        this.productos[2] = new Producto(3, "Alicate -", 3000, 3390, 13);
        this.productos[3] = new Producto(4, "Chindagua -", 50000, 56500, 13);
        this.productos[4] = new Producto(5, "Soldadora -", 80000, 90400, 13);
        this.productos[5] = new Producto(6, "1K de clavos -", 1000, 1130, 13);
        this.productos[6] = new Producto(7, "Caja de herramientas -", 15000, 16950, 13);
        this.productos[7] = new Producto(8, "Botas -", 3000, 3390, 13);
        this.productos[8] = new Producto(9, "Lata de techo -", 8000, 9040, 13);
        this.productos[9] = new Producto(10, "Apagador -", 500, 565, 13);
    }

    //Obtiene todos los detalles de la factura
    public DetalleFactura[] obtenerDetalle() {
        return this.detalle;
    }

    //Obtiene el inventario
    public Producto[] obtenerProductos() {
        return this.productos;
    }

    //Obtiene un producto por su codigo
    public Producto obtenerProducto(int idProducto) {

        Producto producto = new Producto();

        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i].obtenerId() == idProducto) {
                producto = this.productos[i];
            }
        }

        return producto;
    }

    //Establece la cantidad de productos que se van a comprar en la factura
    public void cantidadProductosDeFactura(int cantidad) {
        this.detalle = new DetalleFactura[cantidad];
    }

    //Crea una linea de detalle de la factura
    public DetalleFactura crearDetalle(int idProducto, double cantidad) {

        Producto producto = this.obtenerProducto(idProducto);
        double totalDetalle = cantidad * producto.obtenerPrecioNeto();

        DetalleFactura detalle = new DetalleFactura(idProducto, cantidad, totalDetalle);

        return detalle;
    }

    //Agrega un detalle a la factura
    public void agregarDetalle(DetalleFactura detalle) {
        this.detalle[indice] = detalle;
        this.indice++;
    }

    //Hace la sumatoria del monto del detalle de la factura para saber el total de la factura
    public double totalFactura() {
        double total = 0;
        for (int i = 0; i < this.detalle.length; i++) {
            if (this.detalle[i] != null) {
                total = total + this.detalle[i].obtenerTotalDetalle();
            }

        }
        return total;
    }

}



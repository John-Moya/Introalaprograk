package libreria;

public class Venta {
    //Venta de medios de transporte
    String producto;
    int cantidadProducto;
    int ventasSemanales;
    String horario;
    String localizacion;

    public Venta(String producto, int cantidadProducto, int ventasSemanales, String horario, String localizacion) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.ventasSemanales = ventasSemanales;
        this.horario = horario;
        this.localizacion = localizacion;
    }
    public Venta(String producto, int cantidadProducto, int ventasSemanales){
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.ventasSemanales = ventasSemanales;
    }
}

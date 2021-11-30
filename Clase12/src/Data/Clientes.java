package Data;

public class Clientes {
    private String nombre;
    private int factura;

    public Clientes(String nombre, int cedula) {
        this.nombre = nombre;
        this.factura = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }
}

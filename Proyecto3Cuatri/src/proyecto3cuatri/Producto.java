package proyecto3cuatri;

    public class Producto {

    private int id;
    private String descripcion;
    private double precioBruto;
    private double precioNeto;
    private double iva;

    //Se puede crear un constructor vacio
    public Producto(){

    }

    //Y tambien se puede crear un constructor que setee los datos de la clase
    public Producto(int id, String descripcion, double precioBruto,double precioNeto, double iva){
        this.id = id;
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
        this.precioNeto = precioNeto;
        this.iva = iva;
    }


    // Metodos publicos para accesar variables
    public int obtenerId(){
        return this.id;
    }
    public String obtenerDescripcion(){
        return this.descripcion;
    }
    public double obtenerPrecioBruto(){
        return this.precioBruto;
    }
    public double obtenerPrecioNeto(){
        return this.precioNeto;
    }
    public double obtenerIva(){
        return this.iva;
    }

}
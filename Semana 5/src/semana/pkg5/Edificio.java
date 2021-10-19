package semana.pkg5;
public class Edificio {

    String tamano;
    String metros;
    String oficinas;
    
    
            
    public Permisos permisos;

    public void funcionaEdificio() {
        System.out.println("El edificio esta fincionando");
    }

    public void tienepermiso() {
        System.out.println("El edificio tiene permisos");
    }

    public double calcularmetros(double ancho, double longitud) {
        double resultado = ancho * longitud;
        return resultado;
    }
    
    public int persona(int pisos, int sillas, int salones){
    return pisos*sillas*salones;
    }
    
    public int cantmitad(int cantidad){
        return cantidad/2;
    }
    

}

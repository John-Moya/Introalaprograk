package libreria;

public class Edificio {
    String tamaño;
    String metros;
    String oficinas;
    public Permisos permisos;

    public void funcionaEdificio(){ System.out.println("El edificio esta funcionando");}

    public void tienePermisos(){ System.out.println("El edificio tiene permisos");}


    public double calculametros(double anchura, double longitud){
        double resultado = anchura*longitud;
        return resultado;
    }
}

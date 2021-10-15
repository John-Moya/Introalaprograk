package libreria;

public class Edificio {
    String tamano;
    String metros;
    String oficinas;

    public void funcionaEdificio(){
        System.out.println("El edificio esta funcionando");}

    public void tienePermisos(){
        System.out.println("El edificio tiene permisos");}

    public double calculametros(double anchura, double longitud){
        double resultado = anchura*longitud;
        return resultado;
    }
    public int personas(int pisos, int sillas, int salones){
        // Inferir el retorno
        return pisos*sillas*salones;
    }
    public int capacidadDeAforo(int capacidad, int mitad){
        return capacidad/mitad;
    }

}

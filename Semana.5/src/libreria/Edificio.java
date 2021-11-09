package libreria;

public class Edificio {
    String tamano;
    String metros;
    String oficinas;

    public Permisos permisos;
    public Acera acera;

    public void funcionaEdificio(){
        System.out.println("El edificio esta funcionando");
    }
    public void tienePermisos(){
        System.out.println("El edificio tiene permisos");
    }

    public double calculametros(double anchura, double longitud){
        double resultado = anchura+longitud;
        return resultado;

    }

    public int personas(int pisos, int sillas, int salones){
        return pisos*sillas*salones;
    }

    public int capacidadDeAforo(int capacidad){
        return capacidad/2;
    }
}

package libraries;

public class Edificio {

    String tamano;
    String metros;
    String oficinas;


    public void funcionaEdificio(){
        System.out.println("El edificio está funcionando");
    }

    public void tienePermisos(){
        System.out.println("El edificio tiene permisos");
    }

    public double calculametros(double anchura, double longitud){
        double resultado = anchura * longitud;
        return resultado;

    }

    public int personas(int pisos, int sillas, int salones){
        return pisos * sillas * salones;
    }

    // Metodos // Tipodos calculametros // No Tipodos funcionaEdificio tienePermisos

    public int capacidadAforo(int capacidad){
        return capacidad / 2;
    }


}

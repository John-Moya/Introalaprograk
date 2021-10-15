package Library;

public class Edificio {
    String tamano;
    String metros;
    String oficinas;
    //public Permisos permisos; //jalar el metodo

    public void  funcionaEdificio() {
        System.out.println("El edificio esta funcionando");
    }

    public void tienePermisos() {
        System.out.println("El edificio tiene permisos");
    }

    public double calculametros(double anchura, double longitud){
        double resultado= anchura*longitud;
        return resultado;
    }

    public int personas(int pisos, int sillas, int salones){
        //inferir el retorno porq es int
        return pisos*sillas*salones;
    }

    public int aforo(int capacidad){
        return capacidad/2;
    }


}

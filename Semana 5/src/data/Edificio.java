package data;

public class Edificio {
    String tamaño, metros, oficionas;


    //
    public Permisos permisos;

    public void funcionaEdificio(){
        System.out.println("El edificio esta funcionando");
    }

    public void tienePermisos(){
        System.out.println("El edificio tiene permisos");
    }

    public double calculaMetros(double anchura, double longitud){
        double resultado= anchura*longitud;
        return resultado;
    }

    public int perosnas (int pisos, int sillas, int salones){
        //Inferir el retodno
        return pisos*sillas*salones;
    }

    public int capacidadDeAforo(int capacidad){
        return capacidad / 2;
    }
}

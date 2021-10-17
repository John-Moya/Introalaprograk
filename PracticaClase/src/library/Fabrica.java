package library;

public class Fabrica {
    String producto;
    int volumen;
    String horario;
    public Fabrica(String producto, int volumen, String horario) {
        this.producto = producto;
        this.volumen = volumen;
        this.horario = horario;
    }
    public Fabrica(){
    }
    public Fabrica(String producto, int volumen){
        this.producto = producto;
        this.volumen =  volumen;
    }

}

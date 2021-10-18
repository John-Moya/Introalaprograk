package data;

public class Fabrica {
    String producto;
    int volumen;
    String horario;
    public Fabrica(String producto, int volumen, String horario) {
        this.producto = producto;
        this.volumen = volumen;
        this.horario = horario;
    }

    public Fabrica(String producto, int volumen){
        this.producto = producto;
        this.volumen =  volumen;
    }
    //Constructor Inicializa Variables = Inicializar Atributos Instancia de La Clase

}

package libreria;

public class Tablet {

    private String pantalla;
    private String Camara;
    private String procesador;


    //METODOS


    public  void presionaBotonEncendido(){System.out.println("El telefono se enciende");}

    public void precionaBotonDeVolumen(){System.out.println("El volumen del telefono aumenta");}

    public  void  conectaElCelular(){System.out.println("El telefono empieza a Cargarse");}

    /////////////////////////////////////////////////////////////////////////////////////////

    public Tablet(String pantalla, String camara, String procesador) {
        this.pantalla = pantalla;
        Camara = camara;
        this.procesador = procesador;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getCamara() {
        return Camara;
    }

    public void setCamara(String camara) {
        Camara = camara;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}

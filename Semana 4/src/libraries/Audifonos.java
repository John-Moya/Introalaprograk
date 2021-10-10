package libraries;

public class Audifonos {

    String conectividad;
    String tipo;

    public void reproducirCanción(){
        System.out.println("Se ha reproducido la canción");
    }

    public void ajustarVolumen(){
        System.out.println("Se ha ajustado el volumen");
    }

    public void pararCanción(){
        System.out.println("La canción paró su reproducción");
    }
}

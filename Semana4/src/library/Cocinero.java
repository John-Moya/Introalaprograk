package library;

public class Cocinero {
    String nombre;
    int experenciaAnos;
    String especialidad;
    int edad;

    public void cortar(String ingrediente) {
        System.out.println("El cocinero corto "+ingrediente);

    }
    public void picar(String ingrediente){
        System.out.println("El cocinero pico "+ingrediente);
    }
    public void cocinar(){
        System.out.println("El cocinero cocino la comida");
    }
    public void servirPlato(){
        System.out.println("El cocinero sirvió los platos");
    }
}

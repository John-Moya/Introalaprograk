package library;

public class Celular {
    String marca;
    String modelo;
    String color;

    public void encender(){
        System.out.println("Celular encendido");
    }
    public void llamar(String nombre){
        System.out.println("Llamando a "+nombre);
    }
    public void apagar(){
        System.out.println("Celular apagado");
    }
}

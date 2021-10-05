package library;

public class Computadora {
    String marca;
    String procesador;
    String memoriaRam;
    String tipoDisco;

    public void encender(){
        System.out.println("La maquina encendio");
    }
    public void buscar(String atributo){
        System.out.println(atributo);
    }
    public  void apagar(){
        System.out.println("La maquina se apago");
    }
}

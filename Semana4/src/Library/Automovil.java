package Library;

public class Automovil {
    //Atributos: Color, Marca, Motor, Modelo, Año, cilindrada
    String color;
    String marca;
    String motor;
    String modelo;
    int año;
    double cilindrada;

    //Atributos: lo mas aproximado a la vida real
    //Metodos: que sean una accion

    //Toyota 1983
    //Volkswagen 1987

    //Acciones: Sonar Pito, Encender y Acelerar Metodos
    //cuando el Metodo SI va retornar algo se pone lo q retorna =String, int, double
    // pero cuando NO va retornar nada se poner =Void
    //Parametro: cualquier entrada que reciba un metodo

    public void sonarPito(){             //public void es un metodo
        System.out.printf("Honk");
    }

    public String sonarPitoConRetorno(){
        return "Honk"; //sirve cuando se necesita q la accion devuelva un valor y se guarde en una lista []en Main, ej Si o No
    }

    public void encender(){
        System.out.println("Encendio y esta en minimo");
    }

    public void acelerar(){
        System.out.println("El automovil acelera");
    }
}

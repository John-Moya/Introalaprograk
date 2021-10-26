package libreria;

public class Automoviles {

    //Atributos

    private String motor;
    private int ano;
    private String pasajeros;
    private String precio;

    //metodos


    public Automoviles(String motor, int ano, String pasajeros, String precio) {
        this.motor = motor;
        this.ano = ano;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public void print(){
        System.out.println("El auto dispone de un motor con: "+motor + "\n"+ "Es del ano: "+ano+"\n"
        +"Tiene espacio para: " + pasajeros+"\n"+"Precio: " +precio);
    }
}

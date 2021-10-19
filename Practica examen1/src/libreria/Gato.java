package libreria;

public class Gato {
    //Atributos
    private String nombre;
    private String edad;
    private String comidaFav;

    //Metodos
    public void comer() {System.out.println("El gato come");}
    public void mauyar() {System.out.println("El gato mauya");}
    public void caminar() {System.out.println("El gato camina");}

    //Constructor
    public Gato(String nombre, String edad, String comidaFav) {
        this.nombre = nombre;
        this.edad = edad;
        this.comidaFav = comidaFav;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getComidaFav() {
        return comidaFav;
    }

    public void setComidaFav(String comidaFav) {
        this.comidaFav = comidaFav;
    }
}

package libreria;

public class Persona {
    //Atributos
    public static String ojos = "Cafes";
    public static String piel = "Blanca";
    public static String pelo = "Negro";
    private String nombre;
    private String edad;
    private String comidaFav;

    //Metodos
    public void saludar() {System.out.println("La persona saluda");}
    public void caminar() {System.out.println("La persona camina");}
    public void hablar() {System.out.println("La persona habla");}

    //Constructor
    public Persona(String nombre, String edad, String comidaFav) {
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

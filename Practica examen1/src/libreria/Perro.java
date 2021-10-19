package libreria;

public class Perro {
    //Atributos
    public static String ojos = "Azules";
    public static String raza = "Husky";
    public static String pelo = "Blanco";
    private String nombre;
    private String edad;
    private String comidaFav;

    //Metodos
    public void ladrar() {System.out.println("El perro ladra");}
    public void caminar() {System.out.println("El perro camina");}
    public void comer() {System.out.println("El perro come");}

    //Constructor
    public Perro(String nombre, String edad, String comidaFav) {
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

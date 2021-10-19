package libreria;

public class Conejo {
    //Atributo
    private String nombre;
    private String edad;
    private String comidaFav;
    public Vacunas vacunas;

    //Metodos
    public void comer() {System.out.println("El conejo come");}
    public void camina() {System.out.println("El conejo camina");}
    public void rascar() {System.out.println("El conejo se rasca");}

    //Constructor
    public Conejo(String nombre, String edad, String comidaFav) {
        this.nombre = nombre;
        this.edad = edad;
        this.comidaFav = comidaFav;
        this.vacunas = new Vacunas("20 julio","3","Dos");
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

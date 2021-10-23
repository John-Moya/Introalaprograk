package Library;

public class Perros {
    public static String pelaje= "Corto";
    public static String tamano= "pequeno";
    private String raza;
    private String color;
    private String peso;
    public Veterinaria vete;

    public void estado(){
        System.out.println("Muy Activo");
    }

    public void actividad(){
        System.out.println("Corre en la manana");
    }

    public void descanso(){
        System.out.println("duerme mucho");
    }

    public Perros(String raza, String color, String peso) {
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.vete= new Veterinaria("Heredia", "8-5", "20");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}


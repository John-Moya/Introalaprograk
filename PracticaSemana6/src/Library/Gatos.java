package Library;

public class Gatos {
    public static String color= "blanco,negro,cafe";
    public static String promedio= "12anos";
    private String tipo;
    private String edad;
    private String tamano;

    public void alimento(){
        System.out.println("Seca");
    }
    public void corteUnas(){
        System.out.println("Mensual");
    }
    public void juega(){
        System.out.println("bastante");
    }


    public Gatos(String tipo, String edad, String tamano) {
        this.tipo = tipo;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}


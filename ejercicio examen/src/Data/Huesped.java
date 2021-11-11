package Data;

public class Huesped {
    private String nombre;
    private String edad;
    private String dias;
    public Servicios servs;

    public Huesped(String nombre, String edad, String dias) {
        this.nombre = nombre;
        this.edad = edad;
        this.dias = dias;
        this.servs = new Servicios("Sí", "No", "Sí");
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
    public String getDias(){
        return dias;
    }
    public void setDias(String dias){
        this.dias = dias;
    }
}

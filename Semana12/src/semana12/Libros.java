package semana12;

public class Libros {

    private String Nombre;
    private String anno;
    private String Genero;
    public Clientes losclientes;
    public Costo Costos;

    public Libros(String Nombre, String anno, String Genero, Clientes losclientes, Costo Costos) {
        this.Nombre = Nombre;
        this.anno = anno;
        this.Genero = Genero;
        this.losclientes = losclientes;
        this.Costos = Costos;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Clientes getLosclientes() {
        return losclientes;
    }

    public void setLosclientes(Clientes losclientes) {
        this.losclientes = losclientes;
    }

    public Costo getCostos() {
        return Costos;
    }

    public void setCostos(Costo Costos) {
        this.Costos = Costos;
    }

   

}

package lab;

public class Biblioteca {
    private String nombre;
    private String paginas;
    private String tomos;
    private String almacenamiento;

    public Biblioteca(String nombre, String paginas, String tomos, String almacenamiento) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.tomos = tomos;
        this.almacenamiento = almacenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getTomos() {
        return tomos;
    }

    public void setTomos(String tomos) {
        this.tomos = tomos;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}

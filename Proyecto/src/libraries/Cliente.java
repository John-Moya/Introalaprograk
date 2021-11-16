package libraries;

public class Cliente {

    // Atributos

    private String nombre;
    private int cedula;
    public Hamburguesa Hamburguesa;
    public Acompanamiento Acompanamiento;
    public Bebida Bebida;
    String[] ingredientes = new String[7];

    // Constructor

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Hamburguesa = new Hamburguesa("",ingredientes);
        this.Acompanamiento = new Acompanamiento("","");
        this.Bebida = new Bebida("","", "");
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}

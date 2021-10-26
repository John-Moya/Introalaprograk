package libreria;

public class Vendedor {

    //atributos
    private String nombre;
    private String sucursal;
    private String horario;

    //metodos


    public Vendedor(String nombre, String sucursal, String horario) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.horario = horario;
    }

    public void printv(){
        System.out.println("Nombre del vendedor: "+nombre + "\n"+ "Sucursal: "+sucursal+"\n"
                +"Horario: " + horario);

    }
}

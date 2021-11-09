package data;

public class Panadería {
    String nombre, horario;
    public Vendedor elVendedor;
    public Panadero elPanadero;

    public Panadería(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
        this.elVendedor = new Vendedor("Luis", "L-V, 7-5", "");
        this.elPanadero = new Panadero("Ana", "3 AM 9AM L-S", " ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

package Library;

public class Veterinaria {
    private String ubicacion;
    private String horario;
    private String capacidad;

    public void personal(){
        System.out.println("Experimentado");
    }
    public void servicios(){
        System.out.println("cirugia y rayos X");
    }
    public void habitaciones(){
        System.out.println("recuperacion");
    }


    public Veterinaria(String ubicacion, String horario, String capacidad) {
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}

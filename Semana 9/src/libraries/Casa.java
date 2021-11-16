package libraries;

public class Casa {

    private String metros;
    private String habitaciones;
    public Mueble losMuebles;
    Accesorios[] losAccesorios;

    public Casa(String metros, String habitaciones, Accesorios) {
        this.metros = metros;
        this.habitaciones = habitaciones;
        this.losMuebles = new Mueble("", "", "");
    }

    public String getMetros() {
        return metros;
    }

    public void setMetros(String metros) {
        this.metros = metros;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }
}

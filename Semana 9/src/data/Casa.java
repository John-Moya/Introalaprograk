package data;

public class Casa {
    private String habitaciones, metros;
    public Muebles losMuebles;
    Accesorios[] losAccesorios;

    public Casa(String habitaciones, String metros, String losMuebles, String losAccesorios) {
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.losMuebles = losMuebles;
        this.losAccesorios = losAccesorios;
    }

    public String getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }
    public String getMetros() {
        return metros;
    }
    public void setMetros(String metros) {
        this.metros = metros;
    }
}

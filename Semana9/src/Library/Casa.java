package Library;

public class Casa {
    private String habitaciones;
    private String metros;
    public Muebles losMuebles;
    private Accesorios[] losAccesorios;

    public Casa(String habitaciones, String metros) {
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.losMuebles= new Muebles("","","");
        this.losAccesorios = losAccesorios;

    }

    public Accesorios[] getLosAccesorios() {
        return losAccesorios;
    }

    public void setLosAccesorios(Accesorios[] losAccesorios) {
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

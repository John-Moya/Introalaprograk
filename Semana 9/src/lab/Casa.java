package lab;

public class Casa {
    private String habitaciones;
    private String metros;
    public Muebles losMuebles;

    public Casa(String habitaciones, String metros) {
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.losMuebles = new Muebles("","","");
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

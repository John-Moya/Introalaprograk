package Library;

public class Muebles {
    private String locacion; //sala,comedor,etc
    private String tipo;
    private String asientos;

    public String limpio(String nombre, String limpio){
        return limpio+nombre;
    }


    public Muebles(String locacion, String tipo, String asientos) {
        this.locacion = locacion;
        this.tipo = tipo;
        this.asientos = asientos;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    //javadoc_permite tener comentarios
    /**
     * Retorna si el mueble esta limpio o no.
     * Este metodo retorna un string para saber si el mueble esta limpio o no
     * @param  nombre nombre del mueble
     * @param  limpio estado del mueble
     * @return String estado de limpieza del mueble
     */
}

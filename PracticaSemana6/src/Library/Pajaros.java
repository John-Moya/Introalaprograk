package Library;

public class Pajaros {
    private String clase;
    private String plumaje;
    private String pico;

    public void canta(){
        System.out.println("Mucho");
    }
    public void despluma(){
        System.out.println("una vez al dia");
    }
    public void movimientoAlas(){
        System.out.println("movimiento constante");
    }


    public Pajaros(String clase, String plumaje, String pico) {
        this.clase = clase;
        this.plumaje = plumaje;
        this.pico = pico;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }
}

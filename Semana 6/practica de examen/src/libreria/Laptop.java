package libreria;

public class Laptop {
    private String pantalla;
    private String ram;
    private String procesador;

    public Teclado keyboard;

    //METODOS


    public  void tocaBotonEncender(){System.out.println("La laptop enciende");}

    public void cierralaLaptop(){System.out.println("La laptop entra en modo hibernacion");}

    public  void  conectaDispositivo(){System.out.println("la compu hace procesos para reconocerlo");}

    /////////////////////////////////////////////////////////////////////////////////////////

    public Laptop(String pantalla, String ram, String procesador) {
        this.pantalla = pantalla;
        this.ram = ram;
        this.procesador = procesador;
        this.keyboard = new Teclado("Mecanico","Plasticio","Alambrica");
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}

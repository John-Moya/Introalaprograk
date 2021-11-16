package libraries;

public class Hamburguesa {

    // Atributos

    String tamano;
    String[] ingredientes = new String[7];

    //Constructor


    public Hamburguesa(String tamano, String[] ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
    }

    // Getters y setters


    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}




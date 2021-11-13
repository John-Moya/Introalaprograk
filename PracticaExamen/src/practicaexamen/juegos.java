package practicaexamen;

public class juegos {

    String tipo;
    int precio;
    String consola;

    public void Ejecuta() {
        System.out.println("El juego inicia");
    }

    public void Guarda() {
        System.out.println("El juego guarda su avance");
    }

    public void Cierra() {
        System.out.println("El juego se cierra");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
    
}

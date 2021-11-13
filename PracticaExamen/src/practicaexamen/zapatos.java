
package practicaexamen;

public class zapatos {
    String marca;
    int calsado;
    String color;

    public void prueba() {
        System.out.println("Cliente se prueba el zapato");
    }
    public void cambio() {
        System.out.println("Cliente se prueba cambia el zapato");
    }
    public void otro() {
        System.out.println("El Cliente pide otro");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalsado() {
        return calsado;
    }

    public void setCalsado(int calsado) {
        this.calsado = calsado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

package libraries;

public class Teléfono {

    public static String marca = "Apple";
    public static String modelo = "iphone13";
    public static String color = "Gris";
    String tamano;
    String Espacio;
    int precio;

    public Teléfono(String tamano, String espacio, int precio) {
        this.tamano = tamano;
        Espacio = espacio;
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getEspacio() {
        return Espacio;
    }

    public void setEspacio(String espacio) {
        Espacio = espacio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void tomarFoto(){
        System.out.println("Se ha tomado la foto");
    }

    public void hacerLlamada(){
        System.out.println("La llamada ha inicado");
    }

    public void mandarMensaje(){
        System.out.println("El mensaje se ha enviado");
    }
}

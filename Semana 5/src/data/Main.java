package data;

public class Main {

    public static void main(String[] args) {
    /*Edificio torresLara= new Edificio();
    torresLara.funcionaEdificio();
    torresLara.tienePermisos();
    double metrosDeConstrucción;
    metrosDeConstrucción = torresLara.calculaMetros(25.899999000000,35.00000000067);
    System.out.println(metrosDeConstrucción);
    int capacidad= torresLara.perosnas(10, 25, 8);
    System.out.println("La capacidad del edificio es de " + capacidad);

    //Metodo en la clase edificio que se / entre 2
    int aforo= torresLara.capacidadDeAforo(capacidad);
    System.out.println("El aforo al 50% es de " + aforo);*/

    //Clase: acera
    Acera principal = new Acera();
    principal.estado= "Buena condición";
    principal.distancia= 2;
    principal.ancho= 1;
    System.out.println("Acera en "+ principal.estado);
    System.out.println("Distancia de "+ principal.distancia+ " kilometros");
    System.out.println("El ancho es de "+principal.ancho+" metro");
    principal.tránsitoDePersonas();
    principal.cruceDeCalle();
    principal.actividades();
    }
}

package libreria;

public class Main {

    public static void main(String[] args) {
        Edificio torresLara = new Edificio();
        torresLara.funcionaEdificio();
        torresLara.tienePermisos();
        double metrosDeConstruccion;
        metrosDeConstruccion = torresLara.calculametros(25.899999000000,35.00000000067);
        System.out.println(metrosDeConstruccion);
        int capacidad = torresLara.personas(10,25,8);
        System.out.println("La capacidad del edificio es de "+ capacidad);

    }
}

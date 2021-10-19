package libraries;

public class Main {

    public static void main(String[] args) {
        Edificio torresLara = new Edificio();
        torresLara.funcionaEdificio();
        torresLara.tienePermisos();
        double metrosDeConstruccion;
        metrosDeConstruccion = torresLara.calculametros(25.899999000000, 35.0000007);
        System.out.println(metrosDeConstruccion);
        int capacidad = torresLara.personas(10, 200, 8);
        System.out.println("La cpacidad es de: " + capacidad);

        //Logre dividir entre 2

        int cantidadAforo = torresLara.capacidadAforo(capacidad);
        System.out.println("La capacidad con un aforo del 50% es: " + cantidadAforo);

        Acera acera = new Acera();
        acera.material = "cemento";
        acera.color = "gris";
        acera.largo = "10m";

        acera.limpiarAcera();
        acera.pintarAcera();
        acera.repararAcera();




    }
}

package libreria;

public class Main {

    public static void main(String[] args) {

        Edificio torresLara = new Edificio();
        torresLara.funcionaEdificio();
        torresLara.tienePermisos();

        double metrosDeConstrucccion;
        metrosDeConstrucccion = torresLara.calculametros(25.899999000000,35.00000000067);
        System.out.println(metrosDeConstrucccion);

        int capacidad =200;

        int aforo = torresLara.aforo(capacidad);
        System.out.println("El aforo es:  " + aforo);


        Acera SanJose = new Acera();
        SanJose.limpieza();





    }



}

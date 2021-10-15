package libreria;



public class Main {

    public static void main(String[] args) {
       /* Edificio torresLara = new Edificio();
        torresLara.funcionaEdificio();
        torresLara.tienePermisos();

        double metrosDeConstrucccion;
        metrosDeConstrucccion = torresLara.calculametros(25.899999000000,35.00000000067);
        System.out.println(metrosDeConstrucccion);

        int capacidad = torresLara.personas(10,25,8);
        System.out.println("La capacidad del edificio es de "+ capacidad);

        int aforo = torresLara.capacidadDeAforo(capacidad,2);
        System.out.println("La capacidad de aforo del 50% es de"+ aforo);*/

        Acera pasoSeguro = new Acera();
        pasoSeguro.tamano = "Grande";
        pasoSeguro.lugar = "San Jose";
        pasoSeguro.estado= "Buen estado";
        System.out.println(pasoSeguro.estado);
        pasoSeguro.limpiaAcera();
        pasoSeguro.reparaAcera();
        pasoSeguro.pasaPersona();



    }
}
